package pl.radekcholuj.junit.numberlength;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberLengthTest {
    @Test
    public void isNotValidIfLength4FromString(){
        //given
        String number = "1234";

        //when
        boolean isValid = NumberLength.numberValidatorString(number);

        //then
        assertFalse(isValid);
    }

    @Test
    public void isNotValidIfLength2FromString(){
        //given
        String number = "12";

        //when
        boolean isValid = NumberLength.numberValidatorString(number);

        //then
        assertFalse(isValid);
    }

    @Test
    public void isValidIfNumberLegth2String(){
        //given
        String number = "123";

        //when
        boolean isValid = NumberLength.numberValidatorString(number);

        //then
        assertTrue(isValid);
    }

    @Test
    public void isValidIfNumberLength3FromInteger(){
        //given
        int number = 123;

        //when
        boolean isValid = NumberLength.numberValidatorInteger(number);

        //then
        assertTrue(isValid);
    }
}
