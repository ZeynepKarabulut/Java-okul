//Klavyeden girilen birbirine esit olmayan iki sayidan buyuk olanin yazdirir.
import java.util.Scanner;
public class ornek2 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("1. sayiyi gir: ");
        int sayi1 = giris.nextInt();

        System.out.println("2. sayiyi gir: ");
        int sayi2 = giris.nextInt();

        if(sayi1>sayi2){
            System.out.println(sayi1);
        }
        else{
            System.out.println(sayi2);
        }
        giris.close();
    }
}
