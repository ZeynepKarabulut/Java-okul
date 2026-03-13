/* 100 elemanlı sayısal bir dizinin elemanlarına 1-1000 arasında rastgele değer atandıktan sonra bu
elemanlardan değeri 5'e tam bölünen aynı zamanda 3'e tam bölünemeyen sayıları sayan, toplamlarını
hesaplayan ve bu sayıları listeleyen bir program yazınız. */

import java.util.Random;

public class dizi5 {
    public static void main(String[] args) {
        Random rastgele = new Random();

        int[] dizi = new int[100];
        int toplam=0;
        int i=0;

        for(i=0; i<20; i++){
            int eleman = rastgele.nextInt(1,1001);

            dizi[i] = eleman;

            if(dizi[i]%5==0 && dizi[i]%3!=0)
                toplam += dizi[i];
        }

        System.out.println("Toplam= " + toplam);
        System.out.println("5'e bolunup 3'e bolunmeyen sayilar: ");

        for(i=0; i<20; i++){
            if(dizi[i]%5==0 && dizi[i]%3!=0)
                System.out.println(dizi[i]);
        }
    }
}
