package WEEK1;

import java.util.Scanner;

public class prakArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] mk = {"Pancasila", "Konsep Teknologi", "Critical Thingking dan Problem Solving", "Matematika Dasar","Bahasa Inggris", "Dasar Pemograman", "Praktikum Dasar Pemograman", "Keselamatan dan Kesehatan Kerja"};
        double[] nilai = new double[mk.length];
        String[] nilaiHuruf = new String[mk.length];
        double[] bobotNIlai = new double[mk.length];
        int[] sks = new int[mk.length];
        double  totalSKS=0, hasil = 0; 
        double ip;
        

        for (int i = 0; i < mk.length;) {
  
            System.out.print("Masukkan nilai Angka untuk MK "+mk[i]+": ");
            nilai[i] = sc.nextDouble();
            System.out.print("Masukkan SKS (1-3): ");
            sks[i] = sc.nextInt();
            if (sks[i] > 3 || sks[i]<0) {
                System.out.println("Input yang benar!");
                continue;
            }
            if (nilai[i] > 100 || nilai[i]< 0) {
                System.out.println("Input yang benar!");
                continue; 
            }
            if (nilai[i] > 80 && nilai[i] <= 100) {
                nilaiHuruf[i] = "A";
                bobotNIlai[i] = 4.00 ;
            }else if (nilai[i] > 73 && nilai[i] <= 80) {
                nilaiHuruf[i]  = "B+";
                bobotNIlai[i] = 3.50 ;
            }else if (nilai[i] > 65 && nilai[i] <= 73) {
                nilaiHuruf[i]  = "B";
                bobotNIlai[i] = 3.00 ;
            }else if (nilai[i] > 60 && nilai[i] <= 65) {
                nilaiHuruf[i]  = "C+";
                bobotNIlai[i] = 2.50 ;
                
            }else if (nilai[i] > 50 && nilai[i] <= 60) {
                nilaiHuruf[i]  = "C";
                bobotNIlai[i] = 2.00 ;
                
            }else if (nilai[i] > 39 && nilai[i] <= 50) {
                nilaiHuruf[i]  = "D";
                bobotNIlai[i] = 1.00 ;
            }else {
                nilaiHuruf[i]  = "E";
                bobotNIlai[i] = 0 ;
            }
            totalSKS += sks[i];
            hasil += bobotNIlai[i] * sks[i];
            i++;
        }

            
        System.out.println("==============================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("==============================================");
        
        // System.out.println("MK\t\t\t\t\t\t Nilai Angka \t Nilai Huruf \t Bobot Nilai");
        // for (int i = 0; i < mk.length; i++) {
        //     System.out.print("\n"+mk[i]+"\t\t\t\t\t");
        //     System.out.print(nilai[i]);
        //     System.out.print("\t\t"+nilaiHuruf[i]);
        //     System.out.print("\t\t"+bobotNIlai[i]);
            
        // }

        //AGAR TAMPILAN MENJADI RAPI
        System.out.printf("%-45s %-15s %-15s %-15s %-10s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai", "SKS");

        for (int i = 0; i < mk.length; i++) {
        System.out.printf("%-45s %-15s %-15s %-15s %-10s%n", mk[i], nilai[i], nilaiHuruf[i], bobotNIlai[i], sks[i]);
        }

        System.out.println("=================================");
        
        ip= hasil / totalSKS;
        System.out.println("IP: "+ip);
        sc.close();
    }
}
