package WEEK11.Praktikum2;
import java.util.Scanner;

public class LayananAkademikSIAKAD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianLayanan17 antrian = new AntrianLayanan17(5);
        int pilihan;
        do {
            System.out.println("=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Antrian");
            System.out.println("6. Lihat Mahasiswa Terakhir");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan)  {
                case 1:
                    System.out.println("--Menu 1--");
                    System.out.print("NIM : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa17 mhs = new Mahasiswa17(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    System.out.println();
                    break;
                case 2:
                    Mahasiswa17 dilayani = antrian.layananMahasiswa17();
                    if (dilayani != null) {
                        System.out.println("Mahasiswa yang dilayani: ");
                        dilayani.tampilkanData();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("--Menu 3--");
                    antrian.lihatTerdepan();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("--Menu 4--");
                    antrian.tampilkanSemua();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("--Menu 5--");
                    System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                    System.out.println();
                    break;
                case 6:
                    System.out.println("--Menu 6--");
                    antrian.lihatTerakhir();
                    System.out.println();
                    break;
                case 7:
                    System.out.println("--Menu 7--");
                    antrian.clear();
                    System.out.println();
                    break;
                case 0:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    System.out.println();
            }
        } while (pilihan != 0);
        sc.close();
    }
}
