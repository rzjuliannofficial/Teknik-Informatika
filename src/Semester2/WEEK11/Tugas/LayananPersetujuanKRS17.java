package WEEK11.Tugas;

import java.util.Scanner;

public class LayananPersetujuanKRS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPersetujuanKRS17 antrian = new AntrianPersetujuanKRS17(10); // Maksimal 10 antrian dalam satu waktu

        int pilihan;
        do {
            System.out.println("=========================================");
            System.out.println("Layanan Persetujuan KRS oleh DPA");
            System.out.println("=========================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Antrian");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Antrian Terakhir");
            System.out.println("5. Tampilkan Semua Antrian");
            System.out.println("6. Cetak Jumlah Antrian");
            System.out.println("7. Cetak Jumlah Mahasiswa yang Sudah Dilayani");
            System.out.println("8. Cetak Jumlah Mahasiswa yang Belum Dilayani");
            System.out.println("9. Reset Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (antrian.getJumlahSudahDilayani() + antrian.getJumlahAntrian() >= 30) {
                        System.out.println("Tidak dapat menambahkan lebih banyak mahasiswa. Total mahasiswa yang harus dilayani adalah 30.");
                        break;
                    }
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    Mahasiswa17 mhs = new Mahasiswa17(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;

                case 2:
                    antrian.layaniAntrian();
                    break;

                case 3:
                    antrian.lihatAntrianTerdepan();
                    break;

                case 4:
                    antrian.lihatAntrianTerakhir();
                    break;

                case 5:
                    antrian.tampilkanSemuaAntrian();
                    break;

                case 6:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;

                case 7:
                    System.out.println("Jumlah mahasiswa yang sudah dilayani: " + antrian.getJumlahSudahDilayani());
                    break;

                case 8:
                    System.out.println("Jumlah mahasiswa yang belum dilayani: " + antrian.getJumlahBelumDilayani());
                    break;

                case 9:
                    antrian.ResetAntrian();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        } while (pilihan != 0);

        sc.close();
    }
}