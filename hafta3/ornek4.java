//Hesap makinesi
import java.util.Scanner;
public class ornek4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Birinci sayiyi gir: ");
        Double sayi1 = giris.nextDouble();

        System.out.println("Ikinci sayiyi gir: ");
        Double sayi2 = giris.nextDouble();

        System.out.println("Istenilen islemi gir(+,-,/,*): ");
        char a = giris.next().charAt(0);

        switch(a){
            case '+':
                System.out.println("Sonuc: " + (sayi1 + sayi2));
                break;
            case '-':
                System.out.println("Sonuc: " + (sayi1 - sayi2));
                break;
            case '*':
                System.out.println("Sonuc: " + (sayi1 * sayi2));
                break;
            case '/':
                if(sayi2!=0){
                    System.out.println("Sonuc: " + (sayi1 / sayi2));
                }            
                else{
                    System.out.println("Tanimsiz");
                }
                break;
            default:
                System.out.println("Gecersiz islem?");    
        }
        giris.close();
    }
}
