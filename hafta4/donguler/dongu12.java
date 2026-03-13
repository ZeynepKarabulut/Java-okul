// Klavyeden girilen sayinin pozitif tam bolenlerini ekrana yazdiran program.
import java.util.Scanner;
public class dongu12 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Sayi giriniz: ");
        int sayi = giris.nextInt();

        System.out.println(sayi + " sayisinin pozitif tam bolenleri:");

        for(int i=1; i<=sayi; i++){
            if(sayi % i==0)
                System.out.println(i);
        }
    }
}
