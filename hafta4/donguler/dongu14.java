// Asal sayi bulan program.
import java.util.Scanner;
public class dongu14 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayac =0;

        System.out.println("Sayi giriniz: ");
        int sayi = giris.nextInt();

        for(int i=1; i<=sayi; i++){
            if(sayi%i==0){
                sayac ++;
            }
        }
        if(sayac==2)
            System.out.println("Asal sayi");
        else
            System.out.println("Asal sayi DEGIL");
    }
}
