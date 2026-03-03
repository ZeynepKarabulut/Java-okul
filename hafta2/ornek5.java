/*Bir çalışanın brüt maaşı çalıştığı saate göre
hesaplanmaktadır. Çalıştığı her saat için 100TL 
ücret almaktadır. Brüt maaşın %15'i sigorta primi
için ve brüt maaşın %10'u devlete vergi olarak
ayrılmaktadır.
Buna göre çalışanın saat bilgisi klavyeden
girildikten sonra alacağı net maaşı hesaplayan ve
ekrana brüt maaşı, sigorta primi, vergi ve net maaş
bilgilerini yazan programı yazınız.*/
import java.util.Scanner;
public class ornek5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Kac saat calistiniz?: ");
        Double saat = giris.nextDouble();

        Double brut = saat * 100;

        Double sigorta = brut * 15 / 100;

        Double vergi = brut * 10 / 100;

        Double net = brut - sigorta - vergi;

        System.out.println("Brut maas: " + brut + "TL");

        System.out.println("Sigorta primi: " + sigorta + "TL");

        System.out.println("Vergi: " + vergi + "TL");

        System.out.println("Alacaginiz net maas: " + net + "TL");

        giris.close();
    }
}
