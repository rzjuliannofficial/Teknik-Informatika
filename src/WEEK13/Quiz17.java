package WEEK13;

import java.util.Scanner;

public class Quiz17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak wilayah: ");
        int wilayah = sc.nextInt();
        sc.nextLine();

        int donasi[][] = new int[wilayah][3];
        String wilayahArr[] = new String[wilayah];
        String kategori[] = {"Makanan", "Pakaian","Obat- obatan"} ;
        double jumDWil, jumtot=0;
        //input wilayah
        for (int i = 0; i < donasi.length; i++) {
            System.out.print("Wilayah: ");
            wilayahArr[i] = sc.nextLine();
        }
        
        // for (int i = 0; i < donasi.length; i++) {
        //         System.out.print("Masukkan Kategori: ");
        //         kategori[i] = sc.nextLine();
        // }
        for (int i = 0; i < donasi.length; i++) {
            System.out.println("Wilayah: "+wilayahArr[i]);
            for (int j = 0; j < donasi[i].length; j++) {
                System.out.println("Kategori: "+kategori[i]);
                System.out.println("Jumlah donasi: ");
                donasi[i][j] = sc.nextInt();
            }
        }

        //tabel
        System.out.println("\nTabel Donasi");
        for (int i = 0; i < kategori.length; i++) {
            System.out.print("\t\t"+kategori[i]);
        }
        for (int i = 0; i < donasi.length; i++) {
            System.out.print("\n"+wilayahArr[i]+" :\t");
            for (int j = 0; j < donasi[i].length; j++) {
                System.out.print("\t"+donasi[i][j]+"\t");
            }
        }
        System.out.println();
        System.out.println("Jumlah donasi setiap wilaya: ");
        for (int i = 0; i < donasi.length; i++) {
            jumDWil = 0;
            for (int j = 0; j < donasi[i].length; j++) {
                jumDWil += donasi[i][j];
            }
            jumtot += jumDWil;
            System.out.println(wilayahArr[i]+" : "+jumDWil);
        }
        System.out.println();

        double persentase = 0;
        double totdon=0;
        double totkat=0;
        System.out.println("mengitung total donasi");
        System.out.println("Donasi terkumpul: "+jumtot);
        for (int j = 0; j < kategori.length; j++) {
            System.out.println("Kategori "+(j+1));
            totkat=0;
            for (int i = 0; i < kategori.length; i++) {
                totkat += donasi[i][j];
            }
            persentase = totkat/jumtot*100;
            System.out.println("Presnetase : "+ persentase+"%");
        }
        System.out.println("Kontribusi terbanyak setiap kategori: ");
        for (int j = 0; j < kategori.length; j++) {
            int indexMax = 0;
            for (int i = 0; i < donasi.length; i++) {
                if (donasi[i][j] > donasi[indexMax][j]) {
                    indexMax = i;
                }else if (donasi[i][j] == donasi[indexMax][j]) {
                    indexMax = i;
                }  
            }
            if (indexMax!=0) {
                System.out.println(kategori[j] +" : "+ wilayahArr[indexMax]);
            }else {
                System.out.println(kategori[j]+": Tidak ada kontribusi");
            }
        }
    }
}
