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
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.println("=== Ajukan Surat Ijin ===");
                    System.out.print("Id Surat: " );
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
                
                    case 2:
                    System.out.println("=== Proses Surat Ijin ===");
                    Surat17 proses = stackSurat.pop(); // Mengambil surat dari stack
                    if (proses != null) {
                        System.out.println("Proses surat dari " + proses.namaMahasiswa);
                        System.out.println("Surat Ijin dengan detail");
                        proses.tampilkanSurat(); // Menampilkan detail surat
                        System.out.println("Surat Ijin telah diproses.");
                        System.out.println("=========================================");
                    }
                    System.out.println();
                    break;

                    case 3:
                    System.out.println("=== Surat Ijin Terakhir ===");
                    Surat17 lihat = stackSurat.peek(); // Mengambil surat teratas dari stack
                    if (lihat != null) {
                        System.out.println("Surat Terakhir diajukan oleh: " + lihat.namaMahasiswa);
                        System.out.println("Surat Ijin dengan detail");
                        lihat.tampilkanSurat();
                    }
                    System.out.println();
                    break;

                    case 4:
                    System.out.println("=== Cari Surat Ijin ===");
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String namaMahasiswa = sc.nextLine();
                    stackSurat.searchingSurat(namaMahasiswa); // Mencari surat berdasarkan nama mahasiswa
                    System.out.println();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    System.out.println();
                    break;
            }
        } while (pilih != 0);
        System.out.println(" Keluar dari program ");
        sc.close();
    }
}
