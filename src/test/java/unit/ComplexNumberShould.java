package unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.acidtango.javaboilerplate.ComplexNumber;
import org.junit.jupiter.api.Test;

class ComplexNumberShould {
    @Test
    void be_convertible_to_string() {
        assertEquals("1 + 2i", new ComplexNumber(1, 2).toString());
        assertEquals("1 - 2i", new ComplexNumber(1, -2).toString());
        assertEquals("-1 - 2i", new ComplexNumber(-1, -2).toString());
    }

    @Test
    void be_comparable_to_other_complex() {
        assertEquals(new ComplexNumber(1, 1), new ComplexNumber(1, 1));
    }

    @Test
    void be_added_to_other_complex_number() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(2, 2);

        ComplexNumber c = a.add(b);

        assertEquals(new ComplexNumber(3, 3), c);
    }

    @Test
    void be_subtracted_to_other_complex_number() {
        ComplexNumber a = new ComplexNumber(1, 1);
        ComplexNumber b = new ComplexNumber(2, 2);

        ComplexNumber c = a.subtract(b);

        assertEquals(c, new ComplexNumber(-1, -1));
    }
}
