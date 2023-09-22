import java.util.Scanner;

public class Respon {
    public static void main(String[] args) {
        String nama;
        int usia;

        // membuat scanner baru
        try (Scanner keyboard = new Scanner(System.in)) {
            // Tampilkan output ke user
            System.out.print("Nama karyawan: ");
            nama = keyboard.nextLine();

            System.out.print("Usia: ");
            usia = keyboard.nextInt();

            // Menampilkan apa yang sudah simpan di variabel
            System.out.println("--------------------");
            System.out.println("Nama Karyawan: " + nama);
            System.out.println("Usia: " + usia + " tahun");
        } catch (Exception e) {
            System.out.println(e.getMessage().toString());
        }

    }
}