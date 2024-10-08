import java.util.Scanner;

public class pemilihan2Percobaan2_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String member, metodPembayaran ;
        int jumlahBeli, pilihanMenu ,harga, qris=1000;
        double total=0,totalAkhir, diskon;
        

        

        System.out.println("----------------------");
        System.out.println("=== MENU KAFE SAYA ===");
        System.out.println("----------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Packet Bundling (Ricebowl + Ice Tea)");
        System.out.println("4. Coffe");
        System.out.println("5. Hot Tea");
        System.out.println("6. Bread");
        System.out.println("---------------------------------------");
        //input
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihanMenu = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Apakah Member?(y/n) = ");
        member = sc.nextLine();
        System.out.print("Pembayaran QRIS(y/n): ");
        metodPembayaran = sc.nextLine();
        System.out.print("Jumlah pesanan anda = ");
        jumlahBeli = sc.nextInt();
        System.out.println("----------------------------------------");
        
        // equalsIgnoreCase() membandingkan string tanpa kasus sensitif, artinya ia tidak membedakan antara huruf besar dan kecil
        if (member.equalsIgnoreCase("y")) { //menggunakan equalsIgbireCase untuk membandingkan String
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = "+ harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice tea = " +harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga packet Bundling =  " + harga);
            } else if (pilihanMenu == 4) {
                harga = 12000;
                System.out.println("Harga Coffe =  " + harga);
            } else if (pilihanMenu == 5) {
                harga = 7000;
                System.out.println("Harga Hot Tea =  " + harga);
            } else if (pilihanMenu == 6) {
                harga = 20000;
                System.out.println("Harga Bread =  " + harga);
            }else {
                System.out.println("Masukkan pilihan dengan benar");
                sc.close();
                return; // menghentikann eksekusi lebih lanjut jika pilihan salah
            }
            
        
            total= harga * jumlahBeli;
            System.out.println("Total bayar anda = "+total);
            //menghitung total setelah diskon
            //jadi meskipun harga*diskon*jumlahbeli ==totalAsli*diskon
             total= total- (total*diskon);
            System.out.println("Total bayar setelah diskon = "+total);
        }
        //equalsIgnoreCase() membandingkan string tanpa kasus sensitif, artinya ia tidak membedakan antara huruf besar dan kecil
        else if (member.equalsIgnoreCase("n")) {
            if (pilihanMenu == 1) {
                harga = 14000;
                System.out.println("Harga ricebowl = "+ harga);
            } else if (pilihanMenu == 2) {
                harga = 3000;
                System.out.println("Harga Ice tea = " +harga);
            } else if (pilihanMenu == 3) {
                harga = 15000;
                System.out.println("Harga packet Bundling =  " + harga);
            } else if (pilihanMenu == 4) {
                harga = 12000;
                System.out.println("Harga Coffe =  " + harga);
            } else if (pilihanMenu == 5) {
                harga = 7000;
                System.out.println("Harga Hot Tea =  " + harga);
            } else if (pilihanMenu == 6) {
                harga = 20000;
                System.out.println("Harga Bread =  " + harga);
            } else {
                System.out.println("Masukkan pilihan dengan benar");
                sc.close();
                return;
            }
            total=harga*jumlahBeli;
            System.out.println("Total bayar = "+total);
         }
        

         if (metodPembayaran.equalsIgnoreCase("y")) {
            System.out.println("tambahan pembayaran QRIS");
            qris = 1000;
           total=total+1000;
           System.out.println("total bayar setelah tambahan qris:  "+total);
         }
         else {
            System.out.println("Tidak ada tambahan");
         }
         
         
         System.out.println("-------------------------------------------");
        sc.close();

    }
}
 