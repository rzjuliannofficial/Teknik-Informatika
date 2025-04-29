package WEEK5;
import java.util.Scanner;

public class kondisiLampuLaluLintas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String warna ;

        System.out.print("Masukkan warna lampu lalu lintas : ");
        warna = sc.nextLine().toLowerCase();
        
        if (warna.equals("merah")) {
            System.out.println("Berhenti lampu merah menyala");
        } 
        else if (warna.equals("kuning")) {
            System.out.println("Hati-hati! Persiapan berhenti/jalan");
        }
        else if(warna.equals("hijau")) {
            System.out.println("Silahkan jalan. Lampu hijau menyala");
        }
        else{
            System.out.println("Warna lampu tidak Valid");
        }
        


        sc.close();
    }
}
