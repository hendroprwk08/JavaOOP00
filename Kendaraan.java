public class Kendaraan {
    String nama, merek;
    int cc;
    
    Kendaraan(String nm, String mr, int cc){
        this.nama = nm;
        this.merek = mr;
        this.cc = cc;
    }

    void getInfo() {
        System.out.println(this.merek + " ["+ this.nama + "] " + this.cc);
    }

    int biaya(int liter, int harga){
        return liter * harga;
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

    
}
