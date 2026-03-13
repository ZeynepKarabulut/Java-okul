/*Kendisi hariç bütün pozitif çarpanları (tam bölenleri) toplamı, yine kendisine eşit olan sayılara "mükemmel sayı"
denir. Örneğin 6=1+2+3, 28=1+2+4+7+14 gibi. Buna göre klavyeden girilen bir tamsayının "mükemmel sayı" olup
olmadığını kontrol eden program */
import java.util.Scanner;
public class dongu13 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int toplam = 0;

        System.out.println("Sayi giriniz: ");
        int sayi = giris.nextInt();

        for(int i=1; i<sayi; i++){
            if(sayi%i==0){
                toplam = toplam + i;
            }    
        }
        if(sayi==toplam)
            System.out.println("Mukemmel sayi");
        else
            System.out.println("Mukemmel sayi DEGIL!!");
    }
}
