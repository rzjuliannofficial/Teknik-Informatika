package WEEK11.jobseet;

import java.util.Scanner;

public class siakad17 {
    public static void main(String[] args) {
        int jmlMhs, jmlMatkul;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Mahasiswa yang akan diinput: ");
        jmlMhs = sc.nextInt();
        System.out.print("Masukkan Jumlah Matkul yang akan diinput: ");
        jmlMatkul = sc.nextInt();
        int nilai[][]= new int[jmlMhs][jmlMatkul];
        
        //menghitung dan menampilkan rata2 nilai mahasiswa
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Input nilai mahasiswa ke-"+(i+1));
            double totalPerSiswa=0;
            
            for (int j = 0; j < nilai[i].length; j++) {
                System.out.print("Nilai mata kuliah "+(j+1)+": ");
                nilai[i][j]= sc.nextInt();
                totalPerSiswa+=nilai[i][j];
            }
            System.out.println("Nilai rata - rata: "+ totalPerSiswa/nilai[i].length);
        }

        System.out.println("\n==============================================");
        System.out.println("Rata-rata Nilai Mahasiswa Pada Setiap Mata Kuliah:");
        //karena yang diminta setiap mata kuliah . maka yang kita operasikan nilai pd matkul 
        //jd kita jadikan J sebagai baris(jml mahasiswa), dan jadikan i sebagai kolom(nilai matkul)
        for (int j = 0; j < jmlMatkul; j++) {//agar input lebih dinamis
            double totalPerMatkul=0;
            
            for (int i = 0; i < nilai.length; i++) {
                totalPerMatkul+=nilai[i][j];
            }
            System.out.println("Mata kuliah ke-"+(j+1)+ ": "+totalPerMatkul/nilai.length);
        }
        sc.close();
    }
}
