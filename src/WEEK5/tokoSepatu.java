import java.util.Scanner;
public class tokoSepatu {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int ukuran, harga=0;
        String merk, kategori;
        

        System.out.println("____________________________");
        System.out.println("-----TOKO SEPATU MURAH------");
        System.out.println("============================");
        System.out.println("TERSEDIA MEREK");
        System.out.println("1. CONVERSE dengan kategori(SlipOn dan HighTop) ");
        System.out.println("2. Sketcher dengan kategori(Woman & Man)");
        System.out.println("3. Nike dengan kategori(Kids & Adult)");
        System.out.println("============================");
        System.out.println("Tersedia Ukuran");
        System.out.println("SlipOn: 36-40");
        System.out.println("HighTop: 40-44");
        System.out.println("Woman: 36-41");
        System.out.println("Man: 41-44");
        System.out.println("Kids: 36-40");
        System.out.println("Adult: 40-44");
        System.out.println("===============================");
        System.out.print("Masukkan merk yang anda inginkan: ");
        merk = sc.nextLine();
        System.out.print("Masukkan Kategori: ");
        kategori = sc.nextLine();
        System.out.print("Masukkan Ukuran : ");
        ukuran = sc.nextInt();

        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slipon")){
                if (ukuran>=36 && ukuran <=40){
                    harga = 800000;
                }else {
                    System.out.println("ukuran yang anda masukkan salah");
                }
            }else {
                if (ukuran>=40&&ukuran<=44) {
                    harga =120000;
                }else{
                    System.out.println("ukuran yang anda masukkan salah");
                }
            }
        }else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                if (ukuran>=36 && ukuran<=41) {
                    harga=1000000;
                }else {
                    System.out.println("ukuran yang anda masukkan salah");
                }
            }else{
                if (ukuran >=41 && ukuran <=44) {
                    harga = 1800000;
                }else{
                    System.out.println("ukuran yang anda masukkan salah");
                }
            }
        }else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                if (ukuran>=36 && ukuran<=40) {
                    harga=750000;
                }else {
                    System.out.println("ukuran yang anda masukkan salah");
                }
            }else{
                if (ukuran >=40 && ukuran <=44) {
                    harga = 1050000;
                }else{
                    System.out.println("ukuran yang anda masukkan salah");
                }
            }
        }else {
            System.out.println("merk yang anda masukkan salah");
        }
        System.out.println("");
        System.out.println("==================================");
        System.out.println("Anda memesan dengan Merk : "+merk);
        System.out.println("Kategori:  "+kategori);
        System.out.println("Ukuran : "+ukuran);
        System.out.println("Biaya yang harus anda bayarkan :Rp. "+harga);
        System.out.println("====================================");
        sc.close();
    }
}
