package org.incyde.fp.referentialtransparency;

public class Impure {
    private Integer counter = 3;

    Integer foo(Integer x) {
        counter += 1;
        return x + counter;
    }
}
