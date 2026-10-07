import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner herdd = new Scanner(System.in);
        System.out.print("Masukkan Sebuah Bilangan: ");
        int hrdy = herdd.nextInt();
        
        // Memeriksa Sisa Bagi Dengan Angka 2
        if (hrdy % 2 == 0){
            System.out.println(hrdy + " adalah bilangan GENAP.");
        } else {
            System.out.println(hrdy + " adalah bilangan GANJIL.");
        }
        herdd.close();
        }
    }
    
