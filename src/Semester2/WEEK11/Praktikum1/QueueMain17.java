package WEEK11.Praktikum1;
import java.util.Scanner;

public class QueueMain17 {

    public static void menu(){
        System.out.println("Masukkan operasi yang diiinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("0. Keluar");
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue: ");
        int n = sc.nextInt();
        Queue17 Q = new Queue17(n);
        int pilih = 0;

        do {
            menu();
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            System.out.println();
            switch (pilih) {
                case 1:
                    System.out.println("--Menu 1--");
                    System.out.print("Masukkan data baru(INT): ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("--Menu 2--");
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    System.out.println("--Menu 3--");
                    Q.print();
                    break;
                case 4:
                    System.out.println("--Menu 4--");
                    Q.peek();
                    break;
                case 5:
                    System.out.println("--Menu 5--");
                    Q.clear();
                    break;
                case 0:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        } while (pilih != 0);
        sc.close();
        System.out.println("Program selesai");
    }
}