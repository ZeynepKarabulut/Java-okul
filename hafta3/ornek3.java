//girilen vize notunun %40i, final notunun %60ini alip ortalmayi hesaplar ve eger ortalama 70 ve uzeri ise 'basarili' degilse basarisiz yazdirir.
import java.util.Scanner;
public class ornek3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Vize notunu gir: ");
        int v = giris.nextInt();

        System.out.println("Final notunu gir: ");
        int f = giris.nextInt();

        int ort = ((v * 40 / 100) + (f * 60 / 100));

        System.out.println("Ortalama: " + ort);

        if(ort>=70){
            System.out.println("basarili");
        }
        else{
            System.out.println("Basarisiz");
        }
        giris.close();
    }
}
