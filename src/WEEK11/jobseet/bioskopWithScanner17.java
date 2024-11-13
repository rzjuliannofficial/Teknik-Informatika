package WEEK11.jobseet;

import java.util.Scanner;

public class bioskopWithScanner17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, next="";
        int kolom, baris, pilihan;
        String penonton[][] = new String[4][2];
      
        while (true) {
            //input data peserta 
            System.out.println("========================");
            System.out.println("Selamat Datang di Aplikasi Bioskop");
            System.out.println("1. Input data");
            System.out.println("2. Tampilkan data/daftar penonton");
            System.out.println("3. Exit");
            System.out.println("========================");
            System.out.print("Masukkan pilihan Anda (1-3): ");
            pilihan = sc.nextInt();
            sc.nextLine(); //untuk menghilangkan enter yang tersisa di buffer input
            
            //mengecek pilihan user
            if (pilihan>3 || pilihan<1) {
                System.out.println("Masukkan pilihan yang benar!");
                System.out.println();
                continue;
            }
            if (pilihan==1) {
                while (true) {
                    System.out.println("Anda masuk ke menu ke-"+pilihan);
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.println("==NOTE: KURSI HANYA TERSEDIA DENGAN "+penonton.length+" BARIS DAN "+penonton[0].length+" KOLOM==");
                    System.out.print("Masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine(); // untuk menghilangkan enter yang tersisa di inputan
                
                    //mengecek apakah kursi valid
                    if (baris>penonton.length || kolom>penonton[0].length || baris <= 0 || kolom <= 0){
                        System.out.println("Kursi tidak tersedia!");
                        continue;
                    }

                    //jadi jika pada array hasilnya tidk sama dengan null, maka di array tsb sdh ada isinya
                    //jadi sintask ini hanya untuk melihat kondisi dalam array ada isinya apa tidak
                    if(penonton[baris-1][kolom-1] != null){
                        System.out.println("Kursi tersebut sudah terisi oleh penonton lain!");
                        System.out.println("Silakan masukkan kembali baris dan kolom yang kosong.");
                        continue; // Kembali ke awal loop untuk meminta input baris dan kolom kembali
                    }
                    //selanjutnya jika tidak sama dengan pernyataan kondisi diatas, maka lanjut ke proses masukkan data ke array
                    //menyimpan nama ke array/ kursi yang dipilih
                    penonton[baris - 1][kolom - 1] = nama ;
                    System.out.println("Kursi berhasil dibooking!");
                    
                    System.out.print("Input penonton lainnya? (y/n): ");
                    next = sc.next(); //sc.next() digunakan dalam kode tersebut untuk membaca satu kata dari input pengguna
                    sc.nextLine();
                    if (next.equalsIgnoreCase("n")) {
                        System.out.println("Terimakasih telah menggunakan aplikasi bioskop");
                        break;
                        
                    }    
                }
            } else if (pilihan==2) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    // Buat array1D sementara untuk mengganti nilai null dengan "***"

                    String tampung[]= new String[penonton[i].length];
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] == null) {
                            tampung[j]="***";
                        }else{
                            tampung[j]=penonton[i][j];
                        }
                    }
                    //String.join() digunakan untuk menggabungkan elemen-elemen dari suatu array atau collection menjadi satu string
                    //untuk tampilan array agar kesamping 
                    System.out.println("Penonton pada baris ke-"+(i+1)+": "+String.join(" || ",tampung));
                }
            } else {
                System.out.println("Terimakasih telah menggunakan aplikasi");
                break;
            }
            
        }
        sc.close();
    }
}
