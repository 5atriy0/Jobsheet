import java.util.Scanner;

public class PemilihanPercobaan126 {

    public static void main(String[] args) {
        Scanner input26 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input26.nextInt();
        String hasil = (angka % 2 == 0) ? "genap" : "ganjil";
        System.out.println("Angka " + angka + " bilangan " + hasil);
        //tes
    }
}