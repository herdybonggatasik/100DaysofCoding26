
// 1. Mengimpor kelas Scanner
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // 2. Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // 3. Meminta input Nama (Tipe Data String)
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // 4. Meminta input Umur (Tipe Data Integer)
        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();

        // 5. Meminta input Berat Badan (Tipe Data Double)
        System.out.print("Masukkan berat badan Anda (kg): ");
        double beratBadan = scanner.nextDouble();

        // Menampilkan kembali data yang diinputkan
        System.out.println("\n--- Data Anda ---");
        System.out.println("Nama        : " + nama);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println("Berat Badan : " + beratBadan + " kg");

        // Menutup scanner untuk mencegah kebocoran memori (opsional tapi disarankan)
        scanner.close();
    }
}
