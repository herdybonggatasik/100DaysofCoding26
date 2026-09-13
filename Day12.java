import java.util.Scanner;
 public class Herdyy{
     public static void main(String[] args){
         // membuat objek scanner untuk membaca input dari keyboard
     Scanner input = new Scanner(System.in);
     // mengambil input dari pengguna 
     System.out.print("Masukkan Nama: ");
         String nama = input.nextLine();
         
         System.out.print("Masukkan Umur: ");
         int umur = input.nextInt();
         input.nextLine();
         
         System.out.print("Masukkan Jurusan/Kelas: ");
         String kelas = input.nextLine();
         
         System.out.print("Masukkan Alamat: ");
         String alamat = input.nextLine();
         
         // menampilkan hasil/output
         System.out.println("Nama: " + nama);
         System.out.println("Umur: " + umur + " tahun");
         System.out.println("Kelas/Jurusan: " + kelas);
         System.out.println("Alamat: " + alamat);
         
         //menutup scanner
        input.close();
     
     }
 }
 
