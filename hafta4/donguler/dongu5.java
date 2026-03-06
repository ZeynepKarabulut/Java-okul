//sayi tahmin oyunu, sayiyi kac tahminde buldugunu da yazar
import java.util.Scanner;
public class dongu5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.print("0-100 arasında bir sayı girin: ");
        int tutulanSayi = giris.nextInt();

        // Ekranı temizleme
        System.out.print("\033[H\033[2J");
        System.out.flush();

        int tahmin = -1;
        int sayac = 0;

        while (tahmin != tutulanSayi) {

            System.out.print("Tahmin: ");
            tahmin = giris.nextInt();
            sayac++;

            if (tahmin < tutulanSayi) {
                System.out.println("Yukarı");
            }
            else if (tahmin > tutulanSayi) {
                System.out.println("Aşağı");
            }
            else {
                System.out.println("Tebrikler! Doğru tahmin.");
                System.out.println("Toplam tahmin sayısı: " + sayac);
            }
        }
        giris.close();
    }
}
    

