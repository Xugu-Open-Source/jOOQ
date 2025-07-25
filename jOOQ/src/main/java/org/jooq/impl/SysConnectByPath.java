package org.jooq.impl;

import org.jooq.Context;
import org.jooq.Field;
// import org.jooq.Function2;
import org.jooq.tools.StringUtils;

final class SysConnectByPath extends AbstractField<String> implements QOM.SysConnectByPath {
  final Field<?> field;
  
  final String separator;
  
  SysConnectByPath(Field<?> field, String separator) {
    super(Names.N_SYS_CONNECT_BY_PATH, Tools.allNotNull(SQLDataType.VARCHAR, field));
    this.field = Tools.nullSafeNotNull(field, SQLDataType.OTHER);
    this.separator = separator;
  }
  
  final boolean parenthesised(Context<?> ctx) {
    return true;
  }
  
  public final void accept(Context<?> ctx) {
    ctx.visit(DSL.function(Names.N_SYS_CONNECT_BY_PATH, getDataType(), (Field<?>[])new Field[] { this.field, (Field)DSL.inline(this.separator) }));
  }

  private final void acceptJava(Context<?> ctx) {
    ctx.sql("sysConnectByPath(");
    String s = "";
    ctx.sql(s).visit(this.field);
    s = ", ";
    ctx.sql(s).visit((Field)DSL.inline(this.separator));
    s = ", ";
    ctx.sql(')');
  }
  
  public final Field<?> $arg1() {
    return this.field;
  }
  
  public final String $arg2() {
    return this.separator;
  }
  
/*  public final QOM.SysConnectByPath $arg1(Field<?> newValue) {
    return (QOM.SysConnectByPath)$constructor().apply(newValue, $arg2());
  }*/
  
/*  public final QOM.SysConnectByPath $arg2(String newValue) {
    return (QOM.SysConnectByPath)$constructor().apply($arg1(), newValue);
  }*/
  
/*  public final Function2<? super Field<?>, ? super String, ? extends QOM.SysConnectByPath> $constructor() {
    return (a1, a2) -> new SysConnectByPath(a1, a2);
  }*/
  
  public boolean equals(Object that) {
    if (that instanceof QOM.SysConnectByPath) {
      QOM.SysConnectByPath o = (QOM.SysConnectByPath)that;
      return (
        StringUtils.equals($field(), o.$field()) && 
        StringUtils.equals($separator(), o.$separator()));
    } 
    return super.equals(that);
  }
}
