package WEEK10.PengajuanIjinMahasiswa;
import java.util.Scanner;

public class SuratMain17 {
    public static void main(String[] args) {
        StackSurat17 stackSurat = new StackSurat17(5); // Membuat stack dengan ukuran 5 surat
        Scanner sc = new Scanner(System.in);
        int pilih = 0;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Ajukan Surat Ijin");
            System.out.println("2. Proses Surat Ijin");
            System.out.println("3. Lihat Surat Ijin Terakhir(terbaru)");
            System.out.println("4. Cari Surat (Berdasarkan Nama)");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // Membersihkan newline character dari input buffer
            switch (pilih) {
                case 1:
                    System.out.println("=== Ajukan Surat Ijin ===");
                    System.out.print("Id Surat:" );
                    String idSurat = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Jenis Surat Ijin (i / s): ");
                    char jenisIjin = sc.next().charAt(0);
                    System.out.print("Durasi Ijin (dalam hari): ");
                    int durasi = sc.nextInt();
                    Surat17 surat = new Surat17(idSurat, nama, kelas, jenisIjin, durasi); // Membuat objek surat baru
                    stackSurat.push(surat); // Menambahkan surat ke stack
                    System.out.println();
                    break;
                
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }
        } while (pilih != 0);
        System.out.println(" Keluar dari program ");
        sc.close();
    }
}
