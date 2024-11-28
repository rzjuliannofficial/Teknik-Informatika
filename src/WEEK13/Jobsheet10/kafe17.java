package WEEK13.Jobsheet10;
import java.util.Scanner;
public class kafe17 {
    
    
    //MAIN
    public static void main(String[] args) {

        int totalHarga=0;
        int pilihanMenu, banyakItems;

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama Anda : ");
        String namaPelanggan = sc.nextLine();
        System.out.print("Member?(true/false): ");
        boolean isMember = sc.nextBoolean();
        sc.nextLine();
        System.out.println("Kode promo : DISKON50 , DISKON30 ");
        System.out.print("Masukkan kode promo (kosong jika tidak ada): ");
        String kodePromo = sc.nextLine();
        System.out.println();
        //memasukkan fungsi Menu
        Menu(namaPelanggan, isMember, kodePromo);
        
        //pemilihan menu yang dapat diulang
        while (true) {
            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            pilihanMenu = sc.nextInt();
            System.out.print("Masukkan jumlah item yang ingin anda pesan: ");
            banyakItems = sc.nextInt();
            sc.nextLine();
            System.out.print("Lanjut ?(y/n): ");
            String lanjut = sc.nextLine();
            if (lanjut.equalsIgnoreCase("n")) {
                break;
            }else if (!lanjut.equalsIgnoreCase("n") || !lanjut.equalsIgnoreCase("y") ) {
                System.out.println("input yang anda masukkan invalid");
                continue;
            }

            //memasukkan fungsi hitungTotalHarga
            totalHarga += hitungTotalHarga(pilihanMenu, banyakItems, kodePromo, isMember);
            System.out.println("Total harga untuk pesanan Anda : Rp . " + totalHarga);
        }
        System.out.println("Total akhir yang harus dibayar: Rp. " + totalHarga);
        sc.close();
    }

    //MENU
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo){
        System.out.println("Selamat datang di Kafe Kami, " + namaPelanggan);
    
        if (isMember) {
            System.out.println("Anda adalah member kami, dapatkan diskon 10% untuk setiap pembeliannya!");
        }
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapat diskon 50%");
        } else if(kodePromo.equals("DISKON30")){
            System.out.println("Anda mendapatkan diskon 30%");
        }else {
            System.out.println("Invalid");
        }
    
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15.000");
        System.out.println("2. Cappuccino - Rp 20.000");
        System.out.println("3. Latte - Rp 22.000");
        System.out.println("4. Teh Tarik - Rp 12.000");
        System.out.println("5. Roti Bakar - Rp 10.000");
        System.out.println("6. Mie Goreng - Rp 18.000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }
    //OPERATOR
    public static int hitungTotalHarga(int pilihanMenu, int banyakItems, String kodePromo, boolean isMember){
        int hargaItems[] = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItems;
        
        if (isMember) {
            hargaTotal *= 0.9;
        }
        if (kodePromo.equals("DISKON50")) {
            hargaTotal *= 0.5; // Diskon 50%
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal *= 0.7; // Diskon 30%
        } else {
            System.out.println("Kode promo tidak valid, tidak ada diskon yang diterapkan.");
        }
        return hargaTotal;
    }
}