/* Meteoroloji merkezi için bir program tasarlanması istenilmiştir. Programın çalışma şekli ise şöyle olmalıdır:
   a. İlk önce hangi ay için sıcaklık bilgisi girileceği kullanıcıya sorulacaktır.(Kullanıcının Ocak, Şubat, Mart, Nisan,
      Mayıs, Haziran, Temmuz, Ağustos, Eylül, Ekim, Kasım ve Aralık bilgisinden birisini girdiğini varsayınız.)
   b. Girilen ay bilgisine uygun olarak o ayda kaç tane gün var ise kullanıcıdan gün sayısı kadar sıcaklık bilgisi girilmesi
      istenilecektir(Şubat ayı için gün sayısını 28 alınız, diğer ayların gün sayısını 30 alınız).
   c. Sıcaklık veri girişi bittikten sonra o ayın sıcaklık ortalaması bilgisi ekrana yazdırılacaktır. Bu işlemden sonra
      program sonlanacaktır.
    Örnek Çıktı: Şubat Ayına ait Ortalama Sıcaklık=15,6 derecedir. */

import java.util.Scanner;

public class dongu20 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayac=0;
        double toplam=0;

        System.out.println("Hangi ay icin sicaklik bilgisi girilecek: ");
        String ay = giris.nextLine();

        if(ay.equals("Subat")){
            sayac=28;
        }
        else{
            sayac=30;
        }

        for(int i=0; i<sayac; i++){
            System.out.println("Sicaklik bilgisi giriniz: ");
            double sicaklik = giris.nextDouble();

            toplam +=sicaklik;
        }
        double ortalama = toplam / sayac;
        System.out.println(ay + "Ayina ait Ortalama Sicaklik= " + ortalama + " derecedir.");
    }
}
