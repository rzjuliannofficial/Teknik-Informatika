package WEEK10;
import java.util.Scanner;

public class searchNilai17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arrayNilai[] = {80 , 85 , 78 , 96, 90,  82 , 86};
        int key = 90, hasil = 0 ;

        for (int i = 0; i < arrayNilai.length; i++) {
            if (key == arrayNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println();
        System.out.println("Nilai "+key+" ketemu di index ke-"+hasil);
        System.out.println();
        sc.close();
    }
}
