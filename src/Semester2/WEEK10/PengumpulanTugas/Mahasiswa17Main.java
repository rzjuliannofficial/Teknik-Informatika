package WEEK10.PengumpulanTugas;

import java.util.Scanner;
public class Mahasiswa17Main {
    public static void main(String[] args) {
        StackTugasMahasiswa17 stack = new StackTugasMahasiswa17(5);
        
        Scanner scan = new Scanner(System.in);
        int pilih = 0;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3 Menelihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih Menu: ");
            pilih = scan.nextInt();
            scan.nextLine(); 
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa17 mhs = new Mahasiswa17(nama, nim, kelas); //buat objek mahasiswa baru
                    stack.push(mhs); //masukkan objek mahasiswa ke stack
                    //System.out.printf("Tugas %s telah berhasil dikumpulkan.\n", mhs.nama); //%s// format untuk menampilkan string
                    System.out.println();
                    break;

                case 2:
                    Mahasiswa17 dinilai = stack.pop(); //mengambil objek mahasiswa dari stack
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai); //menetapkan nilai pada objek mahasiswa
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai); //%d// format untuk menampilkan integer
                    }
                    System.out.println();
                    break;

                case 3:
                    Mahasiswa17 lihat = stack.peek(); //mengambil objek mahasiswa dari stack
                    if (lihat != null) {
                        System.out.println("Tugas Terakhir dikumpulkan oleh: " + lihat.nama );
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Daftar Semua Tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print(); //menampilkan semua objek mahasiswa dalam stack
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    System.out.println();
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);
        scan.close();
    }
}
