
// 1. Mengimpor kelas Scanner
import java.util.Scanner; 

public class Main {
    public static void main(String[] args) {
        // 2. Membuat objek Scanner untuk membaca input dari keyboard
        Scanner scanner = new Scanner(System.in);

        // 3. Meminta input Nama (Tipe Data String)
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // 4. Meminta input Umur (Tipe Data Integer)
        System.out.print("Masukkan Tanggal: ");
        int tanggal = scanner.nextInt();

        // 5. Meminta input Berat Badan (Tipe Data Double)
        System.out.print("Masukkan berat badan Anda (kg): ");
        double beratBadan = scanner.nextDouble();
    		
    	// 6. Meminta input IPK (Tipe data Float)
    	System.out.print("Masukkan IPK Anda: ");
    	float ipk = scanner.nextFloat();
    		
    	// 7. Meminta input Quantilium (Tipe data Long)
    	System.out.print("Masukkan Quantilium: ");
    	long quantilium = scanner.nextLong();
    		
    	// 8. Meminta input Umur (Tipe data Byte)
    	System.out.print("Masukkan umur Anda: ");	
    	byte umur = scanner.nextByte();
    		
    	// 9. Meminta input Total Belanja (Tipe data Short)
    	System.out.print("Masukkan total belanja Anda: ");	
    	short totalBelanja = scanner.nextShort();
    		
    		// 10. Meminta input Simbol (Tipe data Character)
    	System.out.print("Masukkan Jenis Kelamin: ");	
    	char jenisKelamin = scanner.next().charAt(0);
    		
    	// 11. Meminta input Hidup atau Mati (Tipe data Boolean)
    	System.out.print("Hidup atau Mati?: ");
    	boolean hidupMati = scanner.nextBoolean();	

        // Menampilkan kembali data yang diinputkan
        System.out.println("\n--- Data Anda ---");
        System.out.println("Nama              : " + " Herdi Bonggatasik");
        System.out.println("Tanggal           : " + 12);
        System.out.println("Berat Badan       : " + 50 + " kg");
    	System.out.println("IPK               : " + 4.00F);
    	System.out.println("Quantilium        : " + 10L);
    	System.out.println("Umur              : " + 18 + " tahun");	
    	System.out.println("Total Belanja     : " + 100.000);
    	System.out.println("Jenis Kelamin     : " + " L");	
    	System.out.println("Benar atau Salah? : " + " true");	
    		
    }
}

