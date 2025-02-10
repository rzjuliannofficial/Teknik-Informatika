package WEEK5;
import java.util.Scanner;

public class usia {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan usia anda: ");
    int usia = sc.nextInt();

    //validasi usia > 0
    if (usia<0) {
        System.out.println("Maaf usia yang anda masukkan tidak valid");
        sc.close();
        return;
    }

    //logika if else
    if (usia<12) {
        System.out.println("Kategori usia anda : Anak");
    } 
    else if (usia<19) {
        System.out.println("Kategori usia anda : Remaja");
    } 
    else if (usia<64) {
        System.out.println("Kategori usia anda : Dewasa");
    }
    else 
        System.out.println("Kategori usia anda : Lansia");
    {
        
    }

    sc.close();
    }
}
