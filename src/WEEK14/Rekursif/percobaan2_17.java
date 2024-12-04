package WEEK14.Rekursif;

import java.util.Scanner;

public class percobaan2_17 {
    static int hitungPangkat(int x, int y) {
        if (y==0) {
            System.out.print(1);
            return (1);            
        }else {
            System.out.print(x+"x");
            return (x * hitungPangkat(x, y-1));
        }

        // 2* hitungPangkat(2, 3)
        // 2* 2 *hitungPangka(2, 2)
        // 2* 2 * 2 * hitungPangkat(2, 1)
        // 2* 2 * 2 * 2 * hitungPangkat(2,0)
        // 2* 2 * 2 * 2 * 2* 1 = 16
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Bilangan yang dihitung: ");
        int bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        int pangkat = sc.nextInt();
        System.out.println("= "+hitungPangkat(bilangan, pangkat));
        sc.close();
    }
}
