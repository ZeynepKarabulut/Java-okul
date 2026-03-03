//klavyeden iki dik kenari girilen ucgenin hipotenusunu hesaplar.
import java.util.Scanner;
public class ornek4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Birinci kenari gir: ");
        int kenar1 = giris.nextInt();

        System.out.println("Ikinci kenari gir: ");
        int kenar2 = giris.nextInt();

        double hipo = Math.sqrt((kenar1 * kenar1) + (kenar2 * kenar2));

        System.out.println("Ucgenin hipotenusu: " + hipo);

        giris.close();
    }
}
