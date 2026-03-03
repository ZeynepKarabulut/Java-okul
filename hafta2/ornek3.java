//Klavyeden girilen vize notunun %40'ini ve girilen final notunun %60'ini alarak ortalamasini hesaplar.
import java.util.Scanner; 
public class ornek3 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Vize notunu gir: ");
        int not1 = giris.nextInt();

        System.out.println("Final notunu gir: ");
        int not2 = giris.nextInt();

        int ort = (not1 * 40 / 100) + (not2 * 60 / 100);

        System.out.println("Aritmatik ortalama: " + ort);

        giris.close();
    }
}
