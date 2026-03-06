//0'dan klasyeden girilen deger arasinda 7'nin kati olan sayilari ekrana yazdiran program.

/* do-while ile;
import java.util.Scanner;
public class dongu3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Hangi sayiya kadar islem yapilsin?: ");
        int sayi = giris.nextInt();

        int x =0;
        do {
            if (x%7==0) {
                System.out.println(x);
            }
        x++;    
        } while (x<=sayi);
    }
}*/

/* while ile;
import java.util.Scanner;
public class dongu3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Hangi sayiya kadar islem yapilsin?: ");
        int sayi = giris.nextInt();

        int x =0;
        while (x<=sayi) {
            if (x%7==0) {
                System.out.println(x);
            }
        x++;    
        }
    }
}*/

// for dongusu ile cozum.
import java.util.Scanner;
public class dongu3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Hangi sayiya kadar islem yapilsin?: ");
        int sayi = giris.nextInt();

        for(int x =0; x<=sayi; x++) {
            if (x%7==0) {
                System.out.println(x);
            }
        }
    }
}
