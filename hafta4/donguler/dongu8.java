/* Klavyeden girilen 2 sayıyı toplayıp sonucunu ekrana yazdıktan sonra,
kullanıcıya “Tekrar Hesaplama Yapmak İstiyormusunuz?” diye soru
sorup, eğer kullanıcı “e” tuşuna basarsa yeniden işlemleri
gerçekleştiren program kodlarını yazınız.*/
import java.util.Scanner;
public class dongu8 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        char secim =' ';
        
        do{
        System.out.println("1. sayiyi gir: ");
        int sayi1 = giris.nextInt();

        System.out.println("2. sayiyi gir: ");
        int sayi2 = giris.nextInt();

        System.out.println(sayi1 + "+" + sayi2 + "=" + (sayi1+sayi2));

        System.out.println("Tekrar hesaplama yapmak istiyor musunuz?(evet icin e): ");
        secim = giris.next().charAt(0);
        } while(secim=='e');
    }
}
