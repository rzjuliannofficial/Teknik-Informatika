package WEEK7;
import java.util.Scanner;
public class tugas1_MateriDaspro_deret {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.print("Masukkan n: ");
        n = sc.nextInt();

        for (int i = n; i >=1; i--) {
            System.out.println(i);
        }

        sc.close();
    }
}
