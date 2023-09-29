import java.util.ArrayList;

public class MainKendaraan {
    static ArrayList<Kendaraan> kendaraanList = new ArrayList<>();

    public static void main(String[] args) {
        // Kendaraan mobil = new Kendaraan();
        // mobil.nama = "Fiesta";
        // mobil.merek = "Ford";
        // mobil.cc = 2400;

        // Kendaraan mobil = new Kendaraan("Fiesta", "Ford", 2400);
        // mobil.getInfo();
        // int biaya = mobil.biaya(2, 12500);
        // System.out.println("Bensin: "+ biaya);
        // System.out.println("Total: "+ (biaya + 1000));

        // tambah data kendaraan
        kendaraanList.add(new Kendaraan("Xpander", "Mitsubishi", 1499 ));
        kendaraanList.add(new Kendaraan("Stargazer ", "Hyundai ", 1400));
        kendaraanList.add(new Kendaraan("Agya", "Daihatsu", 1300));
        kendaraanList.add(new Kendaraan("Corolla", "Toyota", 2400));
        kendaraanList.add(new Kendaraan("Avanza", "Toyota", 1400));
        kendaraanList.add(new Kendaraan("Ertiga Hybrid", "Suzuki", 1400));

        // tampilkan
        System.out.println("---tampilkan seluruh data---");
        detil();

        // hapus baris tertentu, misalnya index ke-2
        kendaraanList.remove(1);
        System.out.println("---hapus index 1---");
        detil();

        // hapus semua
        System.out.println("---data sudah dihapus semua---");
        kendaraanList.clear();
        detil(); //tak ada data
    }

    static void detil() {
        for (int i = 0; i < kendaraanList.size(); i++) {
            System.out.print(i);
            System.out.print(" "+ kendaraanList.get(i).getNama());
            System.out.print(" "+ kendaraanList.get(i).getMerek());
            System.out.println(" "+ kendaraanList.get(i).getCc());
        }
    }
}
