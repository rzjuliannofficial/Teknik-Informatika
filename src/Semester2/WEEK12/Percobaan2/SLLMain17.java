package WEEK12.Percobaan2;

import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {
        SingleLinkedList17 sll17 = new SingleLinkedList17();
        
        //static data untuk testing

        // Mahasiswa17 mhs1 = new Mahasiswa17("01", "Julian", "1F", "3.89");
        // Mahasiswa17 mhs2 = new Mahasiswa17("02", "Rizki", "1f", "3.00");
        // Mahasiswa17 mhs3 = new Mahasiswa17("03", "Rahmad", " 1F", "3.20");
        // Mahasiswa17 mhs4 = new Mahasiswa17("04", "Rifky", "1f", "3.68");
        
        // sll17.print();
        // sll17.addFirst(mhs4);
        // sll17.print();
        // sll17.addLast(mhs1);
        // sll17.print();
        // sll17.insertAfter("asep", mhs2);
        // sll17.print();
        
        //dinamis data input
        Scanner sc = new Scanner(System.in);
        int pilihan;
        
        do {
            System.out.println("=====================");
            System.out.println("Menu Single Linked List");
            System.out.println("=====================");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Addfirst Data");
            System.out.println("3. AddLast Data");
            System.out.println("4. Insert After Data");
            System.out.println("5. Insert AT Index Data");
            System.out.println("6. Print Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
            Mahasiswa17 mhs = null;
            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("Masukkan IPK: ");
                    String ipk = sc.nextLine();
                    mhs = new Mahasiswa17(nim, nama, kelas, ipk);
                    break;
                case 2:
                    sll17.addFirst(mhs);
                    sll17.print();
                    break;
                case 3:
                    sll17.addLast(mhs);
                    sll17.print();
                    break;
                case 4:
                    System.out.println("Ingin Memasukkan data setelah siapa?");
                    System.out.print("Masukkan nama mahasiswa: ");
                    String key = sc.nextLine();
                    sll17.insertAfter(key, mhs);
                    sll17.print();
                    break;
                case 5:
                    System.out.println("Ingin memasukkan data pada index ke berapa?");
                    System.out.print("Masukkan index: ");
                    int i = sc.nextInt();
                    sll17.insertAt(i, mhs);
                    sll17.print();
                    break;
                case 6:
                    sll17.print();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    sc.close();
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        }while (pilihan != 0);
    } 
}
