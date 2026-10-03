import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner herdd = new Scanner(System.in);

        // 1. Mengambil input dari user
        System.out.print("Masukkan nilai ujian Anda: ");
        int nilai = herdd.nextInt();

        System.out.print("Masukkan persentase kehadiran: ");
        int absen = herdd.nextInt();

        // 2. Kombinasi Operator Aritmatika, Perbandingan, dan Logika
        // Menghitung nilai total (Aritmatika)
        double nilaiTotal = (nilai * 0.7) + (absen * 0.3); 

        // Menentukan kelulusan (Perbandingan & Logika)
        boolean lulus = (nilaiTotal >= 75.0) && (absen >= 80);

        // 3. Menampilkan hasil
        System.out.println("\n--- Hasil Evaluasi ---");
        System.out.println("Nilai Akhir: " + nilaiTotal);
        System.out.println("Apakah Anda Lulus?: " + lulus);
        
        herdd.close();
    }
}
