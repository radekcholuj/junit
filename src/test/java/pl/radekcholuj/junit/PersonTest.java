package pl.radekcholuj.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @ParameterizedTest
    @CsvSource({"Jurek, 99012113242, 1999", "Kasia, 88021112312, 1988", "Marek, 15212113242, 2015", "Julia, 02221112312, 2002"})
    public void isCorrectYear(String name, String pesel, String year) {
        // given
        Person person = new Person(name, pesel);

        // when
        String yearResult = person.getYearFromPesel();

        // then
        assertEquals(year, yearResult);
    }

    @ParameterizedTest
    @CsvSource({"Marian, 12012113242, 1982", "Maria, 41021112312, 1992", "Jacek, 72123012312, 1918"})
    public void isIncorrectYear(String name, String pesel, String year) {
        // given
        Person person = new Person(name, pesel);

        // when
        String yearResult = person.getYearFromPesel();

        // then
        assertNotEquals(year, yearResult);
    }

}
