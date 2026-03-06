/* Klavyeden girilen başlangıç ve bitiş değeri arasında 8'in katı olup 5'in
katı olmayan sayıları ekrana yazdıran programı yazınız. (sayı 8
bölünebilecek ama 5 e bölünemeyecek, başlangıç sayısının bitiş
sayısından küçük olduğunu varsayınız) */

/* do=while ile;
import java.util.Scanner;
public class dongu4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Baslangic degeri giriniz: ");
        int basla = giris.nextInt();

        System.out.println("Bitis degeri giriniz: ");
        int bitis = giris.nextInt();
        
        do {
            if (basla%8==0 && basla%5!=0) {
                System.out.println(basla);
            }
        basla++;    
        } while (basla<=bitis);
    }
}*/

/* while ile;
import java.util.Scanner;
public class dongu4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Baslangic degeri giriniz: ");
        int basla = giris.nextInt();

        System.out.println("Bitis degeri giriniz: ");
        int bitis = giris.nextInt();

        while (basla<=bitis) {
            if (basla%8==0 && basla%5!=0) {
                System.out.println(basla);
            }
        basla++;    
        }
    }
}*/

// for dongusu ile cozum.
import java.util.Scanner;
public class dongu4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Baslangic degeri giriniz: ");
        int basla = giris.nextInt();

        System.out.println("Bitis degeri giriniz: ");
        int bitis = giris.nextInt();

        int x=0;
        for (x =basla; x<=bitis; x++) {
            if (x%8==0 && x%5!=0) {
                System.out.println(x);
            }
        }
    }
}