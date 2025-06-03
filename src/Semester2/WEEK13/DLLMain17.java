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
            System.out.println("4. RemoveFirst Data Mahasiswa");
            System.out.println("5. RemoveLast Data Mahasiswa");
            System.out.println("6. Print Data Mahasiswa");
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
                        mhs = dll.inputData(sc);
                        dll.insertAfter(key, mhs);
                    }
                }
                case 4 -> {
                    System.out.println("Data mahasiswa pertama dengan nim "+dll.head.data.nim+" berhasil dihapus.");
                    dll.removeFirst();
                }
                case 5 -> {
                    System.out.println("Data mahasiswa pertama dengan nim "+dll.tail.data.nim+" berhasil dihapus."); 
                    dll.removeLast();
                }   
                case 6 -> {
                    dll.print();
                }
                case 0 -> System.out.println("Keluar dari program.");
                default -> System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            } 
        } while (pilihan != 0);
        System.out.println();
    }
}
