/*Bir eğitim kurumunda görev yapan öğretmenlere normal maaşlarına ek olarak, girdikleri ders
saatine göre ek ders ücreti ödenmektedir. Ödenecek ek ders ücreti aşağıdaki şartlara göre
verilmektedir.
a. Ders saati 10 saatten az ise ders saati başına 10 TL,
b. Ders saati 10 ile 20 saat arasında ise ders saati başına 12,5TL,
c. Ders saati 20 saatten fazla ise ders saati başına 13 TL,
Buna göre öğretmenin girilen ek ders saatine göre alacağı ücreti bulan program */
import java.util.Scanner;
public class ornek9 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double sonuc;

        System.out.println("Ders saati gir: ");
        int saat = giris.nextInt();

        if(saat<10){
            sonuc = saat * 10;
        }
        else if(saat>=10 && saat<=20){
            sonuc = saat * 125 / 10;
        }
        else{
            sonuc = saat * 13;
        }

        System.out.println("Ek ders ucreti: " + sonuc);

        giris.close();
    }
}
