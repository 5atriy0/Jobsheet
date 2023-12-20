import java.util.Scanner;
/**
 * Tugas1Jobsheet11
 */
public class Tugas1Jobsheet11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
            System.out.print("masukkan nilai n : ");
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
             for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
                for (int k = 1; k <= i+1; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
