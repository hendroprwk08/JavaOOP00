public class Kendaraan {
    String nama, merek;
    int cc;

    //1. namanya harus sama dengan kelas tanpa void
    //2. fungsinya menjalankan kode sebelum method lain berfungsi
    Kendaraan(String n, String m, int c){
        this.nama = n;
        this.merek = m;
        this.cc = c;
    }

    public String getNama() {
        return nama;
    }

    public String getMerek() {
        return merek;
    }

    public int getCc() {
        return cc;
    }



    //method
    void getInfo() {
        System.out.println(this.merek + " ["+ this.nama + "] " + this.cc);
    }

    //method dengan parameter
    int biaya(int liter, int harga){
        return liter * harga;
    }   
}
