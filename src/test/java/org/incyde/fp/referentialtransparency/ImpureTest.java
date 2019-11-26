package org.incyde.fp.referentialtransparency;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ImpureTest {
    @Test
    void not_be_referential_transparent_1() {
        Impure impure = new Impure();
        assertEquals(13, impure.foo(2) + impure.foo(2));
    }

    @Test
    void not_be_referential_transparent_2() {
        Impure impure = new Impure();
        assertEquals(12, 2 * impure.foo(2));
    }
}