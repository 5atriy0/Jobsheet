package Jobsheet.Jobsheet13;
import java.util.Scanner;
/**
 * Kubus26
 */
public class Kubus26 {
    static int hitungVolume (int sisi){
        int volume = sisi*sisi*sisi;
        return volume;
    }
    static int luarPermukaan (int s){
        int Luar = 6*s*s;
        return Luar;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int s ,L , V;
    System.out.println("Masukkan panjang sisi kubus:");
    s = input.nextInt();
    V = hitungVolume(s);
    System.out.println("Volume kubus adalah " + V);
    L = luarPermukaan(s);
    }
}