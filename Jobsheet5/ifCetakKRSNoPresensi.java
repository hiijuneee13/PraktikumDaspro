package Jobsheet5;
// Import Scanner
import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        // Menerima masukan dari keyboard
         System.out.print("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // Struktur IF untuk mengecek UKT
        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi.");
             System.out.print("Silahkan cetak KRS dan minta tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu");
        }

        sc.close();
    }
}
