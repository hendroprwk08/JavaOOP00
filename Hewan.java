public class Hewan {
    String nama;
    int kaki;
    
    public Hewan(String nama, int kaki) {
        this.nama = nama;
        this.kaki = kaki;
    }

    public String getNama() {
        return nama;
    }

    public int getKaki() {
        return kaki;
    }

    void suara(){
        System.out.println("berkicau");
    }

    int usia(){
        return 10;
    }
}
