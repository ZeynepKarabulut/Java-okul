/* 100 elemanlı bir diziye 1-200 arasında rastgele sayılar üreterek aktaran, bu sayılar üzerinde;
     a)100'den büyük sayıların sayısını bulan
     b)100'den küçük sayıların ortalamasını bulan
     c)Çift sayıların sayısını bulan */

import java.util.Random;

public class dizi2 {
    public static void main(String[] args) {
     Random rastgele = new Random();

     int[] dizi = new int[100];
     int BuyukSayi=0;
     int KucukSayi=0;
     int KucukToplam=0;
     int CiftSayi=0;

     for(int i=0; i<100; i++){
          int sayi = rastgele.nextInt(1,201);
          dizi[i] = sayi;

          if(dizi[i]>100){
               BuyukSayi++;

               if(dizi[i]%2==0)
               CiftSayi++;
          }
          else if(dizi[i]<100){
               KucukSayi++;
               KucukToplam += dizi[i];

               if(dizi[i]%2==0)
               CiftSayi++;
          }
          else if(dizi[i]%2==0){
               CiftSayi++;
          }
     }

     double ortalama = KucukToplam / KucukSayi;

     System.out.println("100'den buyuk sayilarin sayisi= " + BuyukSayi);
     System.out.println("100'den kucuk sayilarin ortalamasi= " + ortalama);
     System.out.println("Cift sayilarin sayisi= " + CiftSayi);
    }
}
