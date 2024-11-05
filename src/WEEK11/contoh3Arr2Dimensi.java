package WEEK11;

import java.util.Scanner;

public class contoh3Arr2Dimensi {
    public static void main(String[] args) {

        //Nested loop untuk menampilkan nilai array dengan foreach
        Scanner sc = new Scanner(System.in);
        //metod inisialisasi
        int penjualan[][]= {
            {1,2,3,4},
            {5,6,7,8}
        };

        for (int i = 0; i < penjualan.length; i++) { 
            System.out.print("Toko ke-"+(i+1)+": ");
            for (int hasil : penjualan[i]) { // sebagai variabel sementara yang menyimpan setiap elemen pada array penjualan[i] 
                System.out.print(hasil +" "); 
            }
            System.out.println();
        }
        sc.close();
    }
    
}
