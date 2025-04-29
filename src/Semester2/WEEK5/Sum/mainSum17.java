package WEEK5.Sum;

import java.util.Scanner;

public class mainSum17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah element: ");
        int element = sc.nextInt();

        sum17 sm = new sum17(element);
        for (int i = 0; i < element; i++) {
            System.out.print("Masukkan keuntungan-"+(i+1)+": ");
            sm.keuntungan[i]=sc.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan BruteForce: "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: "+sm.totalDC(sm.keuntungan, 0, element-1));
    }
}
