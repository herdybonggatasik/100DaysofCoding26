import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ==========================================
        // 1. BAGIAN INPUT & OUTPUT BIODATA
        // ==========================================
        System.out.print("Masukkan Nama       : ");
        String nama = scanner.nextLine();
        
        System.out.print("Masukkan NIM        : ");
        String nim = scanner.nextLine();
        
        System.out.print("Masukkan Kelas      : ");
        String kelas = scanner.nextLine();
        
        System.out.print("Masukkan Umur       : ");
        int umur = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer newline
        
        System.out.print("Masukkan Prodi      : ");
        String prodi = scanner.nextLine();
        
        System.out.print("Masukkan IPK        : ");
        double ipk = scanner.nextDouble();
        
        System.out.print("Status Keaktifan   : ");
        boolean statusAktif = scanner.nextBoolean();
        System.out.println(); // Baris baru untuk estetika

        // Menampilkan Output Biodata
        System.out.println("===== BIODATA MAHASISWA =====");
        System.out.println("Nama          : " + nama);
        System.out.println("NIM           : " + nim);
        System.out.println("Kelas         : " + kelas);
        System.out.println("Umur          : " + umur + " Tahun");
        System.out.println("Prodi         : " + prodi);
        System.out.printf("IPK           : %.2f\n", ipk);
        System.out.println("Status Aktif: " + statusAktif);
        System.out.println();

        // ==========================================
        // 2. SOAL 2: MENGHITUNG LUAS LINGKARAN
        // ==========================================
        // Berdasarkan contoh, input langsung dimasukkan berupa angka jari-jari
        double pi = 3.14;
        double jariJari = scanner.nextDouble();
        
        double luas = pi * jariJari * jariJari;
        // Menampilkan hasil (jika desimal bulat seperti .0, format otomatis)
        if (luas == (long) luas) {
            System.out.printf("%.1f\n", luas);
        } else {
            System.out.println(luas);
        }
        System.out.println();

        // ==========================================
        // 3. SOAL 3: MENUKAR NILAI TANPA VARIABEL TAMBAHAN
        // ==========================================
        // Mengambil input dua bilangan bulat berturut-turut
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // Proses penukaran menggunakan operator aritmatika
        a = a + b; 
        b = a - b; 
        a = a - b; 

        // Menampilkan output hasil penukaran
        System.out.println(a);
        System.out.println(b);

        scanner.close();
    }
}
