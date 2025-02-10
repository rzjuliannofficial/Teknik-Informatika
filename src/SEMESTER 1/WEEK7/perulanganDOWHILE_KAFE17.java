package WEEK7;
import java.util.Scanner;
public class perulanganDOWHILE_KAFE17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti, hargaKopi=12000, hargaTeh=7000, hargaRoti=20000,totalHarga;
        String namaPelanggan ;
        
        //cocok  untuk perulangan yang tidak tau jumlahnya berapa kali mengulang
        do{
            System.out.print("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan=sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;
            }
            System.out.print("Jumlah kopi yang dipesan: ");
            kopi=sc.nextInt();
            System.out.print("Jumlah teh yang dipesan: ");
            teh=sc.nextInt();
            System.out.print("Jumlah roti yang dipesan: ");
            roti=sc.nextInt();
            totalHarga =  (kopi*hargaKopi)+(teh*hargaTeh)+(roti*hargaRoti);
            System.out.println("Total harga yang harus dibayarkan :Rp "+totalHarga);
           
            sc.nextLine();//sc.nextLine(); setelah print totalHarga merupakan sintaks untuk membersihkan newline dari buffer.
        }while (false); //perbedaan false dan false adalah jika false maka tidak ada perulangan, jika true akan melanjutkan perulangan

        System.out.println("Transaksi Selesai.");
        sc.close();
    }
}
