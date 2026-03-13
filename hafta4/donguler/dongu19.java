//Klavyeden girilen 30 tane sayının aritmetik ortalamasını bulan programın kodlarını yazınız

import java.util.Scanner;

public class dongu19 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double toplam=0;
        double ortalama=0;

        for(int i=0; i<30; i++){
            System.out.println("Sayi giriniz: ");
            int sayi = giris.nextInt();

            toplam +=sayi;
        }
        ortalama = toplam / 30;
        System.out.println("Aritmetik ortalama: " + ortalama);
    }
}
