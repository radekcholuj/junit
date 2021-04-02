import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pl.radekcholuj.junit.Figure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FigureTest {
    @Test
    public void obkwadrat() {
        //given
        double dl = 1;
        // when
        Figure figure = new Figure();
        double obwod = figure.obliczObwod(dl);
        // then
        assertEquals(4, obwod);
    }

    @Test
    public void obkwadrat5_5() {
        //given
        double dl = 5.5;
        // when
        Figure figure = new Figure();
        double obwod = figure.obliczObwod(dl);
        // then
        assertEquals(22, obwod);
    }

    @Test
    public void gdyPodamWartoscMniejszaNiz1() {
        //given
        double dl = -2;
        //when
        Figure figure = new Figure();
        double obwod = figure.obliczObwod(dl);
        //then
        assertEquals(-1, obwod);
    }

    @Test
    public void czy15PodzielnePrzez5() {
        //given
        int a = 15;
        int b = 5;
        //when
        Figure figure = new Figure();
        boolean czyPodzielna = figure.podzielnosc(a, b);
        //then
        assertTrue(czyPodzielna);
    }
    @ParameterizedTest(name = "to jest test {1}")
    @CsvSource({"2, 8", "1, 4", "4, 16", "-100, -1", "3, 12"})
    public void obwodParametrizedTest(double dl, double ob){
        // when
        Figure figure = new Figure();
        double obwod = figure.obliczObwod(dl);
        // then
        assertEquals(ob, obwod);
    }
    @Test
    public void pole(){
        double a = 2;
        Figure figure = new Figure();
        double pole = figure.pole(a);
        assertEquals(4, pole);
    }
    @Test
    public void pole5_5() {
        //given
        double a = 5.5;
        // when
        Figure figure = new Figure();
        double obwod = figure.pole(a);
        // then
        assertEquals(30.25, obwod);
    }
    @ParameterizedTest(name = "to jest pole {1}")
    @CsvSource({"2, 4", "1, 1", "4, 16", "-100, -1", "3, 9"})
    public void poleParametrizedTest(double a, double p){
        // when
        Figure figure = new Figure();
        double pole = figure.pole(a);
        // then
        assertEquals(p, pole);
    }
}
