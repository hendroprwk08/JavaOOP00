public class KondisiIf {
    public static void main(String[] args) {
        int belanja = 0;

        belanja = 20000;

        System.out.println("Total belanja Anda: "+ belanja);
        // cek apakah dia belanja di atas 100000
        if ( belanja > 10000 ) {
            System.out.println("Selamat, anda mendapatkan hadiah!");
        }

        System.out.println("Terima kasih...");
    }
}
