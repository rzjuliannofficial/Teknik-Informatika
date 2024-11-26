package WEEK13.Jobsheet10;
import java.util.Scanner;

public class ModifikasiTugasCafe {
    //fungsi input data 
    public static int[][] inputData(int[][] rekapNilai, String siswa[] ) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < siswa.length; i++) {
            System.out.print("Nama : ");
            siswa[i] = sc.nextLine();
            for (int j = 0; j < rekapNilai[i].length;  j++) {
                System.out.print("Nilai pelajaran ke-" + (j + 1) + " : ");
                rekapNilai[i][j] = sc.nextInt();
            }
            sc.nextLine();
            System.out.println();
        }
        sc.close();
        return rekapNilai; // Mengembalikan array setelah diisi
    }

    //fungsi menampilkan keseluruhan data
    public static void tabel(int[][] rekapNilai, String siswa[], int jumlahPelajaran ) {
        System.out.print("\t");
        for (int i = 0; i < jumlahPelajaran; i++) {
            System.out.print("\tpelajaran ke-"+(1+i));
        }
        for (int i = 0; i < siswa.length; i++) {
            System.out.print("\n"+siswa[i]+" :\t");
            for (int j = 0; j < rekapNilai[i].length; j++) {
                System.out.print("\t"+rekapNilai[i][j]+"\t");
            }
        }
        System.out.println();
    }
    
    //fungsi  menampilkan siswa yang memiliki nilai tertinggi
    public static void nilaiTertinggi(int[][] rekapNilai, String[] siswa) {
        double rata2 = 0;
        int tertinggi = 0;
        int totalPerSiswa = 0;
        int indexMax = 0;
        System.out.println();
        for (int i = 0; i < siswa.length; i++) {
            rata2 = 0;
            for (int j = 0; j < rekapNilai[i].length; j++) {
                totalPerSiswa += rekapNilai[i][j];
            }
            if (totalPerSiswa > tertinggi) {
                indexMax = i;
            }
            rata2 = totalPerSiswa / rekapNilai[i].length;
            System.out.println();
            System.out.println("Total nilai siswa "+siswa[i]+" adalah : "+totalPerSiswa);
            System.out.println("Rata- rata "+siswa[i]+" adalah : "+rata2);
        }
        System.out.println();
        System.out.println("Menu yang memiliki penjualan tertinggi adalah : "+siswa[indexMax]);
    
    }

    //fungsi main
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah siswa: ");
        Scanner sc = new Scanner(System.in);
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah pelajaran: ");
        int jumlahPelajaran = sc.nextInt();

        String siswa[] = new String[jumlahSiswa];
        int rekapNilai[][]= new int[jumlahSiswa][jumlahPelajaran];
        
        //pemanggilan fungsi
        inputData(rekapNilai, siswa);
        tabel(rekapNilai, siswa, jumlahPelajaran);
        nilaiTertinggi(rekapNilai, siswa);
        
        
        sc.close();
    }
}


