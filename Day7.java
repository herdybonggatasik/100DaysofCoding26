public class Main {
    public static void main(String[] args) {
	// Penggunaan String 
        String namaLengkap = "Herdi Bonggatasik";
        String namaPanggilan = "Herdi";
        String alamat = "Mamasa";
        String jurusan = "Informatika";
        String makananFavorit = "Bakso";
        
 // Menggabungkan String (Concatenation)
        String nama = namaLengkap + " " + namaPanggilan + " " + alamat + " " + jurusan + " " + makananFavorit; 
        
// Mengetahui Panjang teks menggunakan (Length)
        int panjangNama = nama.length();
        
// Menampilkan hasil
        System.out.println("--- BIODATA ---");
        System.out.println("namaLengkap: " + namaLengkap);
        System.out.println("namaPanggilan: " + namaPanggilan);
        System.out.println("alamat: " + alamat);
        System.out.println("jurusan: " + jurusan);
        System.out.println("makananFavorit: " + makananFavorit);
    }
}
