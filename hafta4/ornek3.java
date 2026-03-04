//Klavyedne girilen pozitif bir sayinin tek ise tek, tek degil ise tek degildir yazdirir.
import java.util.Scanner;
public class ornek3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Sayi gir: ");
        int sayi = giris.nextInt();

        if(sayi%2==0){
            System.out.println("TEK DEGILDIR");
        }
        else{
            System.out.println("TEK ");
        }
        giris.close();
    }
}
