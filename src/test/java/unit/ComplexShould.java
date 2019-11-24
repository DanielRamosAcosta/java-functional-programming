package unit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.acidtango.javaboilerplate.numbers.Complex;
import org.junit.jupiter.api.Test;

class ComplexShould {
    @Test
    void be_convertible_to_string() {
        assertEquals("1 + 2i", new Complex(1, 2).toString());
        assertEquals("1 - 2i", new Complex(1, -2).toString());
        assertEquals("-1 - 2i", new Complex(-1, -2).toString());
    }

    @Test
    void be_comparable_to_other_complex() {
        assertEquals(new Complex(1, 1), new Complex(1, 1));
    }

    @Test
    void be_added_to_other_complex_number() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);

        Complex c = a.add(b);

        assertEquals(new Complex(3, 3), c);
    }

    @Test
    void be_subtracted_to_other_complex_number() {
        Complex a = new Complex(1, 1);
        Complex b = new Complex(2, 2);

        Complex c = a.subtract(b);

        assertEquals(c, new Complex(-1, -1));
    }
}
