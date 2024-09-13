package WEEK3.daspro_jobsheet3_case_study_;
import java.util.Scanner;

public class Gaji17 {
    public static void main(String[] args) {
        //input
        Scanner input = new Scanner(System.in);

        int jamKerja, upahPerJam;
        double persenBonus=0.1 , persenPajak=0.05;

        System.out.print("Jumlah jam kerja selama 1 bulan : ");
        jamKerja = input.nextInt();
        System.out.print("Upah per jam : ");
        upahPerJam = input. nextInt();

        //perhitungan 
        double totalGaji = jamKerja*upahPerJam ; 
        double bonus = persenBonus*totalGaji; 
        double pajak = persenPajak * (bonus+totalGaji);
        double gajiBersih = totalGaji + bonus - pajak;

        //output
        System.out.println("Total gaji selama satu bulan : Rp "+totalGaji);
        System.out.println("Bonus per jam : Rp "+bonus);
        System.out.println("Pajak yang harus dibayar : Rp "+pajak);
        System.out.println("Gaji bersih yang di dapat : Rp "+gajiBersih);

        input.close();
    }
}
