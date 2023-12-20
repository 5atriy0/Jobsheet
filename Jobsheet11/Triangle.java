import java.util.Scanner;

/**
 * Triangle
 */
public class Triangle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai N = ");
        int N = scan.nextInt();
        int i = 0;
        while (i <= N) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            i++;
            System.out.println();
        }
    }
}