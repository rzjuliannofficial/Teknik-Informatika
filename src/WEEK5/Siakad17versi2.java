package WEEK5;
import java.util.Scanner;

public class Siakad17versi2 {
  public static void main(String[] args) {
    //deklarasi scanner
        Scanner sc = new Scanner(System.in);
    //deklarasi variable
        String nama, nim, nilaiHuruf= "", kualifikasi="";
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    //deklarasi input
        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan kelas: ");
        kelas = sc.nextLine().charAt(0); // kode tsb digunakan mengoutput 1 kata dari input, 0 menandakan mengoutput huruf pertama.
        System.out.print("Masukkan nomor absen: ");
        absen = sc.nextByte();
    
        System.out.print("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukkan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        nilaiUTS = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        nilaiUAS = sc.nextDouble();
      //operator

        nilaiAkhir= (nilaiKuis*0.2)+(nilaiTugas*0.15)+(nilaiUTS*0.3)+(nilaiUAS*0.35);
    
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

    
    
    if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
      nilaiHuruf = "A";
      kualifikasi = "Sangat Baik";
    } 
    else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
      nilaiHuruf = "B+";
      kualifikasi = "Lebih dari Baik";
    }
    else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
      nilaiHuruf = "B" ;
      kualifikasi = "Baik";
    }
    else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
      nilaiHuruf = "C+";
      kualifikasi = "Lebih dari Cukup";
    }
    else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
      nilaiHuruf = "C" ;
      kualifikasi = "Cukup";
    }
    else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
     nilaiHuruf = "D";
      kualifikasi = "Kurang";
    }
    else {
      nilaiHuruf = "E" ;
      kualifikasi = "Gagal";
    }

    // Tampilkan output
    System.out.println("Nama: " + nama + " NIM: " + nim);
    System.out.println("Kelas: " + kelas + " Absen: " + absen);
    System.out.println("Nilai akhir: " + nilaiAkhir);
    System.out.println("Nilai akhir huruf: " + nilaiHuruf);
    System.out.println("Kualifikasi: " + kualifikasi);
  sc.close();
  }
}