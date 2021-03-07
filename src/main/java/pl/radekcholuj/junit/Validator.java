package pl.radekcholuj.junit;

public final class Validator {

    public static boolean peselValidation(String pesel) {
        return pesel.length() == 11 && validDay(pesel.substring(4,6));
    }

    private static boolean validDay(String day) {
        int dayNumber = Integer.parseInt(day);
        return dayNumber >= 1 && dayNumber <= 31;
    }
}