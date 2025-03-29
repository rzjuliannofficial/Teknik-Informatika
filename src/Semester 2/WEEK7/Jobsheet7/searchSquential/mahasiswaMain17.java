package WEEK7.Jobsheet7.searchSquential;

import java.util.Scanner;

public class mahasiswaMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mahasiswaBerprestasi17 list = new mahasiswaBerprestasi17(); //buat objek list menggunakan class mahasiswaBerprestasi17
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.print("Mahasiswa Data Mahasiswa ke-"+(i+1));
            System.out.print("\nNIM\t: ");
            String nim = sc.nextLine();
            System.out.print("Nama\t: ");
            String nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            String kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("------------------------------------");
            list.tambah(new mahasiswa17(nim, nama, kelas, ipk));
        }

        list.tampil(); //memanggil method tampil dari objek class mahasiswaBerprestasi17
        System.out.println("Note: Karena kode ini blum menggunakan sorting, maka jika ingi menggunakan binary searching, inpud data harus urut(ASC)");
        System.out.println("-----------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK\t: ");
        double cari = sc.nextDouble();

        //nelakukan pencarian data sequential
        System.out.println("----------------------------------");
        System.out.println("Menggunakan sequential searching");
        System.out.println("----------------------------------");
        //mengikut jobsheet
        // double posisi = list.sequentialSearch(cari); //ini return menjadi indeks
        // int pos = (int) posisi;
        //lebih mudah menjadi
        int posisi = list.sequentialSearch(cari); //ini return menjadi indeks
        list.tampilPosisi(cari, posisi); //posisi langusng masuk indeks jadi tidak perlu ubah variabel baru
        list.tampilDataSearch(cari, posisi);
        
        //melakukan pencarian data Binary
        System.out.println("----------------------------------");
        System.out.println("Menggunakan Binary searching");
        System.out.println("----------------------------------");
        int posisi2 = list.findBinarySearch(cari, 0 , jumMhs-1);
        list.tampilPosisi(cari, posisi2);
        list.tampilDataSearch(cari, posisi2);
        sc.close();
    }
}
