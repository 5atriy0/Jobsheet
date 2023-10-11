import java.util.Scanner;
public class ForKelipatan26 {
    public static void main(String[] args) {

        Scanner input26 = new Scanner(System.in);
        int kelipatan, counter=0;
        float jumlah=0, rataRata;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input26.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        rataRata = jumlah / counter;

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %f\n", kelipatan, jumlah);
        System.out.printf("Rata-rata dari bilangan-bilangan kelipatan %d adalah %f", kelipatan, rataRata);
    }
}