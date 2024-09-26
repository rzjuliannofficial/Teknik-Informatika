import java.util.Scanner;

public class pemilihanBilangan17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    System.out.print("Masukkan sebuah angka: ");
    int angka = sc.nextInt(); //jadi jika tanpa deklarasi kenapa angka dapet jadi int, karena sebelum var, ada (int)


    //IF ELSE 
    System.out.println("SEKARANG ANDA MASUK CODE PEMILIHAN IF ELSE");
    System.out.println("");
    if (angka %2 == 0) 
        {
            System.out.println("Angka " +angka+ " termasuk bilangan genap");   
            
        }
    else
        {
            System.out.println("Angka " +angka+ " termasuk bilangan ganjil");
        }
        
    //TERNARY OPERATOR
    System.out.println("SEKARANG ANDA MASUK CODE TERNARY OPERATOR");
    System.out.println("");
    System.out.print("Masukkan angka: ");
    double angka2 = sc.nextDouble();
    
    String hasil ;
    hasil = (angka2 %2 == 0) ? "termasuk bilangan genap" : "termasuk bilangan ganjil";
    System.out.println(angka2+ " adalah "+ hasil);
    
    
    
    
    sc.close();
    }
}
