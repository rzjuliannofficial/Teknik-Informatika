package WEEK10;

import java.util.Scanner;

public class arrayNilai17 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    
    int nilaiAkhir[] = new int[10];

    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.print("Masukkan nilai akhir ke-"+i+" : ");
        nilaiAkhir[i]=sc.nextInt();
    }
    System.out.println();
    for (int i = 0; i < nilaiAkhir.length; i++) {
        System.out.println("Nilai akhir ke-"+i+" adalah "+nilaiAkhir[i]);
    }
    
    sc.close();
    }
}
