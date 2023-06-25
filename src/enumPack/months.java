package enumPack;

public enum months {

    JANUARY("1"), FEBRUARY("2"),
    MARCH("3"), APRIL("4"),
    MAY("5"), JUNE("6"),
    JULY("7"), AUGUST("8"), SEPTEMBER("9"),
    OCTOBER("10"), NOVEMBER("11"), DECEMBER("12");

    private String str;

    months(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    private static final months[] arr = values();

    public static void enumName() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
