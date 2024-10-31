package WEEK10;

import java.util.Scanner;

public class tugas1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs ;
        double rata2 = 0, total=0;

        System.out.print("Masukkan banyak nilai mahasiswa yang akan diinput: ");
        jmlMhs = sc.nextInt();

        //pembuatan array
        int arrayNilai[]= new int[jmlMhs];
        
        //memasukkan banyak  nilai mahasiswa
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.print("Nilai mahasiswa ke-"+(i+1)+" : ");
            arrayNilai[i] = sc.nextInt();
        }
        System.out.println();
        //menghitung rata2
        for (int i = 0; i < arrayNilai.length; i++) {
            total += arrayNilai[i];
        }
        rata2 = total / jmlMhs ;
        System.out.println("Rata- rata nilai mahasiswa : "+rata2);
        System.out.println();

        //menampilkan nilai tertinggi dan terendah
        int min , max ;
            min=max=arrayNilai[0];
        for (int i = 1; i < arrayNilai.length; i++) {
            if (max < arrayNilai[i]) {
                max = arrayNilai[i];
            } 
            if (min >  arrayNilai[i]) {
                min = arrayNilai[i];
            }
        }
        System.out.println("Nilai Max: "+max+" dan nilai Min: "+min);
        System.out.println();
        
        //menampilkan semua nilai   mahasiswa
        for (int i = 0; i < arrayNilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-"+(i+1)+" adalah "+arrayNilai[i]);
        }
        sc.close();
    }
}
