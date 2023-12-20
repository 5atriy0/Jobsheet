import java.util.Scanner;
/**
 * Tugas2
 */
public class Tugas2 {
        static int penjumlahanRekursif(int n) {
            if (n == 1) {
                System.out.print("1");
                return 1;
            } else {
                int before = (penjumlahanRekursif(n-1));
                System.out.print(" + " + n);
                return n + before;
            }
        }
    
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int batas;
            System.out.print("Masukkan nilai batas : ");
            batas = scan.nextInt();
            System.out.println("Hasil : ");
            int hasil = penjumlahanRekursif(batas);
            System.out.print(" = " + hasil);
        }
    }
