package org.jooq.impl;

import org.jooq.Context;
import org.jooq.Function0;
import org.jooq.QueryPart;

final class ConnectByIsCycle extends AbstractField<Boolean> implements QOM.ConnectByIsCycle {
    ConnectByIsCycle() {
        super(Names.N_CONNECT_BY_ISCYCLE,
                Tools.allNotNull(SQLDataType.BOOLEAN));
    }

    @Override
    public final void accept(Context<?> ctx) {
        ctx.visit((QueryPart) Names.N_CONNECT_BY_ISCYCLE);
    }

    @Override
    public final Function0<? extends QOM.ConnectByIsCycle> $constructor() {
        return () -> new ConnectByIsCycle();
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.ConnectByIsCycle) {
            QOM.ConnectByIsCycle o = (QOM.ConnectByIsCycle) that;
            return true;
        }
        return super.equals(that);
    }
}