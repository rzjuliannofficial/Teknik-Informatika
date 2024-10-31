package WEEK10;

import java.util.Scanner;

public class tugas2_17 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        
        int jmlPesanan ;

        System.out.print("Masukkan jumlah pesanan: ");
        jmlPesanan = sc1.nextInt();
        sc1.nextLine();

        String menu[]= new String[jmlPesanan];
        int harga[]= new int[jmlPesanan];
        for (int i = 0; i < harga.length; i++) {
            System.out.print("Menu -"+(i+1)+" : ");
            menu[i]=sc1.nextLine();
            System.out.print("Harga -"+(i+1)+ " : ");
            harga[i]=sc2.nextInt();
        }
        int total=0;
        for (int i = 0; i < harga.length; i++) {
            total +=harga[i];
        }
        System.out.println();
        for (int i = 0; i < harga.length; i++) {
            System.out.println("Menu yang dipesan");
            System.out.println("Menu-"+(i+1)+" yaitu:   "+menu[i]);
        }
        System.out.println();
        System.out.println("Total yang harus dibayarkan:   "+total);
        sc1.close();
        sc2.close();
    }
}
