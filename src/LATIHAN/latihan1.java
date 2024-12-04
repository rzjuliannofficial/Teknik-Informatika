package LATIHAN;

import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Berapa kata?: ");
        int n = sc.nextInt();
        sc.nextLine();
        String kata[] = new String[n];
        int i = 0;
        
        while (i<n) {
            System.out.print("Masukkan kata: ");
            kata[i] = sc.nextLine();
            i++;
        }
        
        for (i = 0; i < kata.length; i++) {
            System.out.print(kata[i]);
        }
        System.out.println();
        for (i = kata.length-1; i >= 0; i--) {
            System.out.print(kata[i]);
        }
        sc.close();        



        
    }
}
