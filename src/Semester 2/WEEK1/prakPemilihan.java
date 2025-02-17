package WEEK1;

import java.util.Scanner;

public class prakPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Masukkan Nilai Tugas: ");
        int tugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis: ");
        int kuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS: ");
        int uts = sc.nextInt();
        System.out.print("Masukkan Nilai UAS: ");
        int uas = sc.nextInt();
        
        System.out.println("==============================");
        System.out.println("==============================");
        
        if (tugas > 100 || kuis >100 || uts > 100 || uas > 100) {
            System.out.println("Inputan invalid. Input yang benar! ");
            System.out.println("==============================");
            System.out.println("==============================");
        }else {
            String huruf;
            double nilaiAkhir = (tugas + kuis + uas + uts)/4;
            System.out.println("Nilai akhir : "+nilaiAkhir);
            
            if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                huruf = "A";
            }else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                huruf = "B+";
            }else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                huruf = "B";
            }else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                huruf = "C+";
            
            }else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                huruf = "C";
            
            }else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                huruf = "D";
            }else {
                huruf = "E";
            }
            
            System.out.println("Nilai Huruf: "+huruf);
            System.out.println("==============================");
            System.out.println("==============================");


            if (nilaiAkhir <= 50) {
                System.out.println("MAAF ANDA TIDAK LULUS");
            }else {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
        
    }
    
    
}
