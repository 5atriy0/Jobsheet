package Jobsheet.Jobsheet13;
import java.util.Scanner;
/**
 * Ucapan_26
 */
public class Ucapan_26 {
    public static String PenerimaUcapan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = scan.nextLine();
        scan.close();
        return namaOrang;
        }
        public static void main(String[] args) {
            String nama = PenerimaUcapan();
            System.out.println("Thank you "+nama+"\nMay the force be with you.");
        }
    }
