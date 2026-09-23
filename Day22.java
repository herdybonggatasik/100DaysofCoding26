import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    // Meminta Nilai Input Pertama
	    System.out.print("Masukkan Nilai Variabel Pertama: ");
	    int nilaiA = input.nextInt();
	    
	    // Meminta Nilai Input Kedua
	    System.out.print("Masukkan Nilai Variabel Kedua: ");
	    int nilaiB = input.nextInt();
	    
	    
	    // Menampilkan Nilai Sebelum Ditukar
	    System.out.println("\n==== SEBELUM DITUKAR ====");
	    System.out.println("Nilai A\t : " + nilaiA);
	    System.out.println("Nilai B\t : " + nilaiB);
	    
	    // Proses Penukaran Nilai Menggunakan Variabel Pertama (temp)
	    
	    int temp = nilaiA;
	    nilaiA = nilaiB;
	    nilaiB = temp;
	    
	    
	    // Menampilkan Nilai Sesudah Ditukar
	    System.out.println("\n==== SESUDAH DITUKAR ====");
	    System.out.println("Nilai A\t : " + nilaiA);
	    System.out.println("Nilai B\t : " + nilaiB);
	    
	    // Menutup Scanner
	    input.close();
	}
}
