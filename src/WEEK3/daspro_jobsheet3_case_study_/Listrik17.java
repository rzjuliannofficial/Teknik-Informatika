package WEEK3.daspro_jobsheet3_case_study_;
import java.util.Scanner;

public class Listrik17 {
    public static void main(String[] args) {
    Scanner elec = new Scanner(System.in);

    int harga = 1500 ,totalHarga, penggunaanlIstrik;
    boolean statusTagihan;
    
    System.out.print("Penggunaan Listrik : ");
    penggunaanlIstrik = elec.nextInt();

    totalHarga = harga * penggunaanlIstrik;
    statusTagihan = penggunaanlIstrik > 500 ;
    System.out.println("Penggunaaan melebihi 500? " + statusTagihan);
    System.out.println("Tarif harga listrik yang perlu dibayar : Rp " + totalHarga);
    
    elec.close();
    }
}
