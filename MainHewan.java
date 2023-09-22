public class MainHewan {

    public static void main(String[] args) {
        hewan peliharaan = new hewan();
        peliharaan.nama = "sapi";
        peliharaan.umur = "2 tahun";
        peliharaan.jenis = "herbivora";
        System.out.println("--hewan");
        System.out.println(peliharaan.nama + ' ' +
                peliharaan.umur + ' ' +
                peliharaan.jenis);
        peliharaan.tugas("mencari makan");

        hewan ternak = new hewan();
        ternak.nama = "ayam";
        ternak.umur = "3 tahun";
        ternak.jenis = "omnivora";
        System.out.println("--hewan");
        System.out.println(ternak.nama + ' ' +
                ternak.umur + ' ' +
                ternak.jenis);
        ternak.tugas("bertelur");

        hewan reptil = new hewan();
        reptil.nama = "buaya";
        reptil.umur = "4 tahun";
        reptil.jenis = "karnivora";
        System.out.println("--hewan");
        System.out.println(reptil.nama + ' ' +
                reptil.umur + ' ' +
                reptil.jenis);
        reptil.tugas("berenang");


    }

}
