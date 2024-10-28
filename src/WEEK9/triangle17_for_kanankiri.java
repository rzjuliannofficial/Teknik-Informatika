package WEEK9;

import java.util.Scanner;

public class triangle17_for_kanankiri {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N: ");
        int n = sc.nextInt();

        // for (int i = n; i >=1 ; i--) {
        //     for (int j = 1; j <=n ; j++) {
        //         if (j>=i) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
                
        //     }

        for (int i = 1; i <= n; i++) {
            for (int space = n; space > i ; space--) {
                System.out.print(" ");
            }
            for (int j = 1; j<=i   ; j++) {
                System.out.print("*");
            }
            System.out.println();
        sc.close();
        }      
    }      
}

