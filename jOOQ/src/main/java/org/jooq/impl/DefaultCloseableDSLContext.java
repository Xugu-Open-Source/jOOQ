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
package org.jooq.impl;

import org.jooq.CloseableDSLContext;
import org.jooq.ConnectionProvider;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.jooq.tools.jdbc.JDBCUtils;

/**
 * An extension of {@link DefaultDSLContext} that implements also the
 * {@link CloseableDSLContext} contract.
 */
public class DefaultCloseableDSLContext extends DefaultDSLContext implements CloseableDSLContext {

    /**
     * Generated UID
     */
    private static final long serialVersionUID = -6315025485115195218L;

    public DefaultCloseableDSLContext(ConnectionProvider connectionProvider, SQLDialect dialect, Settings settings) {
        super(connectionProvider, dialect, settings);
    }

    public DefaultCloseableDSLContext(ConnectionProvider connectionProvider, SQLDialect dialect) {
        super(connectionProvider, dialect);
    }

    // -------------------------------------------------------------------------
    // XXX AutoCloseable
    // -------------------------------------------------------------------------

    @Override
    public void close() {
        ConnectionProvider cp = configuration().connectionProvider();

        if (cp instanceof DefaultConnectionProvider) {
            DefaultConnectionProvider dcp = (DefaultConnectionProvider) cp;

            if (dcp.finalize) {
                JDBCUtils.safeClose(dcp.connection);
                dcp.connection = null;
            }
        }
    }
}
