package com.acidtango.javaboilerplate;


import java.util.Objects;

public class ComplexNumber {
    private final Integer realPart;
    private final Integer complexPart;

    public ComplexNumber(Integer realPart, Integer complexPart) {
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
        ComplexNumber complexNumber = (ComplexNumber) o;
        return realPart.equals(complexNumber.realPart) &&
                complexPart.equals(complexNumber.complexPart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realPart, complexPart);
    }


    public ComplexNumber add(ComplexNumber b) {
        return new ComplexNumber(realPart + b.realPart, complexPart + b.complexPart);
    }

    public ComplexNumber subtract(ComplexNumber b) {
        return new ComplexNumber(realPart - b.realPart, complexPart - b.complexPart);
    }
}
