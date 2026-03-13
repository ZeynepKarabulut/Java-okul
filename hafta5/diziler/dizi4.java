/* Elemanları 1-100 arasında rastgele değerler olan int türden 20 elemanlı bir dizideki elemanların sayısal
ortalamasını, en büyük değerini, en küçük değerini bulan programı yazınız. */

import java.util.Random;

public class dizi4 {
    public static void main(String[] args) {
        Random rastgele = new Random();

        int[] dizi = new int[20];
        int EnBuyuk=0;
        int EnKucuk=101;
        int toplam=0;
        double ortalama;

        for(int i=0; i<20; i++){
            int eleman = rastgele.nextInt(1,101);

            dizi[i] = eleman;
            toplam += dizi[i];

            if(dizi[i]<EnKucuk){
                EnKucuk = dizi[i];
            }
            else if(dizi[i]>EnBuyuk){
                EnBuyuk = dizi[i];
            }
        }
        ortalama = toplam / 20;

        System.out.println("Dizideki En Buyuk Deger= " + EnBuyuk);
        System.out.println("Dizideki En Kucuk Deger= " + EnKucuk);
        System.out.println("Dizideki elemanlarin sayisal ortalamasi= " + ortalama);
    }
}
