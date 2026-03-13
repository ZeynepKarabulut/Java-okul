/* Klavyeden girilen N elemanlı bir A dizisindeki pozitif elemanları B dizisine ve negatif elemanları da C dizisine
yerleştiren programın kodlarını yazınız */

import java.util.Scanner;

public class dizi6 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        System.out.println("Dizinin eleman sayisini giriniz: ");
        int N = giris.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];
        int b=0;
        int c=0;

        for(int a=0; a<N; a++){
            System.out.println("A[" + a + "] = ");
            A[a] = giris.nextInt();

            if(A[a]>0){
                B[b] = A[a];
                b++;
            }
            else if(A[a]<0){
                C[c] = A[a];
                c++;
            }
        }

        System.out.println("Pozitif sayilar (B dizisi):");
        for(int i=0; i<b; i++){
            System.out.println("B[" + i + "] = " + B[i]);
        }

        System.out.println("Negatif sayilar (C dizisi):");
        for(int i=0; i<c; i++){
            System.out.println("C[" + i + "] = " + C[i]);
        }
    }
}
