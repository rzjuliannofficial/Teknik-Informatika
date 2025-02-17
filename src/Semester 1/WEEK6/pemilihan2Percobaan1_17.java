package WEEK6;
import java.util.Scanner;

public class pemilihan2Percobaan1_17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //deklarasi
        int tahun;

        //input
        System.out.print("Masukkan tahun : ");
        tahun = sc.nextInt();

        //tahun kabisat = tahun yg habis dibagi 4 dan Tahun yang habis dibagi 100 bukan tahun kabisat, kecuali jika bisa dibagi 400. 

        //operator
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");
            } else if ((tahun % 400) == 0) {
                System.out.println("Tahun Kabisat");
            } else {
                System.out.println("Bukan tahun Kabisat");
            }
        
        } else {
            System.out.println("Bukan tahun Kabisat");
        }
        
        // //Alternatif

        // if (tahun %4==0 && tahun%100!=0 || tahun%400==0) {
        //     System.out.println("Tahun Kabisat");
        // }
        // else {
        //     System.out.println("Bukan tahun Kabisat");
        // }


        sc.close();
    }
}