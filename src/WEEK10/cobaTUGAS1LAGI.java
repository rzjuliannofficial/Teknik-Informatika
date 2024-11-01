package WEEK10;
import java.util.Scanner;
public class cobaTUGAS1LAGI {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    
    System.out.print("Masukkan jumlah mahasiswa yang akan diinput: ");
    int jmlMhs = sc.nextInt();

    int nilai[]= new int[jmlMhs];
    for (int i = 0; i < nilai.length; i++) {
        System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
        nilai[i] = sc.nextInt();
    }

    double total=0;
    for (int i = 0; i < nilai.length; i++) {
        total += nilai[i]; 
    }
    double rata2 = total / jmlMhs ;
    System.out.println("Rata-rata nilai mahasiswa adalah : "+rata2);

    int min,max;
    min=max=nilai[0];
    for (int i = 1; i < nilai.length; i++) {
        if (min >  nilai[i]) {
            min = nilai[i];
        }
        if (max <   nilai[i]) {
            max = nilai[i];
        }
        System.out.println();
        System.out.println("Nilai tertinggi yaitu  : "+max);
        System.out.println("Nilai terendah yaitu : "+min);
    }
    for (int i = 0; i < nilai.length; i++) {
        System.out.println("Nilai mahasiswa ke-"+(i+1)+" adalah "+nilai[i]);
       if (nilai[i]>70) {
            System.out.println("Mahasiswa Lulus");
        } else {
            System.out.println("Mahasiswa Gagal");
        } 
    }
    
    sc.close();
}    
}
