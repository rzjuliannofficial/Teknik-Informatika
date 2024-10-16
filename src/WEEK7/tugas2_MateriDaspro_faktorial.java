import java.util.Scanner;
public class tugas2_MateriDaspro_faktorial  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, hasil=1;
        
        System.out.print("Masukkan n: ");
         n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            hasil *= i;
            System.out.println("Faktorial dari " + i + " adalah: " + hasil);
        }
        sc.close();
    }
    
}

    

