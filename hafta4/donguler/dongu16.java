//20+23+26+.......71 toplayıp sonucu ekrana yazan programın kodlarını yazınız
public class dongu16 {
    public static void main(String[] args) {
        
        int toplam=0;

        for(int i=20; i<=71; i+=3){
            toplam +=i;
        }
        System.out.println("Toplam= " + toplam);
    }
}
