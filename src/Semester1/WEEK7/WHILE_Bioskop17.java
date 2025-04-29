
package WEEK7;
import java.util.Scanner;

public class WHILE_Bioskop17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlTiket, totalTiket=0, hargaTiket=50000;
        double diskon=0, totalHarga=0, totalPendapatan=0;
        boolean lanjut=true;

        //code dibawah ini logic ke penghasilan pembelian tiket
        
        while (lanjut) {
            System.out.print("Masukkan jumlah tiket: ");
            jmlTiket = sc.nextInt();

            if (jmlTiket<0) {
                System.out.print("Jumlah tiket invalid, harap input dengan benar");
                continue;
            }else{
                if (jmlTiket>4) {
                    diskon=0.1;
                } else if(jmlTiket>10){
                    diskon=0.15;
                }else {
                    diskon=0;
                }
            }
            totalHarga=jmlTiket*hargaTiket - (jmlTiket*hargaTiket*diskon);
            
            System.out.println("Jumlah tiket yang dipesan: "+jmlTiket);
            System.out.println("Harga tiket: Rp. "+totalHarga);

            totalTiket += jmlTiket;
            totalPendapatan += totalHarga;

            System.out.print("Apakah anda ingin lanjut (true/false): ");
            lanjut = sc.nextBoolean();
        }

        System.out.println("Total tiket yang terjual: "+totalTiket);
        System.out.println("Total Penjualan Tiket: Rp.  "+totalPendapatan);





        sc.close();
    }
}
