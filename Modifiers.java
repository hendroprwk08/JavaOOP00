class belajarpublik {
    public String nama;
}

class belajarprivate {
    private String nama;
}

class belajarprotec {
    protected String nama;
}

public class Modifiers {
    public static void main(String[] args) {
        belajarpublik publik1 = new belajarpublik();
        publik1.nama = "Andika";
        System.out.println("Nama Anda : "
                + publik1.nama);

        belajarprivate private1 = new belajarprivate();
        private1.nama = "Andika";
        System.out.println("Nama Anda : "
                + private1.nama);

        belajarprotec protec1 = new belajarprotec();
        protec1.nama = "Andika";
        System.out.println("Nama Anda : "
                + protec1.nama);

    }
}
