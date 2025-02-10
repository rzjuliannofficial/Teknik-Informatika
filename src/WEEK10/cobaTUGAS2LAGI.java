package WEEK10;
import java.util.Scanner;

public class cobaTUGAS2LAGI {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        
        int jmlPesanan ;
        System.out.print("Masukkan jumlah pesanan: ");
        jmlPesanan = sc1.nextInt();

        String arrMenu[]=new String[jmlPesanan];
        int arrHarga[]= new int[jmlPesanan];
        for (int i = 0; i < arrHarga.length; i++) {
            System.out.print("Menu yang ke-"+(i+1)+"ingin dipesan: ");
            arrMenu[i] = sc2.nextLine();
            System.out.print("Harga: ");
            arrHarga[i] = sc1.nextInt();
        }
        int totalHarga = 0; 
        for (int i = 0; i < arrHarga.length; i++) {
            totalHarga +=   arrHarga[i];
        }
        System.out.println();
        for (int i = 0; i < arrHarga.length; i++) {
            System.out.println("Menu yang dipesan: "+arrMenu[i]);
        }
        System.out.println("Total Harga: "+totalHarga);
        sc1.close();
        sc2.close();
    }
}
