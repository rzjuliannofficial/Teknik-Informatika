package WEEK1;

import java.util.Scanner;

public class tugas2 {
    static Scanner sc = new Scanner(System.in);
    static int sisi;
    public static void main(String[] args) {
        
        while (true) {
        System.out.println("===========================");
        System.out.println("--Menu Penghitungan Kubus--");
        System.out.println("===========================");
        System.out.println("1. Volume Kubus");
        System.out.println("2. Luas Permukaan Kubus");
        System.out.println("3. Keliling Kubus");
        System.out.println("4. Keluar");
        System.out.println("===========================");
        
        
            System.out.print("Masukkan pilihan: ");
            int pilihan = sc.nextInt();
            switch (pilihan) {
                case 1:
                volumeKubus();
                System.out.println();
                break;
                
                case 2:
                luasPermukaanKubus();
                System.out.println();
                break;
                
                case 3:
                kelilingKubus();
                System.out.println();
                break;

                case 4:
                System.out.println("Anda telah keluar! ");
                return;

                default:
                System.out.println("Input yang benar!");
                System.out.println();
                continue;
            }
        }
    }
    
    public static void volumeKubus(){
        System.out.print("Masukkan panjang sisi: ");
        sisi = sc.nextInt();
        int volume = sisi*sisi*sisi ;
        System.out.println("Volume Kubus dengan panjang sisi-sisinya "+sisi+" adalah "+volume);
        System.out.println();
    }
    
    public static void luasPermukaanKubus(){
        System.out.print("Masukkan panjang sisi: ");
        sisi = sc.nextInt();
        int luasPermukaan = 6*sisi*sisi;
        System.out.println("Luas Permukaan Kubus dengan panjang sisi-sisinya "+sisi+" adalah "+luasPermukaan);
        System.out.println();
    }
    
    public static void kelilingKubus(){
        System.out.print("Masukkan panjang sisi: ");
        sisi = sc.nextInt();
        int keliling = 4* sisi ;
        System.out.println("Keliling Kubus dengan panjang sisi-sisinya "+sisi+" adalah "+keliling);


    }
}
