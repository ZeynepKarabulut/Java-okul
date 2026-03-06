//100-0 arasindaki tek sayilari buyukten kucuge dogru yazdiran program

/* do-while ile;
public class dongu2 {
    public static void main(String[] args) {
        
        int sayi =100;
        do {
            if (sayi%2!=0) {
                System.out.println(sayi);
            }
        sayi--;    
        } while (sayi>=0);
    }
}*/

/* while ile;
public class dongu2 {
    public static void main(String[] args) {
        
        int sayi =100;
        while (sayi>=0) {
            if (sayi%2!=0) {
                System.out.println(sayi);
            }
        sayi--;    
        }
    }
}*/

// for ile cozum
public class dongu2 {
    public static void main(String[] args) {
        
        for (int sayi=100; sayi>=0; sayi--){
            if (sayi%2!=0) {
                System.out.println(sayi);
            }
        }
    }
}

