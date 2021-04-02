package pl.radekcholuj.junit;

public class Figure {

    public double obliczObwod(double dl) {
        return dl < 0 ? -1 : 4 * dl;
    }

    public boolean podzielnosc(int a, int b) {
        return a % b == 0;
    }

    public double pole(double a) {
        return a < 0 ? -1 : a * a;
    }
}
