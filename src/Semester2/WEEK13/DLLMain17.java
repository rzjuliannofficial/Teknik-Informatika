package WEEK13;
import java.util.Scanner;

public class DLLMain17 {
    public static void main(String[] args) {
        DoubleLinkedList17 dll = new DoubleLinkedList17();
        Scanner sc = new Scanner(System.in);
        int pilihan;
        Mahasiswa17 mhs = null;

        do {
            System.out.println("=== Menu Double Linked List Mahasiswa ===");
            System.out.println("1. AddFirst Data Mahasiswa");
            System.out.println("2. AddLast Data Mahasiswa");
            System.out.println("3. Insert After Data Mahasiswa");
            System.out.println("4. Print Data Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1 -> {
                    mhs = dll.inputData(sc);
                    dll.addFirst(mhs);
                }
                case 2 -> {
                    mhs = dll.inputData(sc);
                    dll.addLast(mhs);
                }
                case 3 -> {
                    if (mhs == null) {
                        System.out.println("Data mahasiswa belum diinput.");
                    } else {
                        System.out.print("Masukkan NIM mahasiswa setelahnya: ");
                        String key = sc.nextLine();
                        dll.insertAfter(key, mhs);
                    }
                }
                case 4 -> {
                    if (dll.isEmpty()) {
                        System.out.println("Linked List kosong.");
                    } else {
                        dll.print();
                    }
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            } 
        } while (pilihan != 0);
        System.out.println();
    }
}
