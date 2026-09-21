// Mengimpor Library Scanner

import java.util.Scanner;

public class Herdyev{
    public static void main(String[] args){
        // Membuat objek Scanner untuk membaca input
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka integer: ");
        int angkaPrimitif = new Scanner(System.in).nextInt();
        
        // mengubah menggunakan String.value()
        String hasilString1 = String.valueOf(angkaPrimitif);
        
        // mengubah menggunakan integer.toString()
        String hasilString2 = Integer.toString(angkaPrimitif);
        
        System.out.println("Hasil Konversi 1:" + hasilString1);
        System.out.println("Hasil Konversi 2:" + hasilString2);
        
        
        System.out.println("Panjang Karakter String: " + hasilString1.length());
        
        input.close();
        
    }
}
