package org.incyde.fp.monads;

import java.util.function.Function;

public class Identity<T> {
    private final T value;

    public Identity(T value) {
        this.value = value;
    }

    public <U> Identity<U> bind(Function<T, Identity<U>> transform) {
        return transform.apply(value);
    }

    @Override
    public String toString() {
        return String.format("Identity(%s)", value.toString());
    }
}
