import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner herD = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan Nilai Ujian: ");
        int nilai = herD.nextInt();
        
        System.out.print("Masukkan Kehadiran: ");
        int hadir = herD.nextInt();

        // 1. Operator AND (&&) -> Harus benar kedua-duanya
        boolean lulusUjian = (nilai >= 75) && (hadir >= 80);
        System.out.println("Lulus UKT (AND): " + lulusUjian);

        // 2. Operator OR (||) -> Benar salah satu sudah cukup
        boolean dapatRemedial = (nilai < 75) || (hadir < 80);
        System.out.println("Butuh Bimbingan/Remedial (OR): " + dapatRemedial);

        // 3. Operator NOT (!) -> Membalikkan nilai boolean
        boolean tidakLulus = !lulusUjian;
        System.out.println("Status Gagal (NOT): " + tidakLulus);

        herD.close();
    }
}
