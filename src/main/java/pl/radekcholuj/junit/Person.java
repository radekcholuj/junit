package pl.radekcholuj.junit;

public class Person {
    private String name;
    private String pesel;

    public Person(String name, String pesel) {
        this.name = name;
        this.pesel = pesel;
    }

    public String getYearFromPesel() {
        return "19"+pesel.substring(0,2);
    }
}

