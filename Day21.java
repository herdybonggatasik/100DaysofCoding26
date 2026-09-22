import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);
        
        // Mengambil input String Mentah
        System.out.print("Masukkan angka bulat int: ");
        String herInt = input.nextLine();
        
        // Mengubah String ke tipe data primitif int
        int nilaiInt = Integer.parseInt(herInt);
        
        System.out.print("Masukkan angka desimal double: ");
        String herDouble = input.nextLine();
        
        // Mengubah String ke tipe data primitif double
        double nilaiDouble = Double.parseDouble(herDouble);
        
        System.out.print("Masukkan nilai boolean: ");
        String herBoolean = input.nextLine();
        
        // Mengubah String ke tipe data primitif boolean
        boolean nilaiBoolean = Boolean.parseBoolean(herBoolean);
        
        System.out.println("\n ==== HASIL KONVERSI ====");
        System.out.println("Nilai int: " + nilaiInt);
        System.out.println("Nilai double: " + nilaiDouble);
        System.out.println("Nilai boolean: " + nilaiBoolean);
        
        input.close();
        
    }
    
}
