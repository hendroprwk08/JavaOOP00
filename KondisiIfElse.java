public class KondisiIfElse {
    public static void main(String[] args) {
        int nilai;
        String nama;

        // mengambil input
        System.out.print("Nama: ");
        nama = "Marzuki";
        System.out.print("Nilai: ");
        nilai = 70;

        // cek apakah dia lulus atau tidak
        if( nilai >= 70 ) {
            System.out.println("Selamat " + nama + ", anda lulus!");
        } else {
            System.out.println("Maaf " + nama + ", anda gagal");
        }

    }
}
