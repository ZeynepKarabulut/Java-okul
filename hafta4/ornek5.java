//Klavyeden girilen bir sayinin cift veya tek oldugunu bulur.
import java.util.Scanner;
public class ornek5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Sayi gir: ");
        int sayi = giris.nextInt();

        if(sayi%2==0){
            System.out.println("CIFT");
        }
        else{
            System.out.println("TEK");
        }
        giris.close();
    }
}
