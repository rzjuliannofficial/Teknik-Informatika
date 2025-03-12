package WEEK3.Latihan;
import java.util.Scanner;

public class GuruMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan Jumlah Dosen : ");
        int jumlahDosen = sc.nextInt();
        Guru[] arrGuru = new Guru[jumlahDosen]; //

        for (int i = 0; i < arrGuru.length; i++) {
            
            System.out.println("Masukkan Kode : ");
            String kode = sc.nextLine();
            System.out.println("Masukkan Nama : ");
            String nama = sc.nextLine();
            System.out.println("Masukkan Jenis Kelamin (P/W) : ");
            String jenisKelamin = sc.nextLine();
            Boolean jk = jenisKelamin.equalsIgnoreCase("P")? true : false ; //
            System.out.print("Masukkan usia : ");
            int usia = sc.nextInt();

            arrGuru[i] = new Guru(kode, nama , jk, usia); //INISIALISASI AGAR KONECT DENGAN CLASS GURU
            arrGuru[i].tampilkanInfo(); 
        }

        for (Guru guru : arrGuru) {
            guru.tampilkanInfo();
            guru.cekUmur();
        }


        sc.close();
    }
}
