import java.util.Scanner;

/**
 * Tugas1
 */
public class Tugas1 {
        static void deretRekursif(int n) {
            if (n >= 0) {
                System.out.print(n + " ");
                deretRekursif(n - 1);
            }
        }
        static void deretIteratif(int n) {
            for (int i = n; i >= 0; i--) {
                System.out.print(i + " ");
            }
        }
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int n;

            System.out.print("Masukkan nilai : ");
            n = scan.nextInt();
            System.out.println("Deret Rekursif:");
            deretRekursif(n);
            System.out.println("\n\nDeret Iteratif:");
            deretIteratif(n);
        }
    }