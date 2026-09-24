import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	    // Meminta pengguna memasukkan Nilai sisi
	    System.out.print("Masukkan Sisi Panjang Persegi: ");
	    double sisi = input.nextDouble();
	    
	    // Menghitung luas persegi (Sisi×Sisi)
	    double luas = sisi * sisi;
	    
	    // Menampilkan hasil 
	    System.out.println("Luas Persegi Adalah: " + luas);
	    
	    // Menutup Scanner
	    input.close();
	}
}
