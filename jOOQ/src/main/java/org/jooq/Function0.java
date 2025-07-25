package org.jooq;

import java.util.function.Supplier;

@FunctionalInterface
public interface Function0<R> extends Supplier<R> {
    default R get() {
        return (R)this.apply();
    }

    R apply();
}