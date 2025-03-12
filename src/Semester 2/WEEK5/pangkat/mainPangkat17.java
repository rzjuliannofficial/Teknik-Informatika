package WEEK5.pangkat;
import java.util.Scanner;

public class mainPangkat17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah element: ");
        int element = sc.nextInt();

        pangkat17[] pangkt = new pangkat17[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Masukkan nilai basis element ke-"+(i+1)+": ");
            int basis = sc.nextInt();
            System.out.print("Masukkan nilai pangkat elemnt ke-"+(i+1)+": ");
            int pangkat = sc.nextInt();
            pangkt[i] = new pangkat17(basis, pangkat);
        }

        System.out.println("Hasil Pangkat BRUTEFORCE");
        for (pangkat17 BF : pangkt) {
            System.out.println(BF.nilai+"^"+BF.pangkat+": "+BF.pangkatBF());
        }
        System.out.println();
        System.out.println("Hasil Pangkat DIVIDE AND CONQUER");
        for (pangkat17 DC : pangkt) {
            System.out.println(DC.nilai+"^"+DC.pangkat+": "+DC.pangkatBF());
        }

    }
}
