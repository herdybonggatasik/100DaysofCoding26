import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner her = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Awal (int): ");
        int angka = her.nextInt();
        
        System.out.println("\n==== DEMO INCREMENT (++) ====");
        int her1 = angka;
        
        System.out.println("Nilai Awal Her1: " + her1 );
        
        // Cetak nilai asli dulu, baru her1 bertambah!
        System.out.println("Proses Increment (her1++): " + (her1++));
        System.out.println("Nilai her1 Setelah Proses: " + her1);
        
        System.out.println("\n==== DEMO DECREMENT (--) ====");
        int her2 = angka;
        
        System.out.println("Nilai Awal Her2: " + her2);
        
        // Cetak nilaj asli dulu, baru her2 berkurang!
        System.out.println("Proses Decrement (her2--): " + (her2--));
        System.out.println("Nilai her2 setelah Proses: " + her2);
        
        

               her.close();
    }
}
