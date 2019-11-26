package org.incyde.fp.excercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IpValidatorShould {
    @Test
    void accept_valid_ips() {
        assertTrue(IpValidator.isValid("0.0.0.0"));
        assertTrue(IpValidator.isValid("12.255.56.1"));
        assertTrue(IpValidator.isValid("137.255.156.100"));
    }

    @Test
    void rejects_invalid_ips() {
        assertFalse(IpValidator.isValid(""));
        assertFalse(IpValidator.isValid(""));
        assertFalse(IpValidator.isValid("abc.def.ghi.jkl"));
        assertFalse(IpValidator.isValid("123.456.789.0"));
        assertFalse(IpValidator.isValid("12.34.56"));
        assertFalse(IpValidator.isValid("01.02.03.04"));
        assertFalse(IpValidator.isValid("256.1.2.3"));
        assertFalse(IpValidator.isValid("1.2.3.4.5"));
        assertFalse(IpValidator.isValid("123,45,67,89"));
        assertFalse(IpValidator.isValid("1e0.1e1.1e2.2e2"));
        assertFalse(IpValidator.isValid(" 1.2.3.4"));
        assertFalse(IpValidator.isValid("1.2.3.4 "));
        assertFalse(IpValidator.isValid("12.34.56.-7"));
        assertFalse(IpValidator.isValid("1.2.3.4\\n"));
        assertFalse(IpValidator.isValid("\\n1.2.3.4"));
    }
}
