// Kuvvet hesaplayan program.
import java.util.Scanner;
public class dongu11 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Taban sayisini giriniz: ");
        int taban = giris.nextInt();

        System.out.println("Us sayisini giriniz: ");
        int us = giris.nextInt();

        double sonuc = Math.pow(taban, us);

        System.out.println("Sonuc: "+ sonuc);
    }
}
