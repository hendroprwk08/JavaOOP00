import java.util.ArrayList;

public class MainHewan {
    static ArrayList<Hewan> hewanList = new ArrayList<>();

    public static void main(String[] args) {
        //tambah data
        hewanList.add(new Hewan("Anoa", 4)); 
        hewanList.add(new Hewan("Kelinci", 2)); 
        hewanList.add(new Hewan("Ular", 0)); 
        hewanList.add(new Hewan("Kucing", 4)); 
        hewanList.add(new Hewan("Kelabang", 20)); 
        hewanList.add(new Hewan("Kaki Seribu", 104)); 

        System.out.println("--- tampilkan seluruh data");
        tampil(); //tampilkan seluruh data

        System.out.println("--- hapus index ke-1");
        hewanList.remove(1);
        tampil();

        System.out.println("--- hapus semua data");
        hewanList.clear();
        tampil();
    }

    private static void tampil() {
        for (int i = 0; i < hewanList.size(); i++) {
            System.out.println(i 
            +" "+ hewanList.get(i).getNama()
            +" "+ hewanList.get(i).getKaki());
        }
    }
}
