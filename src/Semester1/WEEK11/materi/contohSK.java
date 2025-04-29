package WEEK11.materi;

import java.util.Scanner;

public class contohSK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input number of cities and days
        System.out.print("Masukkan banyak kota: ");
        int kota = sc.nextInt();
        System.out.print("Masukkan banyak hari pengukuran: ");
        int hari = sc.nextInt();
        
        // Array to store temperature data
        double suhu[][] = new double[kota][hari];
        
        // Input temperature data
        for (int i = 0; i < suhu.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ":");
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.print("Masukkan suhu hari ke-" + (j + 1) + ": ");
                suhu[i][j] = sc.nextDouble(); //input suhu di array
            }
            System.out.println();
        }
        
        // Optional: Display the recorded temperatures
        System.out.println("\nData suhu yang dimasukkan:");
        for (int i = 0; i < suhu.length; i++) {
            System.out.println("Kota ke-" + (i + 1) + ":");
            for (int j = 0; j < suhu[i].length; j++) {
                System.out.println("Hari ke-" + (j + 1) + ": " + suhu[i][j]);
            }
        }

        sc.close();
    }
}