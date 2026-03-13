/* Toplama işlemini öğretmeye çalışan bir oyun programı yazılacaktır. Oyun başladığı zaman rastgele 2 tane 1-100
arasında sayı tutulacak, tutulan sayılar ekrana gösterilecek ve kullanıcıya bu sayıların toplamı nedir diye sorulacaktır.
Eğer kullanıcı doğru cevap verirse “Tebrikler Bildiniz” değil ise “Üzgünüm Bilemediniz” diye mesaj verecektir. Her
cevaptan sonra “Tekrar Oynamak istiyormusunuz(e/E)?” şeklinde bir soru sorulacak ve eğer kullanıcı “e” veya “E”
ile karşılık verirse oyun tekrar başlayacaktır. Kullanıcının puanı her doğru cevap için 5 puan artacak, her yanlış cevap
için ise 2 puan azalacaktır. Oyun sonlandığında kullanıcının verdiği doğru cevap sayısı, yanlış cevap sayısı ve puanı
ekranda listelenmelidir. Bu işlemleri yapan programın kodlarını yazınız. */

import java.util.Random;
import java.util.Scanner;

public class dongu21 {
    public static void main(String[] args) {
        Random rastgele = new Random();
        Scanner giris = new Scanner(System.in);

        int toplam=0;
        int puan=0;
        int dogru=0;
        int yanlis=0;
        char tekrar;

        do{
            int a = rastgele.nextInt(1,101);
            int b = rastgele.nextInt(1,101);

            System.out.println(a + "+" + b + "=" + "?");

            System.out.println("Cevap=");
            int cevap = giris.nextInt();

            if(cevap==a+b){
                System.out.println("Tebrikler Bildiniz");
                puan = puan + 5;
                dogru++;
            }
            else{
                System.out.println("Uzgunum Bilemediniz");
                puan = puan - 2;
                yanlis++;
            }

            System.out.println("Tekrar Oynamak Istiyor musunuz(e/E)?");
            tekrar = giris.next().charAt(0);

        }while(tekrar=='e' || tekrar=='E');

        System.out.println(dogru + " tane dogru " + yanlis + " tane yanlis cevap verdiniz. " + "Puan= " + puan);
    }
}
