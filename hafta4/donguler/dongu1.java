//0-100 arasi tek sayilari ekrana yazdiran program.

/* do-while ile;
public class dongu1 {
    public static void main(String[] args) {
        
        int sayi =0;
        do {
            if(sayi%2!=0){
                System.out.println(sayi);
            }
        sayi++;    
        }while (sayi<=100);
    }
}*/

/* while ile;
public class dongu1 {
    public static void main(String[] args) {
        
        int sayi =0;
        while (sayi<=100) {
            if (sayi%2!=0) {
                System.out.println(sayi);
            }
        sayi++;    
        }
    }
}*/

// if ile cozum
public class dongu1 {
    public static void main(String[] args) {

        for (int sayi=0; sayi<=100; sayi++) {
            if (sayi%2!=0) {
                System.out.println(sayi);
            }
        }
    }
}