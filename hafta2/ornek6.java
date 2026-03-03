/*Ekmeği 15 TL, poğaçayı 13TL, simidi 16,5 TL 'den satan
bir fırıncı kazancının %18'i vergi vermektedir.
Fırıncının sattığı ürün sayısı ürün çeşitlerine
göre klavyeden girildikten sonra fırıncının kazancı
ve ödemesi gereken vergi hesaplayıp bu bilgileri
ekrana yazdıran programın kodlarını yazınız. */
import java.util.Scanner;
public class ornek6 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        
        System.out.println("Kac tane ekmek satildi?: ");
        int ekmek = giris.nextInt();

        System.out.println("Kac tane pogaca satildi?: ");
        int pogaca = giris.nextInt();

        System.out.println("Kac tane simit satildi?: ");
        int simit = giris.nextInt();

        double e = ekmek * 15;

        double p = pogaca * 13;

        double s = simit * 165/10;

        double toplam = e + p + s;

        double vergi = toplam * 18 / 100;

        double kazanc = toplam - vergi;

        System.out.println("odenmesi gereken vergi: " + vergi + "TL");

        System.out.println("Net kazanc: " + kazanc + "TL");

        giris.close();
    }
}
