package UTS;
import java.util.Scanner;


public class uts17 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int i=1,aksi=0, energiHero = 100, energiVillain = 150;
    int energiSeranganNormalkeVill = 15 ,energiSeranganNormalHero = 5 ;
    int energiSisaHero=0, energiSisaVillain=0;
    int energiSpesialVill=30, energiSpesialHero=20, banyakSpesial=2;
    
    System.out.println("--NILAI AWAL--");
    System.out.println("Energi Hero : 100");
    System.out.println("Energi Villain : 150 ");
    System.out.println("");

    while (energiHero  > 0 && energiVillain > 0) {
    
        System.out.println("-- Ronde ke-"+ i +"--");
        System.out.println("-- Status --");
        System.out.println("Energi Superhero: "+energiHero);
        System.out.println("Energi Villain: "+energiVillain);
        System.out.println("Serangan Spesial Tersisa: "+banyakSpesial);
        System.out.println("--------------------------------");
        System.out.print("Pilih Aksi :");
        aksi=sc.nextInt();
        System.out.println("1. Serangan Normal(-5 energi + -15 energi Villain, bisa ada penyerangan kritis)");
        System.out.println("2. Serangan Spesial(-20 energi + -30 energi Villain,  bisa ada penyerangan kritis)");
        System.out.println("Pilihan anda : "+aksi);
        
        

        if (aksi<1 || aksi >2) {
            System.out.println("Maaf input yang anda masukkan invalid. Mohon masukkan input dengan benar");
            continue;
        }

        

        if (aksi>1 && aksi<=2) {
            if (banyakSpesial<1) {
                System.out.println("WARNING! Serangan Spesial anda telah habis");
                System.out.println("");
                continue;
            }
            System.out.println("SuperHero menggunakan serangan Spesial! Villain kehilangan 30 energi");
            energiHero -= energiSpesialHero ;
            energiVillain -= energiSpesialVill;
            banyakSpesial--;
            
        }else{
            if (energiHero<50) {
                energiHero -= energiSeranganNormalHero;
                energiVillain -= 2*energiSeranganNormalkeVill;
                System.out.println("Serangan Kritis terjadi! Villain kehilangan 30 energi");
            }else {
            System.out.println("SuperHero menggunakan serangan Normal! Villain kehilangan 15 energi");
            energiHero -= energiSeranganNormalHero;
            energiVillain -= energiSeranganNormalkeVill;
            }
        }
       i++;
       System.out.println("");
    }
    System.out.println("Selamat Anda telah memengalahkan Villain");
    sc.close();
    }
}
