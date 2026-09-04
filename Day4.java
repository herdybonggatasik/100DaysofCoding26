public class BilanganBulat {
    public static void main(String[] args) {
        // Tipe Data byte
        // Cocok untuk menghemat memori pada array besar jika nilainya kecil.
        byte umur = 18;
        
        // Tipe Data short
        // Digunakan jika nilai tidak muat di byte, tapi ingin menghemat memori dibanding int.
        short jumlahSiswa = 1500;
        
        // Tipe Data int
        // Tipe data standar/paling umum untuk angka bulat.
        int populasiKota = 1250000;
        
        // Tipe Data long
        // Digunakan untuk angka yang sangat besar. 
        // Wajib mengakhiri nilai dengan huruf 'L' atau 'l' agar terbaca sebagai literal long.
        long populasiDunia = 8000000000L;

        // Menampilkan nilai ke konsol
        System.out.println("--- TIPE DATA BILANGAN BULAT ---");
        System.out.println("Nilai byte  (18): " + umur);
        System.out.println("Nilai short (1500): " + jumlahSiswa);
        System.out.println("Nilai int   (1250000): " + populasiKota);
        System.out.println("Nilai long  (8000000000L): " + populasiDunia);
    }
}

