package WEEK11.jobseet;

import java.util.Arrays;

public class numbers17 {
    public static void main(String[] args) {
        int myNumber[][]= new int[3][];
        myNumber[0] = new int[5];
        myNumber[1] = new int[3];
        myNumber[2] = new int[1];
        
        // Metode ini berguna ketika kita ingin melihat isi dari array dengan 
        // format yang mudah dibaca, terutama untuk tujuan debugging atau pencetakan output.
        for (int i = 0; i < myNumber.length; i++) {
            System.out.println(Arrays.toString(myNumber[i]));
        }
        for (int i = 0; i < myNumber.length; i++) {
            System.out.println("Panjang baris ke-"+(i+1)+ ": " + myNumber[i].length);
        }    
        
        //jika kita menggunakan array multidimensi (misalnya int[][] myNumbers), kita bisa memiliki baris dengan panjang yang berbeda dalam setiap kolomnya
        //tetapi baris jika sudah di intasisasi tidak dapat diubah panjangnya
        myNumber[0] = new int[10];
        myNumber[1] = new int[7];
        myNumber[2] = new int[5];
        // Metode ini berguna ketika kita ingin melihat isi dari array dengan 
        // format yang mudah dibaca, terutama untuk tujuan debugging atau pencetakan output.
        for (int i = 0; i < myNumber.length; i++) {
            System.out.println(Arrays.toString(myNumber[i]));
        }
        for (int i = 0; i < myNumber.length; i++) {
            System.out.println("Panjang baris ke-"+(i+1)+ ": " + myNumber[i].length);
        }
    } 
}
