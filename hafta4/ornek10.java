/*İdeal kilo hesabı yapan bir program yazılmak istenmektedir. Programın çalışması şu şekilde
olmalıdır. Kişinin boy(cm olarak girildiği düşünülecek-örnek:170), yaş, cinsiyet(Erkek için E, kız
için K bilisi girildiği düşünülecek) ve o andaki kilosu (kg olarak girildiği düşünülecek-örnek: 65)
klavyeden girilerek aşağıdaki formüle göre ideal kilosunu hesaplanacaktır ve ekrana
yazdırılacaktır. İdeal kilosu ekrana yazdırıldıktan sonra öğrencinin kilo farkını ekrana
yazdırılmalıdır (örnek: 10 kilo vermelisiniz veya 2,5 kilo almalısınız veya tebrikler ideal
kilonuzdasınız).
a. İdeal Kilo = ( boy–100 + yaş/10 )*K formülü ile hesaplanır,
b. K sabiti için eğer cinsiyet kız ise K = 0,8 alınmalı,
c. K sabiti için eğer erkek ise K = 0,9 alınmalı,
Bu programın kodlarını yazınız. */
import java.util.Scanner;
public class ornek10 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double a=0,b=0,ideal=0;

        System.out.println("Boy gir: ");
        int boy = giris.nextInt();

        System.out.println("Kilo gir: ");
        int kilo = giris.nextInt();

        System.out.println("Yas gir: ");
        int yas = giris.nextInt();

        System.out.println("Cinsiyet gir(erkek E, kadin K): ");
        char cinsiyet = giris.next().charAt(0);

        switch(cinsiyet){
            case 'E':
                a = 0.9;
                ideal = ( boy - 100 + yas / 10 ) * a;
                b = kilo - ideal;
                break;
            case 'K':
                a = 0.8;
                ideal = ( boy - 100 + yas / 10 ) * a;
                b = kilo - ideal;
                break;
        }
        
        if(b<0){
            b = b * -1;
            System.out.println("ideal kilonuz: " + ideal);
            System.out.println(b + "kilo almalisiniz.");
        }
        else if(b>0){
            System.out.println("ideal kilonuz: " + ideal);
            System.out.println(b + " kilo vermelisiniz.");
        }
        else{
            System.out.println("ideal kilonuz: " + ideal);
            System.out.println("Tebrikler!! Ideal kilonizdasiniz.");
        }
        giris.close();
    }
}
