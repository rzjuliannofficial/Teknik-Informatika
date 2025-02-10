package WEEK6;
import java.util.Scanner;
public class latihan_pengecekSuhu {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int suhu=0;

    System.out.print("Masukkan suhu ruangan saat ini : ");
    suhu = sc.nextInt();

    if (suhu<18) {
        System.out.println("Ruangan terlalu dingin");
    } else if (suhu>17 && suhu <26) {
        System.out.println("Suhu ruangan normal");
    } else {
        System.out.println("Ruangan terlalu panas");
    }
    
    sc.close();
    }
}
