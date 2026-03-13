/* 2015 yılı itibarı ile ülke nüfusu 77 milyondur. Yıllık nüfus artış oranı
%1.3 tür. Sonraki 10 yılda ülke nüfusunu yıllara göre programın
kodlarını yazınız. */
public class dongu10 {
    public static void main(String[] args) {
        int yil=2016;
        int nufus=77;

        while(yil<=2025){
            nufus = (nufus * 13 / 10 / 100) + nufus;
            System.out.println(yil+" yilinda nufus: " + nufus + " milyon");
            yil++;
        }
    }
}
