
package WEEK5;
import java.util.Scanner;

public class transaksiKafe17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean keanggotaan ;
        String menu ; 
        char ukuranCup ;
        int jumlah;
        double diskon , totalHarga , nominalBayar ;
        
        System.out.println("Menu yang Tersedia ada :");
        System.out.println("Kopi - Rp.12000");
        System.out.println("Teh - Rp.7000");
        System.out.println("Coklat - Rp.20000");
        System.out.println("Untuk ukuran M+=25% , L+=40%");
        System.out.println();
        System.out.print("Masukkan menu: ");
        menu = sc.nextLine();
        System.out.print("Masukkan ukuran cup(S, M, dan L): ");
        ukuranCup = sc.next().charAt(0);
        System.out.print("Masukkan jumlah: ");
        jumlah = sc.nextInt();
        System.out.print("Masukkan keanggotaan (true/false): ");
        keanggotaan = sc.nextBoolean();

        double hargaMenu = 0 ;

        switch (menu.toLowerCase()) {
            case "kopi":
                hargaMenu = 12000;
                break;
            case "teh" :
                hargaMenu = 7000;
                break;
            case "coklat":
                hargaMenu = 20000;
                break;
            default:
            System.out.println("Menu yang anda masukkan salah");
                break;
        }

        totalHarga = hargaMenu * jumlah;

        switch (ukuranCup) {
            case 's':
                break;
            case 'm':
                totalHarga += 0.25 * totalHarga;
                break;
            case 'l':
                totalHarga += 0.4 * totalHarga;
                break;
            default:
                System.out.println("Size yang anda masukkan salah");
                break;
        }

        diskon = keanggotaan ? 0.1 : 0;
        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Item pembelian: "+jumlah+ " " +menu+ " dengan ukuran cup "+ ukuranCup);
        System.out.println("Nominal bayar: "+ nominalBayar);

        System.out.println("Terima Kasih");

        sc.close();

    }
    
}
