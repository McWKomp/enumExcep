package enumPack;

public enum RGB {
    RED(255, 0, 0), ORANGE(255, 127, 0), YELLOW(255, 255, 0),
    GREEN(0, 255, 0), BLUE(0, 0, 255), INDIGO(70, 0, 130), VIOLET(188, 0, 211);

    private int R;
    private int G;
    private int B;

    RGB(int R, int G, int B) {
        this.R = R;
        this.G = G;
        this.B = B;

    }

    private static final RGB[] arr = values();

    public static void getArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Color: " + arr[i]);
            System.out.println("RGB palette: " + "(" + arr[i].R + ", " + arr[i].G + ", " + arr[i].B + ");");
        }
    }

    public void getObject() {
        System.out.println(arr[this.ordinal()]);
        System.out.println("(" + arr[this.ordinal()].R + ", " + arr[this.ordinal()].G + ", " + arr[this.ordinal()].B + ");");
    }
}
