package com.acidtango.javaboilerplate.numbers;


import java.util.Objects;

public class Complex {
    private final Integer realPart;
    private final Integer complexPart;

    public Complex(Integer realPart, Integer complexPart) {
        this.realPart = realPart;
        this.complexPart = complexPart;
    }

    @Override
    public String toString() {
        String middleSymbol = complexPart < 0 ? "-" : "+";

        return String.format("%d %s %di", realPart, middleSymbol, Math.abs(complexPart));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Complex complex = (Complex) o;
        return realPart.equals(complex.realPart) &&
                complexPart.equals(complex.complexPart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realPart, complexPart);
    }


    public Complex add(Complex b) {
        return new Complex(realPart + b.realPart, complexPart + b.complexPart);
    }

    public Complex subtract(Complex b) {
        return new Complex(realPart - b.realPart, complexPart - b.complexPart);
    }
}
