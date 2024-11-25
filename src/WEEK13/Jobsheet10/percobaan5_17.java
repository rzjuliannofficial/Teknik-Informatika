package WEEK13.Jobsheet10;

import java.util.Scanner;

public class percobaan5_17 {
    //fungsi hitung luas
    public static int hitungLuas(int p, int l) {
        int luas = p*l;
        return luas;
    }
    
    //fungsi hitung volume
    public static int hitungVolume(int p, int l, int t) {
    int volume = p*l*t;
    return volume;
    }
    
    //fungsi Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, l ,t, luas, volume;
    
        System.out.print("Masukkan panjang: ");
        p = sc.nextInt();
        System.out.print("Masukkan lebar: ");
        l = sc.nextInt();
        System.out.print("Masukkan tinggi : ");
        t = sc.nextInt();
    
        luas=hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah "+luas);
    
        volume = hitungVolume(p,l,t);
        System.out.println("Volume persegi panjang adalah "+volume);
        sc.close();
    
    }
}
