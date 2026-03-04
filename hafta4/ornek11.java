/*Bir öğrencinin bir dersten aldığı başarı notunun hesaplanması şu şekilde olacaktır,
a. Öğrenci 3 adet Kısa sınav, 2 adet Vize sınavına ve 1 adet Final sınavına girmektedir.
b. Kısa sınav notları ve vize notları klavyeden girilerek bu notların aritmetik ortalamaları
alınacaktır,
c. Son olarak final notu girilerek, başarı puanı hesaplanıp ekrana yazılacaktır.
d. Başarı puanı şu şekilde hesaplanmaktadır : BP = (KSort * 50/100 +Vort * 50 / 100 ) * 40/100 + F * 60/100;
Not : BP : Başarı puanı, KSort :Kısa sınavların not ortalaması, Vort :Vizelerin not ortalaması, F:
Final Notu
Bu işlemi yapan programın kodlarını yazınız. */
import java.util.Scanner;
public class ornek11 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("1. Kisa sinav notu gir: ");
        int knot1 = giris.nextInt();

        System.out.println("2. Kisa sinav notu gir: ");
        int knot2 = giris.nextInt();

        System.out.println("3. Kisa sinav notu gir: ");
        int knot3 = giris.nextInt();

        System.out.println("1. Vize notu gir: ");
        int vize1 = giris.nextInt();

        System.out.println("2. Vize notu gir: ");
        int vize2 = giris.nextInt();

        System.out.println("Final notu gir: ");
        int f = giris.nextInt();

        double kort = ((knot1 + knot2 + knot3) / 3);

        double vort = ((vize1 + vize2) / 2);

        double BP = (kort * 50/100 +vort * 50 / 100 ) * 40/100 + f * 60/100;

        System.out.println("Basari puani: " + BP);

        giris.close();
    }
    
}
