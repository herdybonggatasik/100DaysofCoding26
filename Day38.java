import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner her= new Scanner(System.in);
         System.out.println("==== Merek HP====");
        System.out.println("1. Vivo (1.500.000)");
        System.out.println("2. Oppo (1.600.000)");
        System.out.println("3. Realme ( 1.900.000)");
        int pilihan = her.nextInt();
        
        if (pilihan == 1){
            System.out.println("Anda Memilih: Hp Vivo dengan harga 1.500.000");
        } else if (pilihan == 2){
                System.out.println("Anda Memilih: Hp Oppo dengan harga 1.600.000");
    } else if(pilihan == 3){
                System.out.println("Anda Memilih: Hp Realme dengan harga 1.900.000");
    } else {
        System.out.println("Merek tidak tersedia! Silahkan pilih nomor 1 sampai 3. ");
        her.close();
            }
        }
}
