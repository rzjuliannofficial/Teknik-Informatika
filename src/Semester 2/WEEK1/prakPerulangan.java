package WEEK1;

import java.util.Scanner;

public class prakPerulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.println("==================");
        System.out.println("n = 2 digit terakhir nim");
        System.out.print("n : ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }else if (i%2 == 0) {
                System.out.print(i+" ");
            }else { 
                System.out.print("* ");
            }
        }
    sc.close();
    }
    
}
