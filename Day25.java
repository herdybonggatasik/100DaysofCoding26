// Kelas sebagai tempat penyimpanan file
public class Main{
    // Main Method sebagai gerbang utama eksekusi program
    public static void main(String[] args) {
        // Menerima input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta User memasukkan Nilai Jari-jari
        System.out.print("Masukkan Nilai Jari-Jari (r): ");
        double r = input.nextDouble();
        
        // Menghitung luas lingkaran ( Luas = pi * r * )
        double luas = Math.PI*r*r;
        
        // Menampilkan Hasil/Output
        System.out.printf("Luas Lingkaran Adalah: %.2f", luas);
        
        // Menutup Scanner
        input.close();
    }
}
