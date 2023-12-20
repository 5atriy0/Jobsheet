import java.util.Scanner;

/**
 * Tugas3
 */
public class Tugas3 {

        static boolean cekPrimaRekursif(int n, int bagi) {
            if (n <= 1) {
                return false;
            }
            if (bagi == 1) {
                return true;
            }
            if (n % bagi == 0) {
                return false;
            } else {
            return cekPrimaRekursif(n, bagi - 1);
        }
    }
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int bil;

            System.out.print("Masukkan bilangan : ");
            bil = scan.nextInt();
            boolean hasil = cekPrimaRekursif(bil, bil - 1);

            if (hasil) {
                System.out.println(bil + " adalah bilangan prima.");
            } else {
                System.out.println(bil + " bukan bilangan prima.");
            }
        }
    }