/* 1 haftaya ait sıcaklık bilgilerini içerisinde barındırabilecek bir dizi tanımlayınız. Klavyeden bu dizinin
elemanlarına veri girişi yapınız. Ardından sıcaklık ortalamasını hesaplayıp ekrana yazdırınız. */

import java.util.Scanner;

public class dizi1 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int[] sicaklik = new int[7];
        int toplam=0;

        for(int i=0; i<7; i++){
            System.out.println("Sicaklik degeri giriniz: ");
            int deger = giris.nextInt();

            sicaklik[i] = deger;
            toplam +=sicaklik[i];
        }

        double ortalama = toplam / 7;
        System.out.println("1 haftaya ait sicaklik ortalamasi: " + ortalama);
    }
}
