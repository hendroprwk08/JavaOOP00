import java.util.ArrayList; 

public class MainKendaraan {
    static ArrayList<Kendaraan> kendaraanList = new ArrayList<>();

    public static void main(String[] args) {
        //penambahan data
        kendaraanList.add(new Kendaraan("Agya", "Daihatsu", 1400));
        kendaraanList.add(new Kendaraan("Xpander", "Mistubishi", 1400));
        kendaraanList.add(new Kendaraan("Fortuner", "Toyota", 3100));
        kendaraanList.add(new Kendaraan("Pajero", "Mitsubishi", 3400));
        System.out.println("--- seluruh data");
        detil();

        //hapus index ke-1
        kendaraanList.remove(1);
        System.out.println("--- Hapus index Ke-1");
        detil();

        //hapus semua
        System.out.println("--- Hapus semua");
        kendaraanList.clear();
        detil();
        
        // Kendaraan mobil = new Kendaraan("Fiesta", "Ford", 2400);
        // mobil.nama = "Fiesta";
        // mobil.merek = "Ford";
        // mobil.cc = 2400;
        // mobil.getInfo();
        // int biaya = mobil.biaya(2, 12500);
        // System.out.println("Bensin: "+ biaya);
        // System.out.println("Total: "+ (biaya + 1000));        
    }

    public static void detil() {
        //tampilkan
        for (int i = 0; i < kendaraanList.size(); i++) {
            System.out.println( i 
            + " " + kendaraanList.get(i).getNama() 
            + " " + kendaraanList.get(i).getMerek()
            + " " + kendaraanList.get(i).getCc());
        }
    }
}
