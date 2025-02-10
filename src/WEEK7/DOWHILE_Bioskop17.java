package WEEK7;
import java.util.Scanner;
public class DOWHILE_Bioskop17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaPelanggan;
        int hargaTiket=50000, tiket, tiketTerjual=0;
        double diskon=0,totalHarga, pendapatan=0;

        //DO WHILE dibawah ini logic untuk pembelian

        do {
            System.out.println("=================================================");
            System.out.print("Masukkan nama anda (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi telah dibatalkan");
                break;
            }
            System.out.print("Jumlah tiket yang ingin dipesan: ");
            tiket = sc.nextInt();
            
            //Jika input jumlah tiket tidak valid (negatif), program akan mengabaikan input tersebut dan meminta input ulang.
            if (tiket<0) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid");
                continue;
            }
            if (tiket>4) {
                diskon=0.1;
            } else if (tiket>10) {
                diskon=0.15;
            } else {
                diskon=0;
            }
            totalHarga=tiket*hargaTiket-(tiket*hargaTiket*diskon);
            System.out.println("Total harga yang harus dibayarkan :Rp "+totalHarga);
            sc.nextLine();

            pendapatan += totalHarga;
            tiketTerjual += tiket;

        } while (true);//perbedaan false dan false adalah jika false maka tidak ada perulangan, jika true akan melanjutkan perulangan
        
        System.out.println("Tiket yang terjual : "+tiketTerjual);
        System.out.println("Pendapatan  dari  penjualan tiket bioskop : Rp "+pendapatan);
        

        sc.close();
    }
}
