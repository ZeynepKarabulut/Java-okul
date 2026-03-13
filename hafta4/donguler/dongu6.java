// Carpim tablosu programi yaziniz, klavyeden carpan ve kac adim olacagi bilgisi girilsin.
import java.util.Scanner;
public class dongu6 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Carpan degerini gir: ");
        int carpan = giris.nextInt();

        System.out.println("Kac adim olsun: ");
        int adim = giris.nextInt();

        for(int i=1; i<=adim; i++){
            System.out.println(i + "x" + carpan + "=" + (i*carpan));
        }
    }
}