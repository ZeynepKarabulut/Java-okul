//Klavyeden girilen sayinin cift veya teek oldugunu gosterir.
import java.util.Scanner;
public class ornek1 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Sayi gir: ");
        int sayi = giris.nextInt();

        if(sayi%2==0){
            System.out.println("Sayi cift.");
        }
        else{
            System.out.println("Sayi tek.");
        }
        giris.close();
    }
}
