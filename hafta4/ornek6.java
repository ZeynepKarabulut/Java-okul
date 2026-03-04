//Klavyedne girilen bir sayinin 7ye tam bolunup bolunmedigini ekrana yazdirir.
import java.util.Scanner;
public class ornek6 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Sayi gir: ");
        int sayi = giris.nextInt();

        if(sayi%7==0){
            System.out.println("7'YE TAM BOLUNUYOR");
        }
        else{
            System.out.println("7'YE TAM BOLUNMUYOR");
        }
        giris.close();
    }
}
