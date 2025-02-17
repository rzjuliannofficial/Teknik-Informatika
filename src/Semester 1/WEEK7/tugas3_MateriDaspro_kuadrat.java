package WEEK7;
import java.util.Scanner;
public class tugas3_MateriDaspro_kuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, hasil=1;

        System.out.print("Masukkan n: ");
        n = sc.nextInt();
        for (int i = 1; i <=n  ; i++) {
            hasil = i *i;
           
        System.out.println("Kuadrat dari "+i+" adalah "+hasil);
        }
       
        sc.close();
    }
    
}
