//Klavyeden girilen a ve b sayiliarindan a nin b ye tam bolunup bolunmedigini arastirir.
import java.util.Scanner;
public class ornek7 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("1. sayiyi gir: ");
        int a = giris.nextInt();

        System.out.println("2. sayiyi gir: ");
        int b = giris.nextInt();

        if(a%b==0){
            System.out.println("TAM BOLUNUYOR");
        }
        else{
            System.out.println("TAM BOLUNMUYOR");
        }
        giris.close();
    }
}
