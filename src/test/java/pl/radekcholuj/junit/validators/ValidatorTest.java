package pl.radekcholuj.junit.validators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    public void isNotVaildIfLength4(){
        // given
        String pesel = "1511";

        // when
        boolean isValid = Validator.peselValidation(pesel);

        // then
        assertFalse(isValid);
    }

    @Test
    public void isValidIfLenght11(){
        // given
        String pesel = "15110112532";

        // when
        boolean isValid = Validator.peselValidation(pesel);

        // then
        assertTrue(isValid);
    }

    @Test
    public void isValidDayIfFrom1To31(){
        // given
        String pesel = "15110412532";

        // when
        boolean isValid = Validator.peselValidation(pesel);

        // then
        assertTrue(isValid);
    }

    @Test
    public void isNotValidDayIfEquals44(){
        // given
        String pesel = "15114412532";

        // when
        boolean isValid = Validator.peselValidation(pesel);

        // then
        assertFalse(isValid);
    }
}

