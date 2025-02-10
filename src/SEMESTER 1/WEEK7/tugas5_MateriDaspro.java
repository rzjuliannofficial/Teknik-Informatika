package WEEK7;
import java.util.Scanner;
public class tugas5_MateriDaspro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n,a=3, b=4;

        System.out.print("Masukkan n: ");
        n = sc.nextInt();

        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) { //mengapa i=2? karena kita sudah mencetak 2 angka sebelumnya
            int next = a + b;
            System.out.print(next + " ");
            a = b; // a = b artinya a diubah menjadi b
            b = next; // b diubah menjadi next
        }
        sc.close();
    }
}
