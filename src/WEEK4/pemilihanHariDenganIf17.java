import java.util.Scanner;
public class pemilihanHariDenganIf17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka (1-7): ");
        int hari = scanner.nextInt();

        if (hari >= 1 && hari <= 5) {
            System.out.println("Weekday");
        } else if (hari == 6 || hari == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }

        scanner.close();
    }
}
    
