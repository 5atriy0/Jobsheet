import java.util.Scanner;
/**
 * Tugas4
 */
public class Tugas4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bulan;
        System.out.print("Masukkan berapa bulan : ");
        bulan = scan.nextInt();
        System.out.println("Pasangan marmut yang ada pada akhir bulan ke " + bulan + " : " + jumlahMarmut(bulan));
    }
    public static int jumlahMarmut(int bulan) {
        if (bulan == 0) {
            return 0;
        } else if (bulan == 1) {
            return 1;
        } else {
            return jumlahMarmut(bulan - 1) + jumlahMarmut(bulan - 2);
        }
    }
}