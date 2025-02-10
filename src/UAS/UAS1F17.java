package UAS;
import java.util.Scanner;
public class UAS1F17 {

    static Scanner sc17 = new Scanner(System.in);
    static String [] namaTim ;
    static int[][] skor;
    static int[] totalskor;
    static boolean cek = false ;
    //nim = 2341720255
    //JUMLAH TIM 55 %3 = 1 + 4 = 5
    public static void main(String[] args) {
        System.out.print("Masukkan jumlah tim : ");
        int jumlahTim = sc17.nextInt();
        namaTim = new String[jumlahTim];
        skor = new int[jumlahTim][2];
        totalskor = new int[jumlahTim];
        Menu();
    }
    public static void Menu() {
        while (true) {
        System.out.println("== MENU UTAMA ==");
        System.out.println("1. Input data Skor Tim");
        System.out.println("2. Tampilan tabel Skor");
        System.out.println("3. Tentukan Juara");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu(1-4): ");
        int pilihan = sc17.nextInt();
        sc17.nextLine();
            switch (pilihan) {
                case 1:
                  // fungsi tambah
                  menu1();
                  break;
                case 2: 
                  // fungsi tampil
                  menu2();
                  break;
                case 3:
                  menu3();
                  break;
                case 4: 
                  System.out.println("Terima Kasih!");
                  return;
                default:
                  System.out.println("input tidak valid, masukin yg bener");
              }
        }
    }
    //input
    public static void menu1(){
        for (int i = 0; i < namaTim.length; i++) {
            cek = true ;
            System.out.print("Masukkan nama tim ke-"+ (i+1) + ": ");
            namaTim[i] = sc17.nextLine();
            totalskor[i] = 0;
            for (int j = 0; j < skor[i].length; j++) {
                System.out.print("Masukkan skor "+namaTim[i]+" untuk level "+(j+1)+": ");
                skor[i][j]= sc17.nextInt();
                if (skor[i][0] > 50 && skor [i][1] > 50) {
                    System.out.println("bonus buff kemenangan 2 kali berturut turut. Total skor +17");
                    totalskor[i] += 17;
                }
                if (skor[i][j]<=0 ) {
                    System.out.println("skor yang anda masukkan negativ. Input ulang!");
                    continue;
                }
                if (skor[i][0]<35) {
                    skor[i][0]=0;
                }
                totalskor[i] += skor[i][j];
                
            }
            //check jika genap
            if (totalskor[i] % 2 ==0) {
                totalskor[i] -= 15;
            }
            
            sc17.nextLine();
            System.out.println();
        }
    }

    //tampilin
    public static void menu2(){
        if (!cek) {
            System.out.println("Tidak ada data yang dapat ditampilkan");
        }else {
        System.out.println("Tabel skor turnament");
        System.out.println("Nama TIM \t level 1 \t level 2 \t total skor");
        for (int i = 0; i < namaTim.length; i++) {
            System.out.print("\n"+namaTim[i]+"\t");
            for (int j = 0; j < skor[i].length; j++) {
                System.out.print("\t"+skor[i][j] +"\t");
            }
            System.out.print("\t"+totalskor[i]);
            System.out.println();
            }
        }
        System.out.println();
    }

    //tentukan juara
    public static void menu3(){
        int indexmax = 0;
        if (!cek) {
            System.out.println("Tidak ada data yang dapat ditampilkan");
        }else {
            for (int i = 0; i < namaTim.length; i++) {
                if (totalskor[indexmax] < totalskor[i]) {
                    indexmax = i;
                    System.out.println("Selamat kepada tim "+namaTim[indexmax]+ " telah memenangkan pertandingan");
                    break;
                }else if (totalskor[indexmax]==totalskor[i]){
                    if (skor[i][1] > skor[i+1][1]) {
                        indexmax=i;
                        System.out.println("Selamat kepada tim "+namaTim[indexmax]+ " telah memenangkan pertandingan");
                        break;
                    }else if (skor[i][1] < skor[i+1][1]) {
                        indexmax = i + 1;
                        System.out.println("Selamat kepada tim "+namaTim[indexmax]+ " telah memenangkan pertandingan");
                        break;
                    }else {
                        System.out.println("seri.");
                        break;
                    }
                }
            }
        }
        System.out.println();
    }
}
