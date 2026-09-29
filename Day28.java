import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner her = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Pertama Herdy1: ");
        int herdy1 = her.nextInt();
        
        System.out.print("Masukkan Angka Kedua Herdy2: ");
        int herdy2 = her.nextInt();
        
        System.out.println("\n==== HASIL PERBANDINGAN ====");
        System.out.println("Herdy1 == Herdy2: " + (herdy1==herdy2)); // true jika herdy1 sama dengan herdy2
        System.out.println("Herdy1 != Herdy2: " + (herdy1 != herdy2)); // true jika herdy1 tidak sama dengan herdy2
        
        // contoh pengaplikasian dalam percabangan if <-> else
        if (herdy1 == herdy2){
            System.out.println("Nilai Herdy1 dan Herdy2\n benar-benar sama");
        } else {
            System.out.println("Nilai Herdy1 dan Herdy2 Berbeda");
        }
         her.close();
    }
}
