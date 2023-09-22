public class Method {
    public static void main(String[] args) {
        
        cetak();
        
        //dengan parameter
        nama("Jonathan", 35);
        
        //dengan return
        System.out.println("Hasil: "+ jumlah(23, 10));
    }

    private static int jumlah(int i, int j) {
        return i + j;
    }

    private static void nama(String nama, int usia) {
        System.out.println("Namaku "+ nama +" berusia "+ usia + " tahun");
    }

    static void cetak() {
        System.out.println("Guten Morgen");
    }
}
