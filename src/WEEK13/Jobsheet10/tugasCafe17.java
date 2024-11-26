package WEEK13.Jobsheet10;

import java.util.Scanner;

public class tugasCafe17 {
    
    //fungsi input data 
    public static int[][] inputData(int[][] rekapPenjualan, String[] menu) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < rekapPenjualan.length; i++) {
            System.out.println("Menu : " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Penjualan hari ke-" + (j + 1) + " : ");
                rekapPenjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        sc.close();
        return rekapPenjualan; // Mengembalikan array setelah diisi
    }

    //fungsi menampilkan keseluruhan data
    public static int[][] tabel(int[][] rekapPenjualan, String[] menu) {
        System.out.print("\t");
        for (int i = 0; i < 7; i++) {
            System.out.print("\tHari ke-"+(1+i));
        }
        for (int i = 0; i < menu.length; i++) {
            System.out.print("\n"+menu[i]+" :\t");
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                System.out.print("\t"+rekapPenjualan[i][j]+"\t");
            }
        }
        System.out.println();
        return rekapPenjualan;
    }
    
    //fungsi  menampilkan Menu yang memiliki penjualan tertinggi
    public static void menuTertinggi(int[][] rekapPenjualan, String[] menu) {
        double rata2 = 0;
        int tertinggi = 0;
        int totalPerMenu = 0;
        int indexMax = 0;
        System.out.println();
        for (int i = 0; i < menu.length; i++) {
            rata2 = 0;
            for (int j = 0; j < rekapPenjualan[i].length; j++) {
                totalPerMenu += rekapPenjualan[i][j];
            }
            if (totalPerMenu > tertinggi) {
                indexMax = i;
            }
            rata2 = totalPerMenu / 7;
            System.out.println();
            System.out.println("Total untuk menu "+menu[i]+" adalah : "+totalPerMenu);
            System.out.println("Rata- rata "+menu[i]+" adalah : "+rata2);
        }
        System.out.println();
        System.out.println("Menu yang memiliki penjualan tertinggi adalah : "+menu[indexMax]);
        return ;
    }

    //fungsi main
    public static void main(String[] args) {
        String menu[] = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
        int rekapPenjualan[][]= new int[menu.length][7];
        
        //pemanggilan fungsi
        inputData(rekapPenjualan, menu);
        tabel(rekapPenjualan, menu);
        menuTertinggi(rekapPenjualan, menu);
    }
}
