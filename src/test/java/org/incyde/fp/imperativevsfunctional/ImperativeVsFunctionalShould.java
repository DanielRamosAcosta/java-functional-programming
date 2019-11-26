package org.incyde.fp.imperativevsfunctional;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImperativeVsFunctionalShould {
    @Test
    void main_imperative() {
        assertEquals(90, ImperativeVsFunctional.imperative());
    }

    @Test
    void main_functional() {
        assertEquals(90, ImperativeVsFunctional.functional());
    }
}