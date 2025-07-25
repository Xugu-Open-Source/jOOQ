package org.jooq.impl;

import java.util.Set;
import org.jooq.Context;
import org.jooq.Field;
import org.jooq.GroupField;
import org.jooq.QueryPart;
import org.jooq.SQLDialect;
import org.jooq.Table;
import org.jooq.UniqueKey;

final class GroupFieldList extends QueryPartList<GroupField> {
  static final Set<SQLDialect> NO_SUPPORT_GROUP_BY_TABLE = SQLDialect.supportedBy(
          new SQLDialect[]{SQLDialect.DERBY, SQLDialect.FIREBIRD, SQLDialect.H2, SQLDialect.HSQLDB, SQLDialect.MARIADB, SQLDialect.MYSQL, SQLDialect.SQLITE,});

  static final Set<SQLDialect> NO_SUPPORT_GROUP_FUNCTIONAL_DEP = SQLDialect.supportedBy(
          new SQLDialect[]{SQLDialect.DERBY, SQLDialect.FIREBIRD,});
  
  GroupFieldList() {}
  
  GroupFieldList(Iterable<? extends GroupField> wrappedList) {
    super(wrappedList);
  }
  
  GroupFieldList(GroupField[] wrappedList) {
    super(wrappedList);
  }
  
  final boolean canAdd(GroupField e) {
    return (super.canAdd(e) && !(e instanceof NoField));
  }
  
  public final boolean rendersContent(Context<?> ctx) {
    return true;
  }
  
  protected final void toSQLEmptyList(Context<?> ctx) {
    // ctx.visit((QueryPart)DSL.emptyGroupingSet());
  }
  
  protected final void acceptElement(Context<?> ctx, GroupField part) {
/*    if (part instanceof Table) {
      Table<?> t = (Table)part;
      if (NO_SUPPORT_GROUP_BY_TABLE.contains(ctx.dialect())) {
        Field[] arrayOfField = (Field[])fields(ctx, t);
        if (arrayOfField.length > 1) {
          ctx.visit(QueryPartListView.wrap(arrayOfField));
        } else if (arrayOfField.length == 1) {
          ctx.visit(arrayOfField[0]);
        } else {
          super.acceptElement(ctx, part);
        } 
      } else {
        super.acceptElement(ctx, part);
      } 
    } else if (ctx.family() == SQLDialect.DATABRICKS && part instanceof AbstractRow) {
      AbstractRow<?> r = (AbstractRow)part;
      r.acceptDefault(ctx);
    } else {
      super.acceptElement(ctx, part);
    } */
  }
  
  private final Field<?>[] fields(Context<?> ctx, Table<?> t) {
    UniqueKey<?> pk = t.getPrimaryKey();
    if (pk == null || NO_SUPPORT_GROUP_FUNCTIONAL_DEP.contains(ctx.dialect()))
      return (Field<?>[])t.fields(); 
    return (Field<?>[])t.fields((Field[])pk.getFieldsArray());
  }
}