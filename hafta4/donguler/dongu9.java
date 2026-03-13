/* Klavyeden negatif sayı girilinceye kadar 10 dan büyük sayıları
toplayan ve bu sayıların âdetini bulan programın kodlarını yazınız.*/
import java.util.Scanner;
public class dongu9 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        
        int toplam=0;
        int sayac=0;
        int sayi=0;

        while(sayi>=0){
            System.out.println("Sayi giriniz: ");
            sayi = giris.nextInt();
            if(sayi>10){
                toplam += sayi;
                sayac++;
            }
        }
        System.out.println("Toplam: "+toplam);
        System.out.println("Toplanan sayilarin adeti: "+sayac);
    }
}
