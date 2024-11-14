package WEEK12;

import java.util.Scanner;

public class ngulangstudikasus {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jenis barang: ");
        int jumlahJenisBarang= sc. nextInt();
        System.out.print("Masukkan jumlah lokasi penyimpanan: ");
        int jumlahPenyimpanan = sc.nextInt();
        sc.nextLine();

        String namaBarang[] = new String[jumlahJenisBarang];
        String namaGudang[] = new String[jumlahPenyimpanan];
        int inventaris[][] = new int[jumlahJenisBarang][jumlahPenyimpanan];

        //input nama lokasi
        System.out.println("Masukkan nama kota untuk setiap lokasi:");
        for (int i = 0; i < namaGudang.length; i++) {
            System.out.print("Kota untuk  lokasi "+(i+1)+": ");
            namaGudang[i] = sc.nextLine();
        }
        //input nama jenis barang
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.print("Masukkan jenis barang : ");
            namaBarang[i] = sc.nextLine();
        }
        //data barang
        System.out.println("DATA INPUT BARANG");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println((i+1)+"-"+namaBarang[i]);
        }
        // data lokasi
        System.out.println("DATA INPUT BARANG");
        for (int i = 0; i < namaGudang.length; i++) {
            System.out.println((i+1)+"-"+namaGudang[i]);
        }
        //input data barang
        System.out.println();
        System.out.println("INPUT DATA");
        while (true) {
            //karena yang ditanya jenis barang jadi automatis kita butuh memasukkan index nama barang
            System.out.print("Jenis barang (1-"+(namaBarang.length)+"): ");
            int indexBarang = sc.nextInt();
            if (indexBarang>namaBarang.length || indexBarang < 0) {
                System.out.println("Masukkan index yang benar!");
                continue;
            }
            
            System.out.print("Lokasi (1-"+(namaGudang.length)+"): ");
            int indexGudang = sc.nextInt();
            if (indexGudang>namaGudang.length || indexGudang < 0) {
                System.out.println("Masukkan index yang benar!");
                continue;
            }
            
            System.out.print("Tambah stok: ");
            int tambahStok = sc.nextInt();
            
            //Masukkan ke input kedalam array
            inventaris[indexBarang-1][indexGudang-1] += tambahStok;

            System.out.print("Lanjut?(0/1)");
            int lanjut = sc.nextInt();
            if (lanjut==0) {
                break;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Tabel stok gudang: ");
        for (int i = 0; i < namaGudang.length; i++) {
            System.out.print("\t"+namaGudang[i]);
        }
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.print("\n"+namaBarang[i]+":\t");
            for (int j = 0; j < inventaris[i].length; j++) {
                System.out.print(inventaris[i][j]+"\t");
            }
            System.out.println();
        }
        int total = 0;
        //karena yang ditotal baris maka kita harus memasukkan nilai pada setiap kolom
        //maka dari itu kita membuat di dalam for J
        System.out.println("Total stok untuk setiap jenis barang");
        for (int i = 0; i < inventaris.length; i++) {
            total = 0;
            for (int j = 0; j < inventaris[i].length; j++) {
                total += inventaris[i][j];
            }
            System.out.println("Jenis "+namaBarang[i]+": "+total);
        }
        
        //jika kita ingin menghitung total dari setiap lokasi 
        //maka kita harus membalik j menjadi baris i menjadi kolom
        int totaldiKota=0;
        for (int j = 0; j < namaGudang.length; j++) {
            totaldiKota=0;
            for (int i = 0; i < namaBarang.length; i++) {
                totaldiKota += inventaris[i][j];
            }
            System.out.println("Kota "+namaGudang[j]+": "+totaldiKota);
        }
        System.out.println();
        System.out.println("Lokasi dengan stok terbanyak untuk setiap jenis barang:");
        int indxMax = 0;
        for (int i = 0; i < inventaris.length; i++) {
            indxMax = 0;
            for (int j = 0; j < inventaris[i].length; j++) {
                //jika inventaris dengan index i+j lebig besar dari pada inventaris index i dan indMax
                //maka j masuk ke indexMax , lanjut perulangan j, jika sudah lanjut ganti baris
                if (inventaris[i][j] > inventaris[i][indxMax]) {
                    indxMax=j;
                }
            }
            if (indxMax==0) {
                System.out.println("Tidak ada Stok barang ini");
            }else{
            //utntuk menampilkan indexmax gimana?
            System.out.println("Jenis barang : "+namaBarang[i]+" yaitu di "+namaGudang[indxMax]); //pemanggilan ada di array namaGudang
            }
        }
    }
}
