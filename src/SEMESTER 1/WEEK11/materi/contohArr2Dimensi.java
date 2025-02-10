package WEEK11.materi;

import java.util.Scanner;

public class contohArr2Dimensi {

    public static void main(String[] args) {

        //Nested loop untuk mengisikan nilai array
        Scanner sc = new Scanner(System.in);
        //metod Deklarasi & instansiasi
        int penjualan[][]= new int[2][4];

        for (int i = 0; i < penjualan.length; i++) { 
            System.out.println("Toko ke-"+(i+1));
            for (int j = 0; j < penjualan[i].length; j++) { //j < penjualan[i].length untuk memastikan bahwa perulangan j berjalan sesuai dengan panjang array pada dimensi kedua =4
                System.out.print("    Data ke-"+(j+1)+": ");
                penjualan[i][j] = sc.nextInt();
            }
        }
        sc.close();
    }
}