import java.util.Scanner;

public class Herdyev{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Angka Pertama (yang dibagi): ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan Angka Kedua (pembagi): ");
        int angka2 = input.nextInt();
        
        int sisaBagi = angka1 % angka2;
        
        System.out.println("Hasil Dari 10%3: " + angka1%angka2);
        
        
        input.close();
    }
}
