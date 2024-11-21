package WEEK12;

import java.util.Scanner;

public class studiKasus17 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //inventaris
        int jumlahBarang, jumlahLokasi;
        int totalBarang = 0 ;

        System.out.print("Masukkan jumlah jenis barang: ");
        jumlahBarang = sc.nextInt();
        System.out.print("Masukkan jumlah lokasi: ");
        jumlahLokasi = sc.nextInt();
        sc.nextLine();
        //pembuatana Array
        String namaKota [] = new String[jumlahLokasi];
        String namaBarang [] = new String[jumlahBarang];
        int inventaris[][]=new int[jumlahBarang][jumlahLokasi];
        
        //pengisian array kota
        System.out.println("Masukkan nama barang!");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.print("Masukkan nama barang ke-"+(1+i)+": ");
            namaBarang[i]= sc.nextLine();
        }
        System.out.println();
        System.out.println("Masukkan nama kota!");
        for (int i = 0; i < namaKota.length; i++) {
            System.out.print("Masukkan untuk lokasi ke-"+(i+1)+": ");
            namaKota[i]= sc.nextLine();
        }
        System.out.println("Info Barang");
        for (int i = 0; i < inventaris.length; i++) {
            System.out.println((i+1)+"-"+namaBarang[i]);
        }
        System.out.println("Info Lokasi");
        for (int i = 0; i < namaKota.length; i++) {
            System.out.println((i+1)+"-"+namaKota[i]);
        }
        //pengisian stok barang
        System.out.println();
        System.out.println("Mengisi stok barang...");
        System.out.println();
        //perulangan input
        while (true) {
            System.out.print("jenis barang (1-"+(jumlahBarang)+"): ");
            int indexJenisBarang = sc.nextInt();
            System.out.print("Lokasi(1-"+(jumlahLokasi)+"): ");
            int indexLokasi = sc.nextInt();
            System.out.print("Tambah Stok: ");
            int tambahStok = sc.nextInt();
            sc.nextLine();
            inventaris[indexJenisBarang-1][indexLokasi-1] += tambahStok; //dengan adanya ini maka stok akan bertambah seiring kita mengisi

            System.out.print("Lanjut?(y/n)");
            char jawaban = sc.nextLine().charAt(0);
            if (jawaban=='n') {
                break;
            }
            if (jawaban=='N') {
                break;
            }
            System.out.println();
        }

        //menampilkan tampilan tabel
        System.out.println();
        System.out.println("Tabel Stok Gudang: ");
        //bagian kolom
        for (int i = 0; i < namaKota.length; i++) {
            System.out.print("\t"+namaKota[i]+"\t");
        }
        //bagian baris dan isi nya
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.print("\n"+namaBarang[i]+":");
            for (int j = 0; j < inventaris[i].length; j++) {
                System.out.print("\t"+inventaris[i][j]+"\t");
            }
        }

        //mengtotal stok pada setiap jenis barang
        System.out.println();
        System.out.println();
        System.out.println("Total stok untuk setiap jenis barang: ");
        int totalJenisBarang=0;
        for (int i = 0; i < inventaris.length; i++) {
            totalJenisBarang=0;
            for (int j = 0; j < inventaris[i].length; j++) {
                totalJenisBarang += inventaris[i][j];
            }
            System.out.println(namaBarang[i]+": "+totalJenisBarang);
        } 
        System.out.println();

        //mencari stok terbanyak pada setiap KOTA
        System.out.println("Lokasi dengan stok terbanyak untuk setiap jenis barang:");
        for (int i = 0; i < inventaris.length; i++) {
            int indexMax = 0;
            for (int j = 0; j < inventaris[i].length; j++) {
                if (inventaris[i][j] > inventaris[i][indexMax]) { //jika inventaris[i][j] lebih besar dari inventaris[i][indexMax]
                    indexMax=j;                                   // jadi untuk setiap baris inventaris [i][indexmax] selalu menjadi acuan untuk nilai max
                }
            }
            if (indexMax==0) {
                System.out.println("Jenis barang ke-"+(i+1)+": "+namaBarang[i]+" = tidak ada stok ");
            }else {
            System.out.println("Jenis barang ke-"+(i+1)+": "+namaBarang[i]+" dengan stok terbanyak di "+namaKota[indexMax]);
            }
        }
    }
}
