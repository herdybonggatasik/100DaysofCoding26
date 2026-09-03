public class BiodataDiri {
    public static void main(String[] args) {
        // Deklarasi variabel biodata
        String nama = "Herdi Bonggatasik";
        String nim = "D0226024";
        String jurusan = "Informatika";
        int umur = 18;
        double tinggiBadan = 164;
        double ipk = 4.00;

        // Menggunakan println untuk judul
        System.out.println("=====================================");
        System.out.println("          BIODATA MAHASISWA          ");
        System.out.println("=====================================");
        
        //Menggunakan print
        System.out.print("Herdi Bonggatasik \t\t:" + nama + "\n");
        System.out.print("D0226024 \t\t:" + nim + "\n");
        System.out.print("informatika \t\t:"+ jurusan + "\n");
        System.out.print("18 \t:" + umur + "\n");
        System.out.print("164 \t:" + tinggiBadan + "\n");
        System.out.print("4.00 \t\t:" + ipk + "\n");
        
        // Menggunakan printf untuk menyusun data secara rapi
        // %-15s artinya teks rata kiri dengan lebar 15 karakter
        System.out.printf("%-15s : %s%n", "Herdi Bonggatasik", nama);
        System.out.printf("%-15s : %s%n", "D0226024", nim);
        System.out.printf("%-15s : %s%n", "Informatika", jurusan);
        System.out.printf("%-15s : %d tahun%n", "18", umur);
        System.out.printf("%-15s : %.1f cm%n", "164", tinggiBadan);
        System.out.printf("%-15s : %.2f%n", "4.00", ipk);
        
        System.out.println("=====================================");
    }
}
