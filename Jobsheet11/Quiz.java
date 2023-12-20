import java.util.Random;
import java.util.Scanner;
/**
 * Quiz
 */
public class Quiz {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        char menu = 'y';
        do {
            int number = random.nextInt(10)+1;
            boolean success = false;
            do {
                System.out.print("Tebak angka (1-10): ");
                int answer = scan.nextInt();
                scan.nextLine();
                success = (answer == number);
            } while (!success);
            System.out.print("Apakah Anda ingin mengulang permainan (y/n)?");
            menu = scan.nextLine().charAt(0);

            if (menu == 'n' || menu == 'n') {
                System.out.println("Keluar dari permainan");
                break;
            }

        } while (menu == 'y' || menu == 'Y');
    }
}
