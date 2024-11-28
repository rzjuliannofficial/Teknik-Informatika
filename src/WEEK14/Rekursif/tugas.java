package WEEK14.Rekursif;

import java.util.Scanner;

public class tugas {
    static int Rekursif(int angka[], int n){
        if (n==0) {
            return 0;
        }else {
            return (angka[n-1] + Rekursif(angka, n-1));
        }
    }
    static int Iteratif(int angka[], int n){
        int hasil = 0;
        for (int i = 0; i < n; i++) {
            hasil += angka[i];
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka yang ingin dihitung: ");
        int n = sc.nextInt();
        int angka[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nilai ke-"+(i+1)+": ");
            angka[i] = sc.nextInt();
        }
        System.out.println("Hasil rekursif: "+ Rekursif(angka, n));
        System.out.println("Hasil Iteratif: "+ Iteratif(angka, n));
    }
}
