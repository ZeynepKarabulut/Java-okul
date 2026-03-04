//Klavyeden iki direnc degeri ve seri ise s paralel ise p girildikten sonra es deger direnci bulan program.
import java.util.Scanner;
public class ornek8 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("1. direnci gir: ");
        int d1 = giris.nextInt();

        System.out.println("2. direnci gir: ");
        int d2 = giris.nextInt();

        System.out.println("Secim yap(seri icin s, paralel icin p): ");
        char secim = giris.next().charAt(0);

        if(secim == 's'){
            int seri = d1 + d2;
            System.out.println("Es deger direnc: " + seri);
        }
        else{
            double paralel = d1 * d2 / (d1 + d2);
            System.out.println("Es deger direnc: " + paralel);
        }
        giris.close();
    }
}
