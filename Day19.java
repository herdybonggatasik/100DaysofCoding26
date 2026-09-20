import java.util.Scanner;
public class Herdyy{
    public static void main(String[] args) {
        // Membuat objek scanner
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Desimal: ");
        
        // Membaca Input tipe data besar (double)
        double angkaDouble = input.nextDouble();
        
        // Konversi Paksa dari double ke int
        int angkaInt = (int) angkaDouble;
        
        // Konversi Paksa dari int ke short
        short angkaShort = (short) angkaInt;
        
        // Menampilkan hasil
        System.out.println("\n==== HASIL KONVERSI ====");
        System.out.println("Nilai Awal double: " + angkaDouble);
        System.out.println("Hasil ke int     : " + angkaInt);
        System.out.println("Hasil ke short   : " + angkaShort);
        
        // menutup Scanner
        input.close();
    }
}
