package Jobsheet.Jobsheet13;
import java.util.Scanner;
/**
 * UcapanTerimaKasih_26
 */
public class UcapanTerimaKasih_26 {
    public static String PenerimaUcapan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan:");
        String namaOrang = scan.nextLine();
        return namaOrang;
    }
    public static String UcapanTambahan(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Tuliskan ucapan tambahan yang ingin Anda sampaikan: ");
        String tambahan = scan.nextLine();
        return tambahan;
    }
    public static void UcapanTerimaKasih(){
        String nama = PenerimaUcapan();
        String tambahan = UcapanTambahan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask you anything.");
        System.out.println("Kata-kata tambahan: " + tambahan);
    }
    public static void main(String[] args) {
        UcapanTerimaKasih();
    }
}