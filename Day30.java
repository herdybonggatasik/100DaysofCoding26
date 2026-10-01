import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner her = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Pertama End 1: ");
        int end1 = her.nextInt();
        
        System.out.print("Masukkan Angka Pertama End 2: ");
        int end2 = her.nextInt();
        
        boolean lebihKecilSamaDengan = end1 <= end2;
        boolean lebihBesarSamaDengan = end1 >= end2;
        
        
        System.out.println("\n==== HASIL PERBANDINGAN ====");
        System.out.println("Apakah " + end1 + " <= " + end2 + " ? Jawabannya: " + lebihKecilSamaDengan);
        System.out.println("Apakah " + end1 + " >= " + end2 + " ? Jawabannya: " + lebihBesarSamaDengan);
        
        her.close();
    }
}
