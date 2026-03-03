//Klavyeden girilen iki notun aritmatik ortalamasini ekrana yazdirir.
import java.util.Scanner;
public class ornek2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Birinci notu gir: ");
        int not1 = giris.nextInt();

        System.out.println("Ikinci notu gir: ");
        int not2 = giris.nextInt();

        int ort = (not1 + not2) / 2;

        System.out.println("Aritmatik ortalama: " + ort);

        giris.close();
    }
}
