/* Klavyeden girilen 10 tane sayıdan negatiflerin sayısını, pozitiflerin toplamını bulan ve her ikisini de ekrana yazan
programın kodlarını yazınız */

import java.util.Scanner;

public class dongu18 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int NegatiflerinSayisi=0;
        int PozitiflerinToplami=0;

        for(int i=0; i<10; i++){
            System.out.println("Sayi giriniz: ");
            int sayi = giris.nextInt();

            if(sayi<0){
                NegatiflerinSayisi++;
            }
            else{
                PozitiflerinToplami +=sayi;
            }
        }
        System.out.println("Girilen negatiflerin sayisi: " + NegatiflerinSayisi);
        System.out.println("Girilen pozitiflerin toplami: " + PozitiflerinToplami);
    }
}
