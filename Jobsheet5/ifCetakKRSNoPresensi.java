package Jobsheet5;
import java.util.Scanner;

public class ifCetakKRSNoPresensi {
    public static void main(String[] args) {
        // Deklarasi Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        // Pakai ternary operator langsung ke variabel pesan
        String pesan = (uktLunas) 
            ? "Pembayaran UKT terverifikasi. Silahkan cetak KRS dan minta tanda tangan DPA"
            : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";

            
        // Output hasil
        System.out.println(pesan);

        sc.close();
    }
}
