import java.util.Scanner;
public class BioskopWithScanner26 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int baris, kolom;
        int menu;
        boolean keluar = true;
        String nama, next;
        String[][] penonton = new String[][]{
            {"***", "***"},
            {"***", "***"},
            {"***", "***"},
            {"***", "***"}    
        
        };

        while (keluar) {
            System.out.println("---Menu--- :");
            System.out.println("1. Input data penonton:");
            System.out.println("2. Tampilkan daftar penonton:");
            System.out.println("3. Exit:");
            System.out.print("Pilih Menu: ");
            menu = scan.nextInt();

            switch (menu) {
                case 1:
                System.out.print("Masukkan nama: ");
                nama = scan.next();
                System.out.print("Masukkan baris: ");
                baris = scan.nextInt();
                System.out.print("Masukkan kolom: ");
                kolom = scan.nextInt();

                if (baris > 0 && baris <= penonton.length && kolom > 0 && kolom <= penonton[0].length) {
                    if (penonton[baris-1][kolom-1] != "***") {
                        System.out.println("Kursi Sudah Di booking");
                    } else {
                        penonton[baris-1][kolom-1] = nama;
                        System.out.println("Kursi Tersedia");
                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = scan.next();
                    }

                } else {
                    System.out.println("Kursi Tidak Tersedia");
                }
                break;

                case 2:
                System.out.println("Daftar penonton");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("Penonton ke-" + (i+1) + " : " + String.join(", ", penonton[i]));
                }
                break;

                case 3:
                System.out.println("Terima Kasih");
                keluar = false;

                default:
                    break;
            }
        }
    }
}