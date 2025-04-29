package WEEK6.jobseet.praktikum2.modifikasiPrak2;

import java.util.Scanner;

import WEEK6.jobseet.praktikum2.mahasiswa17;

public class mahasiswaMainModifikasiInput{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        mahasiswaBerprestasi17modifikasi list = new mahasiswaBerprestasi17modifikasi();
        
        //modifikasi input 
        mahasiswa17[] arr = new mahasiswa17[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Data Mhs ke-"+(i+1));
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Nim: ");
            String nim = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("Ipk: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            arr[i] = new mahasiswa17(nama, nim, kelas, ipk);
        }
        System.out.println();

        System.out.println("Data mahasiswa sebelum sorting: ");
        list.tampil(arr);

        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort(arr);
        list.tampil(arr);
        System.out.println();
        
        sc.close();
    }
}
