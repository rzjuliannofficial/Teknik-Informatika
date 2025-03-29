package WEEK7.TugasPraktikum;
import java.util.Scanner;

public class dosen17Main_nextW3_W6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah data dosen : ");
        int jumlahData = sc.nextInt();
        sc.nextLine();
        
        dosen17[] arrDosen = new dosen17[jumlahData]; //deklarasi array of object
        String kode, nama;
        boolean jk;
        int usia;

        for (int i = 0; i < arrDosen.length;i++) {
            System.out.println("Data Dosen ke-" + (i+1));
            System.out.print("Kode\t\t\t: ");
            kode = sc.nextLine();
            System.out.print("Nama\t\t\t: ");
            nama = sc.nextLine();

            while(true){
                System.out.print("Jenis Kelamin(P/W)\t: ");
                String jenisKelamin = sc.nextLine();
                    if (jenisKelamin.equalsIgnoreCase("P" )) {
                        jk = true;
                        break;
                    }
                    else if (jenisKelamin.equalsIgnoreCase("W")) {
                        jk=false;
                        break;
                    }
                    else {
                        System.out.println("Input yang anda masukkan invalid");
                    }
                }

            System.out.print("Usia\t\t\t: ");
            usia = sc.nextInt();
            sc.nextLine(); // menghilangkan buffer, bisa menggunakan konvert (int.parseInt)
            arrDosen[i] = new dosen17(kode ,nama ,jk, usia); //inisialisasi objek
            
            System.out.println("-----------------------------------");
        }

        //deklarasi objek dari class lain
        dataDosen17 dataDosen = new dataDosen17(); // deklarasi objek dataDosen dari class dataDosen17 
        sortingData17 sortingUmur = new sortingData17(); // deklarasi objek sorting Umur dari class sortingData17
        searchingData17 searchingData = new searchingData17(); // deklarasi objek searchingData dari class searchingData17


        while (true) {    
        System.out.println();
        System.out.println("===================== SIAKAD ======================");
        System.out.println("1. Tampilkan Data Dosen");
        System.out.println("2. Sorting Data Dosen Berdasarkan Usia (ASC)");
        System.out.println("3. Sorting Data Dosen Berdasarkan Usia (DESC)");
        System.out.println("4. Pencarian Data Dosen Berdasarkan Nama(Sequential Search)");
        System.out.println("5. Pencarian Data Dosen Berdasarkan Usia(Binary Search)");
        System.out.println("6. Keluar");
        System.out.println("Note: Khusus Binary Search, data harus diurutkan terlebih dahulu");
        System.out.println("===================================================");
        System.out.print("Masukkan pilihan menu: ");
        int pilihan = sc.nextInt();
        System.out.println("===================================================");
        sc.nextLine(); // menghilangkan buffer, bisa menggunakan konvert (int.parseInt)
        switch (pilihan) {
            case 1:
                System.out.println("Menu 1: Tampilkan Data Dosen");
                System.out.println("---------------Menampilkan Data Dosen--------------");
                dataDosen.dataSemuaDosen(arrDosen);
                dataDosen.jumlahDosenPerJenisKelamin(arrDosen);
                dataDosen.rerataUsiaDosenPerJenisKelamin(arrDosen);
                dataDosen.infoDosenPalingTua(arrDosen);
                dataDosen.infoDosenPalingMuda(arrDosen);
                System.out.println();
                break;
            case 2:
                System.out.println("Menu 2: Sorting Data Dosen Berdasarkan Usia (ASC)");
                sortingUmur.bubbleSortASC(arrDosen);
                sortingUmur.tampil(arrDosen);
                System.out.println();
                break;
            case 3:
                System.out.println("Menu 3: Sorting Data Dosen Berdasarkan Usia (DESC)");
                sortingUmur.insertionSortDESC(arrDosen);
                sortingUmur.tampil(arrDosen);
                System.out.println();
                break;
            case 4:
                System.out.println("Menu 4: Pencarian Data Dosen Berdasarkan Nama");
                System.out.print("Masukkan nama dosen yang dicari: ");
                String cariNama = sc.nextLine();
                searchingData.PencarianDataSequential(arrDosen, cariNama); //memanggil method sequential search
                // searchingData.tampilDataSearch(arrDosen, posisi, cariNama);
                break;
            case 5:
                System.out.println("Menu 5: Pencarian Data Dosen Berdasarkan usia");
                System.out.print("Masukkan usia dosen yang dicari: ");
                int cariUmur = sc.nextInt();
                sc.nextLine(); // menghilangkan buffer, bisa menggunakan konvert (int.parseInt)
                searchingData.PencarianDataBinary(arrDosen, cariUmur,0 , arrDosen.length-1); //memanggil method sequential search
                //searchingData.tampilDataSearch(arrDosen, posisi, cariUmur);
                break;

            case 6:
                System.out.println("Terima kasih telah menggunakan program ini");
                return;
            default:
                System.out.println("Pilihan tidak valid, silakan coba lagi.");
                break;
            }
        }
    }
}