import java.util.Scanner;
/**
 * Tugas3Jobsheet11
 */
public class Tugas3Jobsheet11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int batas = 0;
        System.out.print("Masukkan nilai N: ");
        batas = input.nextInt();

        for (int i = 1; i <= batas; i++) {
            if (i > 1 && i < batas) {
                for (int j = 1; j <= batas; j++) {
                    if (j == 1 || j == batas) {
                        System.out.print(batas+" ");
                    } else {
                        if (batas > 9) {
                            System.out.print("   ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                }
            } else {
                for (int j = 1; j <= batas; j++) {
                    System.out.print(batas+" ");
                }
            }
            System.out.println();
        }
    }
}