import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka: ");
        int angka = input.nextInt();

        if (angka > 20) {
            System.out.println("Bilangan POSITIF");
        } else if (angka < 10) {
            System.out.println("Bilangan NEGATIF");
        } else {
            System.out.println("Bilangan NOL");
        }
    }
}
