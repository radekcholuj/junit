package pl.radekcholuj.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    public void isNotVaildIfLength4() {
        // given
        String pesel = "1511";

        // when
        boolean isValid = Validator.peselValidation(pesel);

        // then
        assertFalse(isValid);
    }
}

