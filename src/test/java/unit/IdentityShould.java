package unit;

import com.acidtango.javaboilerplate.monads.Identity;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IdentityShould {
    @Test
    void be_convertible_to_string() {
        Identity<Integer> identity = new Identity<>(123);

        assertEquals("Identity(123)", identity.toString());
    }

    @Test
    void be_bindable() {
        Identity identity = new Identity<>(3)
                .bind((n) -> new Identity<>(n + 3))
                .bind((n) -> new Identity<>(n + 2));

        assertEquals("Identity(8)", identity.toString());
    }
}
