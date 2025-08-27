/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package org.jooq.meta.xugu;

import com.alibaba.druid.DbType;
import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.SQLDataType;
import com.alibaba.druid.sql.ast.SQLParameter;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLCreateFunctionStatement;
import com.alibaba.druid.sql.ast.statement.SQLCreateProcedureStatement;
import org.jooq.meta.AbstractRoutineDefinition;
import org.jooq.meta.DataTypeDefinition;
import org.jooq.meta.DefaultDataTypeDefinition;
import org.jooq.meta.DefaultParameterDefinition;
import org.jooq.meta.InOutDefinition;
import org.jooq.meta.PackageDefinition;
import org.jooq.meta.ParameterDefinition;
import org.jooq.meta.SchemaDefinition;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

import static org.jooq.impl.DSL.name;
import static org.jooq.meta.mysql.information_schema.Tables.PARAMETERS;

/**
 * 存储过程与存储函数
 */
public class XuGuRoutineDefinition extends AbstractRoutineDefinition {

    private final boolean pipelined;

    private String define;

    private String retType;

    public XuGuRoutineDefinition(SchemaDefinition schema, String name, String comment, String define, String retType) {
        this(schema, name, comment, define, retType, false);
    }

    public XuGuRoutineDefinition(SchemaDefinition schema, String name, String comment, String define, String retType, boolean pipelined) {
        super(schema, null, name, comment, null);
        this.pipelined = pipelined;
        this.define = define;
        this.retType = retType;
    }

    @Override
    protected void init0() throws SQLException {
        List<SQLStatement> statementList = SQLUtils.parseStatements(define, DbType.xugu, true);
        SQLStatement stmt = statementList.get(0);
        if (retType != null) {
            SQLCreateFunctionStatement funStmt = (SQLCreateFunctionStatement) stmt;
            for (int i = 0; i < funStmt.getParameters().size(); i++) {
                SQLParameter p = funStmt.getParameters().get(i);
                boolean hasDefaultValue = p.getDefaultValue() != null;
                DataTypeDefinition type = new DefaultDataTypeDefinition(
                        getDatabase(),
                        getSchema(),
                        p.getDataType().getName(),
                        null,
                        null,
                        null,
                        null,
                        // 没有实际用处，内容正确性不作处理
                        hasDefaultValue ? p.getDefaultValue().toString() : null
                );
                SQLParameter.ParameterType paramType = p.getParamType();
                ParameterDefinition parameter = new DefaultParameterDefinition(
                        this,
                        p.getName().getSimpleName(),
                        i,
                        type,
                        hasDefaultValue
                );
                addParameter(InOutDefinition.getFromString(paramType != null ? paramType.name() : null), parameter);

            }
            DataTypeDefinition type = new DefaultDataTypeDefinition(
                    getDatabase(),
                    getSchema(),
                    retType
            );
            returnValue = new DefaultParameterDefinition(this, "RETURN_VALUE", -1, type);
        } else {
            SQLCreateProcedureStatement proStmt = (SQLCreateProcedureStatement) stmt;
            for (int i = 0; i < proStmt.getParameters().size(); i++) {
                SQLParameter p = proStmt.getParameters().get(i);
                boolean hasDefaultValue = p.getDefaultValue() != null;
                DataTypeDefinition type = new DefaultDataTypeDefinition(
                        getDatabase(),
                        getSchema(),
                        p.getDataType().getName(),
                        null,
                        null,
                        null,
                        null,
                        hasDefaultValue ? p.getDefaultValue().toString() : null
                );

                ParameterDefinition parameter = new DefaultParameterDefinition(
                        this,
                        p.getName().getSimpleName(),
                        i,
                        type,
                        hasDefaultValue);
                SQLParameter.ParameterType paramType = p.getParamType();
                addParameter(InOutDefinition.getFromString(paramType != null ? paramType.name() : null), parameter);
            }
        }

    }
}
