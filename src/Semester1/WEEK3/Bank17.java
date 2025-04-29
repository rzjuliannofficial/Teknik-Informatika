package WEEK3;
import java.util.Scanner;

public class Bank17 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int jml_tabungan_awal , lama_menabung;
    double jml_tabungan_akhir, bunga, prosentase_bunga = 0.02;
    
    System.out.print("Masukkan jumlah tabungan awal anda : ");
    jml_tabungan_awal = input.nextInt();
    System.out.print("Masukkan bulan anda menabung : ");
    lama_menabung = input.nextInt();

    bunga = lama_menabung*jml_tabungan_awal*prosentase_bunga; 
    jml_tabungan_akhir = jml_tabungan_awal+bunga;

    System.out.println("Bunga adalah "+ bunga);
    System.out.println("Jumlah tabungan akhir anda adalah "+ jml_tabungan_akhir);

    input.close();
    }
}
