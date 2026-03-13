/*1 den 1000 e kadar 5’in katı olup 2 nin katı olmayan sayıların adetini
bulan programı yazınız.*/
public class dongu7 {
    public static void main(String[] args) {
        int sayi=1;
        int sayac=0;

        while(sayi<=1000) {
            if (sayi%5==0 && sayi%2!=0){
                sayac++;
            }
            sayi++;
        } 
        System.out.println("1 den 100 e kadar 5 in kati olup 2 nin kati olmayan sayilarin adedi = "+sayac);
    }
}
