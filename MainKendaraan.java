public class MainKendaraan {

    public static void main(String[] args) {
        Kendaraan motor = new Kendaraan();
        motor.warna = "Hijau";
        motor.merk = "Suzuki";
        motor.jenis = "Sport";
        System.out.println("--Motor");
        System.out.println(motor.merk + ' ' +
                motor.jenis + ' ' +
                motor.warna);
        motor.tugas("Antar barang");

        Kendaraan mobil = new Kendaraan();
        mobil.warna = "Hitam";
        mobil.merk = "Ford";
        mobil.jenis = "MPV";
        System.out.println("--Mobil");
        System.out.println(mobil.merk + ' ' +
                mobil.jenis + ' ' +
                mobil.warna);
        mobil.tugas("Tamasya");
    }

}
