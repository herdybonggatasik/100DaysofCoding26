import java.util.Scanner;

public class Herdyev {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari keyboard
        Scanner input = new Scanner(System.in);

        // 1. Operator Penugasan Dasar (=)
        System.out.print("Masukkan nilai awal (angka): ");
        int angka = input.nextInt();
        System.out.println("Nilai awal (angka = " + angka + ")");

        // 2. Operator Penugasan Tambah (+=)
        System.out.print("\nMasukkan angka untuk ditambah (+=): ");
        int tambah = input.nextInt();
        angka += tambah; // Sama dengan: angka = angka + tambah
        System.out.println("Hasil setelah (angka += " + tambah + ") adalah: " + angka);

        // 3. Operator Penugasan Kurang (-=)
        System.out.print("\nMasukkan angka untuk dikurang (-=): ");
        int kurang = input.nextInt();
        angka -= kurang; // Sama dengan: angka = angka - kurang
        System.out.println("Hasil setelah (angka -= " + kurang + ") adalah: " + angka);

        // 4. Operator Penugasan Kali (*=)
        System.out.print("\nMasukkan angka untuk dikali (*=): ");
        int kali = input.nextInt();
        angka *= kali; // Sama dengan: angka = angka * kali
        System.out.println("Hasil setelah (angka *= " + kali + ") adalah: " + angka);

        // 5. Operator Penugasan Bagi (/=)
        System.out.print("\nMasukkan angka untuk dibagi (/=): ");
        int bagi = input.nextInt();
        if (bagi != 0) {
            angka /= bagi; // Sama dengan: angka = angka / bagi
            System.out.println("Hasil setelah (angka /= " + bagi + ") adalah: " + angka);
        } else {
            System.out.println("Error: Tidak bisa membagi dengan angka nol!");
        }

        // 6. Operator Penugasan Sisa Bagi (%=)
        System.out.print("\nMasukkan angka untuk sisa bagi (%=): ");
        int sisaBagi = input.nextInt();
        if (sisaBagi != 0) {
            angka %= sisaBagi; // Sama dengan: angka = angka % sisaBagi
            System.out.println("Hasil setelah (angka %= " + sisaBagi + ") adalah: " + angka);
        } else {
            System.out.println("Error: Tidak bisa menghitung sisa bagi dengan nol!");
        }

        // Menutup scanner
        input.close();
        System.out.println("\nProses selesai. Nilai akhir angka adalah: " + angka);
    }
}
