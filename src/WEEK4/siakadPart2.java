import java.util.Scanner;
public class siakadPart2 {
    
public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    
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
        
        nilaiAkhir= (nilaiKuis*0.2)+(nilaiTugas*0.15)+(nilaiUTS*0.3)+(nilaiUAS*0.35);
    
        System.out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
    
        if (nilaiAkhir>80) {
            System.out.println("Nilai akhir huruf: "+"A");
            System.out.println("Kualifikasi: Sangat Baik");
        } 
        else  if (nilaiAkhir>73) {
            System.out.println("Nilai akhir huruf: "+"B+");
            System.out.println("Kualifikasi: Lebih dari Baik");
        } 
        else  if (nilaiAkhir>65) {
            System.out.println("Nilai akhir huruf: "+"B");
            System.out.println("Kualifikasi: Baik");
        }
        else  if (nilaiAkhir>60) {
            System.out.println("Nilai akhir huruf: "+"C+");
            System.out.println("Kualifikasi: Lebih dari Cukup");
        } 
        else  if (nilaiAkhir>50) {
            System.out.println("Nilai akhir huruf: "+"C");
            System.out.println("Kualifikasi: Cukup");
        } 
        else if (nilaiAkhir>39) {
            System.out.println("Nilai akhir huruf: "+"D");
            System.out.println("Kualifikasi: Kurang");
        }
        else {
            System.out.println("Nilai akhir huruf: "+"E");
            System.out.println("Kualifikasi: Gagal");
        }
        
            
        sc.close();
        }
    }

