package WEEK12;

import java.util.Scanner;

public class SLLMain17 {
    public static void main(String[] args) {
        SingleLinkedList17 sll17 = new SingleLinkedList17();
        
        Mahasiswa17 mhs1 = new Mahasiswa17("01", "Julian", "1F", "3.89");
        Mahasiswa17 mhs2 = new Mahasiswa17("02", "Rizki", "1f", "3.00");
        Mahasiswa17 mhs3 = new Mahasiswa17("03", "Rahmad", " 1F", "3.20");
        Mahasiswa17 mhs4 = new Mahasiswa17("04", "Rifky", "1f", "3.68");
        
        sll17.print();
        sll17.addFirst(mhs4);
        sll17.print();
        sll17.addLast(mhs1);
        sll17.print();
        sll17.insertAfter("asep", mhs2);
        sll17.print();
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("=====================");
            System.out.println("Menu Single Linked List");
            System.out.println("=====================");
            System.out.println("1. Addfirst Data");
            System.out.println("2. AddLast Data");
            System.out.println("3. Insert After Data");
            System.out.println("4. Insert AT Index Data");
            System.out.println("5. Print Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();
            
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
                    sll.addFirst(mhs1);
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
            }
        } while (pilihan != 0);
    }
}
