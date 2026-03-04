//Klavyeden girilen sayinin pozitif, negatif veya sifirwa esit oldugunu yazdirir.
import java.util.Scanner;
public class ornek1 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Sayi gir: ");
        int sayi = giris.nextInt();

        if(sayi>0){
            System.out.println("Pozitif");
        }
        else if(sayi<0){
            System.out.println("Negatif");
        }
        else{
            System.out.println("Sifira esit");
        }
        giris.close();
    }
    
}
