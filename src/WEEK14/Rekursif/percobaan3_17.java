package WEEK14.Rekursif;
import java.util.Scanner;
public class percobaan3_17 {
    static double hitungLaba(double saldo , int lamaInv){
        if (lamaInv == 0){
            return saldo;
        }else {
            return (1.11 * hitungLaba(saldo, lamaInv - 1));
        }
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan saldo awal: ");
    double saldoAwal = sc.nextDouble();
    System.out.print("Lama investasi (tahun): ");
    int lamaInv = sc.nextInt();
    System.out.print("Jumlah saldo setelah "+lamaInv+ " tahun adalah: ");
    System.out.print(hitungLaba(saldoAwal, lamaInv)); // saldoAwal akan menjadi parameter untuk saldo
    }
}
