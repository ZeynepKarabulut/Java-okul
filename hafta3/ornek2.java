//Klavyeden girilen iki notun aritmatik ortalamasini alir ve not 70 ve uzeri ise ekrana 'basarili' yazdirir.
import java.util.Scanner;
public class ornek2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Birinci notu gir: ");
        int not1 = giris.nextInt();

        System.out.println("Ikinci notu gir: ");
        int not2 = giris.nextInt();

        double ort = (not1 + not2) / 2;

        System.out.println("Ortalama: " + ort);

        if(ort>=70){
            System.out.println("Basarili");
        }
        giris.close();
    }
}
