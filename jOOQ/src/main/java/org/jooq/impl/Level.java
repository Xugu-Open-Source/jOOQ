package org.jooq.impl;

import org.jooq.Context;
import org.jooq.Function0;

final class Level extends AbstractField<Integer> implements NamedField<Integer>, QOM.Level {
    Level() {
        super(Names.N_LEVEL, Tools.allNotNull(SQLDataType.INTEGER));
    }

    public final void accept(Context<?> ctx) {
        ctx.visit(Names.N_LEVEL);
    }

    private final void acceptJava(Context<?> ctx) {
        ctx.sql("level()");
    }

    public final Function0<? extends QOM.Level> $constructor() {
        return () -> new Level();
    }

    public boolean equals(Object that) {
        if (that instanceof QOM.Level) {
            QOM.Level o = (QOM.Level) that;
            return true;
        } else {
            return super.equals(that);
        }
    }
}