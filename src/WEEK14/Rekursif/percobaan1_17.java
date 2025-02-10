package WEEK14.Rekursif;

public class percobaan1_17 {
    static int faktorialRekursif(int n) {
        if (n == 0) {
            return 1;
        }else {
            return (n * faktorialRekursif(n-1));
        }
        // 5 * faktorialRekursif(5-1) = 5 * faktorialRekursif(4)
        // 5 * (4 * faktorialRekursif(4-1)) = 5 * (4 * faktorialRekursif(3))
        //....
        // 5 * (4 * (3 * (2 * (1 * faktorialRekursif(1-1))
        // 5 * (4 * (3 * (2 * (1 * 1)))) = 120
        
        // 5 ! = 5 * 4 * 3 * 2 * 1 = 120
    }

    static int faktorialIteratif(int n){
        int faktor = 1; 
        for (int i = n; i >= 1; i--) {
            faktor = faktor * i;
        } // 1 * 5 * 4 * 3 * 2 * 1 = 120
        return faktor;
    }
    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialIteratif(5));
    }
}
