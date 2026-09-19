// Mengimpor library Scanner
import java.util.Scanner;

public class Herdy1 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sebuah angka bulat (int): ");
       // Mengambil input bertipe int
        int nilaiInt = input.nextInt();

        // Konversi otomatis dari int (kecil) ke long (besar)
        long nilaiLong = nilaiInt;
        double nilaiDouble = nilaiInt;

        // Menampilkan hasil
        System.out.println("\n--- Hasil Konversi Otomatis ---");
        System.out.println("Nilai awal (int)   : " + nilaiInt);
        System.out.println("Nilai setelah ke long  : " + nilaiLong);
        System.out.println("Nilai setelah ke double: " + nilaiDouble); // Akan menjadi desimal (misal: 10.0)
        
        input.close();
    }
}
