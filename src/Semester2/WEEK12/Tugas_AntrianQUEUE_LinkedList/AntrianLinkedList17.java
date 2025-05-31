package WEEK12.Tugas_AntrianQUEUE_LinkedList;

import java.util.Scanner;

public class AntrianLinkedList17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Program Antrian Mahasiswa ===");
        System.out.print("Masukkan jumlah antrian: ");
        int jumlahAntrian = sc.nextInt();
        SingleLinkedList_QUEUE antrian = new SingleLinkedList_QUEUE(jumlahAntrian);

        int pilihan;
        do {
            System.out.println("=========================================");
            System.out.println("Menu Antrian Mahasiswa");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Tampilkan Antrian Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Jumlah Antrian yang belum dilayani");
            System.out.println("7. Hapus Semua Antrian");
            System.out.println("0. Keluar");
            System.out.println("=========================================");
            System.out.print("Masukkan pilihan: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("=== Tambah Antrian ===");
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Prodi: ");
                    String prodi = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();

                    Mahasiswa17 mhs = new Mahasiswa17(nim, nama, prodi, kelas);
                    antrian.enqueue_linkedList_AddLast(mhs);
                    System.out.println("Antrian berhasil atas nama "+mhs.nama+" ditambahkan: "  );
                    break;
                case 2:
                    System.out.println("=== Layani Antrian ===");
                    antrian.dequeue_linkedList_removeFirst();
                    break;
                case 3:
                    antrian.tampilkanAntrian();
                    break;
                case 4:
                    antrian.tampilkanAntrian_Head();
                    break;
                case 5:
                    antrian.tampilkanAntrian_Tail();
                    break;
                case 6:
                    antrian.getJumlahAntrian();
                    break;
                case 7:
                    antrian.clear_linkedList_removeAll();
                    break;
                case 0:
                    System.out.println("=== Terima Kasih ===");
                    return;
                    
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                }
                System.out.println();
            }while (pilihan != 0);
            sc.close();
        }
}
