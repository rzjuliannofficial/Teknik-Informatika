package WEEK11;

import java.util.Scanner;

public class contoh2Arr2Dimensi {
    public static void main(String[] args) {

        //Nested loop untuk menampilkan nilai array
        Scanner sc = new Scanner(System.in);
        
        //metod inisialisasi
        int penjualan[][]= {
            {32,33,44,55}, 
            {22,33,33,44}
        };

        for (int i = 0; i < penjualan.length; i++) { 
            System.out.print("Toko ke-"+(i+1)+": ");
            for (int j = 0; j < penjualan[i].length; j++) { //j < penjualan[i].length untuk memastikan bahwa perulangan j berjalan sesuai dengan panjang array pada dimensi kedua =4
                System.out.print(penjualan[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
