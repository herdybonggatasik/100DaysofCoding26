import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		
		// Mengambil Input dari Pengguna
		Scanner input = new Scanner(System.in);
		
		// Menerima Input Panjang dari pengguna
		System.out.print("Masukkan Nilai Panjang: ");
		int panjang = input.nextInt();
		
		// Menerima input lebar dari pengguna
		System.out.print("Masukkan Nilai Lebar: ");
		int lebar = input.nextInt();
		
		// Menghitung Luas 
		int luas = panjang*lebar;
		
		// Menampilkan Hasil
		System.out.println("Luas Persegi Panjang Adalah: " + luas);
		
	}
}
