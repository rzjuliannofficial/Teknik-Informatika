package WEEK9;

import java.util.Scanner;

public class triangle17_for_TERBALIK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai N : ");
        int n = sc.nextInt();

        for (int i = 1; i <=n; i++) {
            for (int j = n; j >= i; j--) { // penjelasan (J => i) : Loop pertama menentukan baris mana yang sedang diproses, 
                                           // dan setiap kali baris baru dimulai, i bertambah 1. Variabel i tidak berubah selama 
                                           // eksekusi loop j, sehingga jumlah * yang dicetak di setiap baris dapat dikendalikan 
                                           // oleh nilai i pada baris tersebut.
           
           
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close(); 
    }
}
