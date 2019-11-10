package com.acidtango.javaboilerplate;


import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class ComplexNumber {
    private static final String BEGIN_CUSTOM_SEPARATOR_TOKEN = "//";
    private static final String END_CUSTOM_SEPARATOR_TOKEN = ";";
    private static final String DEFAULT_SEPARATOR_TOKEN = ",";
    private final Integer realPart;
    private final Integer complexPart;

    public ComplexNumber(Integer realPart, Integer complexPart) {
        this.realPart = realPart;
        this.complexPart = complexPart;
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

    public static int calculate(String numberString) {
        String separatorToken = getSeparatorToken(numberString);
        String numberStringWithoutSeparator = getNumberStringWithoutSeparator(numberString);

        List<Integer> numbers = parseNumberString(numberStringWithoutSeparator, separatorToken);

        return numbers.stream().mapToInt(t -> t).sum();
    }

    private static String getNumberStringWithoutSeparator(String numberString) {
        if (hasCustomSeparator(numberString)) {
            Integer indexOfStartNumberStringWithoutSeparator = getIndexOfStartNumberStringWithoutSeparator(numberString);
            return numberString.substring(indexOfStartNumberStringWithoutSeparator);
        }
        return numberString;
    }

    private static Integer getIndexOfStartNumberStringWithoutSeparator(String numberString) {
        return getIndexOfEndCustomSeparator(numberString) + 1;
    }

    private static String getSeparatorToken(String numberString) {
        if (hasCustomSeparator(numberString)) {
            return numberString.substring(
                BEGIN_CUSTOM_SEPARATOR_TOKEN.length(),
                getIndexOfEndCustomSeparator(numberString)
            );
        }
        return DEFAULT_SEPARATOR_TOKEN;
    }

    private static boolean hasCustomSeparator(String numberString) {
        return numberString.startsWith(BEGIN_CUSTOM_SEPARATOR_TOKEN);
    }

    private static Integer getIndexOfEndCustomSeparator(String numberString) {
        return numberString.indexOf(END_CUSTOM_SEPARATOR_TOKEN);
    }


    private static List<Integer> parseNumberString(String numberString, String separatorToken) {
        return Arrays.stream(numberString.split(separatorToken))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    public ComplexNumber add(ComplexNumber b) {
        return new ComplexNumber(this.realPart + b.realPart, this.complexPart + b.complexPart);
    }
}
