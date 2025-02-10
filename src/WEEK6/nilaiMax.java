// import java.util.Scanner;
package WEEK6;
public class nilaiMax {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        
        //ini merupakan statis, jika anda ingin tidak statis bil1-bil3 dapat dikosongkan
        int bil1=26, bil2=54, bil3=15 , bilMax;
    
        // System.out.print("masukkan bil1 anda: ");
        // bil1 = sc.nextInt();
        // System.out.println("Masukkan bil2 anda: ");
        // bil2 = sc.nextInt();
        // System.out.println("masukkan bil3 anda: ");
        // bil3 = sc.nextInt();
        if (bil1>bil2) {
            if (bil1>bil3) {
            bilMax=bil1;
            }
            else{
            bilMax=bil3;
            }
        }
        else {
            if (bil2>bil3) {
                bilMax=bil2;
            }
            else {
                bilMax=bil3;
            }
        }
    
    System.out.println("Jadi bilangan Max yaitu: "+bilMax);
    // sc.close();
    }
}
