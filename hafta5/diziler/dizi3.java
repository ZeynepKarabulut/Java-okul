/* Elemanları tam sayı olan bir A dizisinin(20 elemanlı) rastgele sayılar atayan, sonra dizi elemanlarının
aritmetik ortalamasını hesaplayan ve elemanlardan kaç tanesinin bu ortalamadan büyük olduğunu sayan
programın kodlarını yazınız. */

import java.util.Random;

public class dizi3 {
    public static void main(String[] args) {
        Random rastgele = new Random();

        int[] A = new int[20];
        int toplam=0;
        int sayac=0;
        double ortalama;

        for(int i=0; i<20; i++){
            int eleman = rastgele.nextInt();

            A[i] = eleman;
            toplam += A[i];
        }

        ortalama = toplam / 20;

        for(int i=0; i<20; i++){
            if(A[i]>ortalama)
                sayac++;
        }
        System.out.println(sayac + " tanesi ortalamadan buyuk");
    }
}
