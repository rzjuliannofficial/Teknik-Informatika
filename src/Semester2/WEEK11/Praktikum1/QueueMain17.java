package WEEK11.Praktikum1;

import java.util.Queue;
import java.util.Scanner;

public class QueueMain17 {

    public static void menu(){
        System.out.println("Masukkan operasi yang diiinginkan:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeuq");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("-----------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan kapasitas queue:");
        int n = sc.nextInt();
        Queue<E> Q = new QueueMain17(n);
        int pilih = 0;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Data yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                default:
                    break;
            }
        } while (pilih > 0 && pilih <= 5);
    }
}