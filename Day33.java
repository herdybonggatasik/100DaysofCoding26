import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan nilai
        System.out.print("Masukkan nilai ujian: ");
        int nilai = input.nextInt();

        // Struktur percabangan if-else if-else
        if (nilai >= 80 && nilai <= 100) {
            System.out.println("Nilai Anda A. Luar biasa!");
        } else if (nilai >= 70 && nilai < 80) {
            System.out.println("Nilai Anda B. Bagus!");
        } else if (nilai >= 60 && nilai < 70) {
            System.out.println("Nilai Anda C. Cukup.");
        } else if (nilai >= 50 && nilai < 60) {
            System.out.println("Nilai Anda D. Perlu belajar lagi.");
        } else if (nilai >= 0 && nilai < 50) {
            System.out.println("Nilai Anda E. Belajar lebih giat ya.");
        } else {
            System.out.println("Nilai tidak valid! Masukkan angka 0 sampai 100.");
        }

        // Menutup scanner
        input.close();
    }
}
