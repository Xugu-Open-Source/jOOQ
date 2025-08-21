package org.jooq.impl;

import org.jooq.Context;
import org.jooq.Function0;

final class Level extends AbstractField<Integer> implements NamedField<Integer>, QOM.Level {
    Level() {
        super(Names.N_LEVEL, Tools.allNotNull(SQLDataType.INTEGER));
    }

    @Override
    public final void accept(Context<?> ctx) {
        ctx.visit(Names.N_LEVEL);
    }

    @Override
    public final Function0<? extends QOM.Level> $constructor() {
        return () -> new Level();
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.Level) {
            QOM.Level o = (QOM.Level) that;
            return true;
        } else {
            return super.equals(that);
        }
    }
}