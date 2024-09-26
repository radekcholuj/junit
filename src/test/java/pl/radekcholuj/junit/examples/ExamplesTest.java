package pl.radekcholuj.junit.examples;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class ExamplesTest {

    @ParameterizedTest(name = "Person with age {0} is not adult.")
    @ValueSource(ints = {11, 2, 5, 10, 12, 15, 5})
    public void isNotAdult(int age){
        // when
        boolean isAdult = Examples.isAdult(age);

        // then
        assertFalse(isAdult);
    }

    @ParameterizedTest(name = "Person with age {0} is adult.")
    @ValueSource(ints = {100, 44, 81, 19, 18, 51})
    public void isAdult(int age){
        // when
        boolean isAdult = Examples.isAdult(age);

        // then
        assertTrue(isAdult);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({"55,5,60","8,10,18","-10,10,0"})
    public void isCorrectSum(int a, int b, int expectedResult){
        // when
        int result = Examples.sum(a, b);

        // then
        assertEquals(expectedResult, result);
    }

    @RepeatedTest(100)
    public void isFrom5To100(){
        // when
        int number = Examples.randFrom5To100();

        // then
        assertTrue(number >= 5 && number <= 100);
    }

}
