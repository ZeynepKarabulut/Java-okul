/* Klavyeden girilen sayıları okuyan ve sayıların toplamı 21'den büyük veya eşit olduğu zaman duran programın
kodlarını yazınız */
import java.util.Scanner;
public class dongu15 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int toplam=0;

        do{
            System.out.println("Sayi gir: ");
            int sayi = giris.nextInt();

            System.out.println(sayi);

            toplam += sayi;
        }while(toplam<21);

        System.out.println("Toplam= " + toplam);
    }
}
