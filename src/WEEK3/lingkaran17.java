
import java.util.Scanner;

/**
 * lingkaran17
 */
public class lingkaran17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    //deklarasi
    double r , phi1=3.14, phi2=22.0/7.0; ;
    double keliling1, luas1 , keliling2 , luas2 ;

    //input 
    System.out.print("Masukkan jari-jari: ");
    r = sc.nextDouble();

    // operator
    keliling1 = 2*phi1*r ;
    System.out.println("Keliling lingkaran(phi 3.14) : "+keliling1);
    luas1 = phi1*r*r ;
    System.out.println("Luas lingkaran(phi 3.14) : "+luas1);

    keliling2 = 2*phi2*r ;
    System.out.println("Keliling lingkaran(phi 22/7) : "+keliling2);
    luas2 = phi2*r*r ;
    System.out.println("Luas lingkaran(phi 22/7) : "+luas2);
    

        sc.close();
    }
}