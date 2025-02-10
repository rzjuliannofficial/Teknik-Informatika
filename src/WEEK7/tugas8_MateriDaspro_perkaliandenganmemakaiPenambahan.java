package WEEK7;
import java.util.Scanner;
public class tugas8_MateriDaspro_perkaliandenganmemakaiPenambahan{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bil1 , bil2 , hasil=0;

        System.out.println("Masukkan bil yang ingin dikali: ");
        bil1= sc.nextInt();
        System.out.println("Masukkan perkalian: ");
        bil2 = sc.nextInt();

        for (int i = 0; i < bil2; i++) {
            hasil += bil1;
        }
        System.out.println("Hasil perkalian = "+hasil);
        sc.close();
    }
}
