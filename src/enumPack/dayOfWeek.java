package enumPack;

public enum dayOfWeek {

    MONDAY("Monday"), TUESDAY("Tuesday"), WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"), FRIDAY("Friday"), SATURDAY("Saturday"), SUNDAY("Sunday");

    private String name;

    private static final dayOfWeek[] arr = values();

    dayOfWeek(String name) {
        this.name = name;
    }

    public dayOfWeek nextDay() {
        return arr[(this.ordinal() + 1) % arr.length];
    }
}
