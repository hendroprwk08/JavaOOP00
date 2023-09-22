public class Loop {
    public static void main(String[] args) {
        int ulang = 10;

        for (int i = 0; i <= ulang; i++) {
            System.out.println("*");
        }

        System.out.println("-- LOOP BERSARANG --");
        for (int i = 1; i < ulang; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
