import java.util.Scanner;
public class Herdyev {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = input.nextLine();
        System.out.print("Masukkan Nama Panggilan: ");
        String namaPanggilan = input.nextLine();
        System.out.print("Masukkan Umur: ");
        int umur = input.nextInt();
        System.out.print("Masukkan Tinggi Badan: ");
        double tinggiBadan = input.nextDouble();
        
        System.out.println("Nama saya " + namaLengkap + ", kamu bisa panggil saya " + namaPanggilan + ", umur saya " + umur + ", tinggi badan saya " + tinggiBadan);
    }
}
