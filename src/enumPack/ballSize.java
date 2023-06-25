package enumPack;

public enum ballSize {
    EXTRA_SMALL(150), SMALL(240), MEDIUM(360), LARGE(500), EXTRA_LARGE(600);

    private int weight;

    ballSize(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    private static final ballSize[] arr = values();

    public static void getArr() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Size: " + arr[i]);
            System.out.println("Weight: " + arr[i].weight);
        }
    }

    public void getObject() {
        System.out.println(arr[this.ordinal()]);
    }
}
