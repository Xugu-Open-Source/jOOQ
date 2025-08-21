package org.jooq.impl;

import org.jooq.Context;
import org.jooq.Function0;
import org.jooq.QueryPart;

final class ConnectByIsLeaf extends AbstractField<Boolean> implements QOM.ConnectByIsLeaf {
  ConnectByIsLeaf() {
    super(Names.N_CONNECT_BY_ISLEAF,
        Tools.allNotNull(SQLDataType.BOOLEAN));
  }

  @Override
  public final void accept(Context<?> ctx) {
    ctx.visit((QueryPart)Names.N_CONNECT_BY_ISLEAF);
  }

  @Override
  public final Function0<? extends QOM.ConnectByIsLeaf> $constructor() {
    return () -> new ConnectByIsLeaf();
  }

  @Override
  public boolean equals(Object that) {
    if (that instanceof QOM.ConnectByIsLeaf) {
      QOM.ConnectByIsLeaf o = (QOM.ConnectByIsLeaf)that;
      return true;
    } 
    return super.equals(that);
  }
}