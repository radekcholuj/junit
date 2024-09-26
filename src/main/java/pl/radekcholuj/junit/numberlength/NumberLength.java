package pl.radekcholuj.junit.numberlength;

public class NumberLength {

    public static boolean numberValidatorString(String number) {
        return number.length() == 3;
    }

    public static boolean numberValidatorInteger(int number) {
        String strNumber = String.valueOf(number);
        return strNumber.length() ==3;

    }
}
