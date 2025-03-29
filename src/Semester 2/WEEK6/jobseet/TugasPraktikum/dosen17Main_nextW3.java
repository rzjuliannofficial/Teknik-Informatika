package WEEK6.jobseet.TugasPraktikum;
import java.util.Scanner;

public class dosen17Main_nextW3 {
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

        System.out.println("Menampilkan data dosen");
        // for (int i = 0; i < arrDosen.length; i++) {
        //     arrDosen[i].tampilkanInfo();
        // }
        for (dosen17 tampilan : arrDosen) {
            tampilan.tampilkanInfo();
        }

        System.out.println();
        System.out.println("---------------Menampilkan Data Dosen--------------");
        dataDosen17 dataDosen = new dataDosen17(); //datadosen itu adalah 
        dataDosen.dataSemuaDosen(arrDosen);
        dataDosen.jumlahDosenPerJenisKelamin(arrDosen);
        dataDosen.rerataUsiaDosenPerJenisKelamin(arrDosen);
        dataDosen.infoDosenPalingTua(arrDosen);
        dataDosen.infoDosenPalingMuda(arrDosen);
        System.out.println();
        sc.close();
        
        //sorting data umur
        sortingData17 sortingUmur = new sortingData17(); // deklarasi objek sorting
        System.out.println("---------------Menampilkan Urutan Umur Dosen--------------");
        sortingUmur.bubbleSortASC(arrDosen);
        sortingUmur.tampil(arrDosen);
        System.out.println();
        
        System.out.println("---------------Menampilkan Urutan Umur Dosen--------------");
        sortingUmur.insertionSortDESC(arrDosen);
        sortingUmur.tampil(arrDosen);
        System.out.println();
    }
}