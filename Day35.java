import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner her = new Scanner(System.in);
        System.out.print("Masukkan Umur Anda: ");
        int umur = her.nextInt();
        
        // Kondisi Luar
        if (umur >=18) {
            System.out.print("Apakah Sudah Memiliki KTP? ");
            String punyaKTP = her.nextLine();
            
            // Kondisi Dalam/ Nested If
            if (punyaKTP.equalsIgnoreCase("Ya")) {
                System.out.print("Anda Boleh Masuk. ");
            } else {
                System.out.print("\nAnda Harus Membuat KTP dulu. ");
            }
        } else {
            System.out.println("Maaf, Umur Anda Belum Cukup. ");
        }
        her.close();
        
    }
}
