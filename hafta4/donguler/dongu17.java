/* Klavyeden girilen iki sayı arasındaki çift sayıları ekrana yazan programın kodlarını yazınız, (1.sayının 2.sayıdan küçük
olduğunu düşünün) */

import java.util.Scanner;

public class dongu17 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1=0;
        int sayi2=0;
        int i=0;

        System.out.println("Sayi giriniz: ");
        sayi1 = giris.nextInt();

        System.out.println("Sayi giriniz: ");
        sayi2 = giris.nextInt();

        for(i=sayi1; i<=sayi2; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
