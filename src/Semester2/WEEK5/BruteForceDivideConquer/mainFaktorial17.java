package WEEK5.BruteForceDivideConquer;

import java.util.Scanner;

public class mainFaktorial17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int nilai = sc.nextInt();

        faktorial17 fk = new faktorial17();
        System.out.println("Nilai faktorial "+nilai+" Menggunakan BF: "+fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial "+nilai+" Menggunakan DC: "+fk.faktorialDC(nilai));
    }
}
