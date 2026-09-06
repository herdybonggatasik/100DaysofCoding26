public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel float (wajib menggunakan akhiran 'f' atau 'F')
        float tinggiBadan = 175.5f;
        float piFloat = 3.1415926535f;

        // Deklarasi variabel double (default untuk bilangan desimal)
        double ipk = 3.85;
        double piDouble = 3.1415926535897932384;

        // Menampilkan nilai variabel
        System.out.println("=== Tipe Data Float ===");
        System.out.println("Tinggi Badan : " + tinggiBadan + " cm");
        System.out.println("Nilai Pi (float): " + piFloat);

        System.out.println("\n=== Tipe Data Double ===");
        System.out.println("IPK          : " + ipk);
        System.out.println("Nilai Pi (double): " + piDouble);

        // Operasi Aritmatika Sederhana
        double angka1 = 10.5;
        double angka2 = 2.5;
        double hasilBagi = angka1 / angka2;

        System.out.println("\n=== Operasi Aritmatika ===");
        System.out.println(angka1 + " / " + angka2 + " = " + hasilBagi);
    }
}
