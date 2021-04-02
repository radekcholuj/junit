package pl.radekcholuj.junit.math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ArrayCalculationTest{

    @Test
    public void minValueIs1(){
        // given
        int[] tab = {4, 6, 1, 2, 666};

        // when
        int min = ArrayCalculation.min(tab);

        // then
        assertEquals(1, min);
    }

    @Test
    public void minValueIsMinus5(){
        // given
        int[] tab = {4, 16, -5, 2, 26};

        // when
        int min = ArrayCalculation.min(tab);

        // then
        assertEquals(-5, min);
    }

    @Test
    public void minValueIs1000(){
        // given
        int[] tab = {112304, 21431, 1415412, 66123, 1000, 456323};

        // when
        int min = ArrayCalculation.min(tab);

        // then
        assertEquals(1000, min);
    }

    @Test
    public void minValueIsNot1000(){
        // given
        int[] tab = {112304, 21431, 1415412, 66123, -500, 1000, 456323};

        // when
        int min = ArrayCalculation.min(tab);

        // then
        assertNotEquals(1000, min);
    }

    @Test
    public void maxValueIs1415412(){
        // given
        int[] tab = {112304, 21431, 1415412, 66123, 1000, 456323};

        // when
        int max = ArrayCalculation.max(tab);

        // then
        assertEquals(1415412, max);
    }

    @Test
    public void maxValueIs666(){
        // given
        int[] tab = {4, 6, 1, 2, 666};

        // when
        int max = ArrayCalculation.max(tab);

        // then
        assertEquals(666, max);
    }

    @Test
    public void maxValueIsNot1000(){
        // given
        int[] tab = {112304, 21431, 1415412, 66123, -500, 1000, 456323};

        // when
        int max = ArrayCalculation.max(tab);

        // then
        assertNotEquals(1000, max);
    }


    @Test
    public void avgOf1111is1(){
        // given
        int[] tab = {1, 1, 1, 1};

        // when
        int avg = ArrayCalculation.avg(tab);

        // then
        assertEquals(1, avg);
    }

    @Test
    public void avgOf24And42Is33(){
        // given
        int[] tab = {24,42};

        // when
        int avg = ArrayCalculation.avg(tab);

        // then
        assertEquals(33, avg);
    }

    @Test
    public void avgOf24And42IsNot3(){
        // given
        int[] tab = {24,42};

        // when
        int avg = ArrayCalculation.avg(tab);

        // then
        assertNotEquals(3, avg);
    }

    @Test
    public void medianOf421is2(){
        // given
        int[] tab = {4, 2, 1};

        // when
        double median = ArrayCalculation.median(tab);

        // then
        assertEquals(2, median);
    }

    @Test
    public void medianIs77(){
        // given
        int[] tab = {100, 1, 92, 77, 4};

        // when
        double median = ArrayCalculation.median(tab);

        // then
        assertEquals(77, median);
    }

    @Test
    public void medianOf5125is3coma5(){
        // given
        int[] tab = {5, 1, 2, 5};

        // when
        double median = ArrayCalculation.median(tab);

        // then
        assertEquals(3.5, median);
    }
}
