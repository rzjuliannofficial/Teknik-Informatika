package WEEK1;
import java.util.Scanner;

class prakFungsi {
    static Scanner sc = new Scanner(System.in);
    static String[] cabang = {"RoyalGarden1","RoyalGarden2","RoyalGarden3","RoyalGarden4",};
    static String[] jenisBunga = {"Aglonema","Keladi","Alocasia","Mawar"};
    static int[][] inventaris = new int[4][4];
    static int[] stock = new int[4];
    static int[] harga = {75000, 50000, 60000,10000 };
    static int[] penghasilan = new int[4];
    public static void main(String[] args) {
       
        while (true) {
        System.out.println("==========================");
        System.out.println("Toko Royal Garden");
        System.out.println("==========================");
        System.out.println("1. Input Stock");
        System.out.println("2. Data Stock");
        System.out.println("3. Pendapatan");
        System.out.println("4. Info Update");
        System.out.println("5. Keluar");
        System.out.println("==========================");
        System.out.print("Masukkan pilihan: ");
        int pilihan = sc.nextInt();
        System.out.println();
        sc.nextLine();
            switch (pilihan) {
                case 1:
                    inputStock();
                    break;
                case 2:
                    dataStok();
                    break;  
                case 3:
                    pendapatan();
                    break;
                case 4:
                    informasi();
                    break;
                case 5:
                    System.out.println("Anda telah keluar!");
                    return;

                default:
                    System.out.println("Input invalid! ");
                    System.out.println();
                    break;
            }
        }
    }  

    public static void inputStock() {
        System.out.println("=====================");
        System.out.println("Menu 1 . Input Stock");
        System.out.println("=====================");
        
        for (int i = 0; i < cabang.length;i++) {
            System.out.println((1+i)+".Cabang "+cabang[i]);
            for (int j = 0; j < cabang.length; j++) {
                System.out.println("  "+(1+j)+".Jenis Bunga "+jenisBunga[j]);   
                System.out.print("     Stok: ");
                stock[j] = sc.nextInt();
                sc.nextLine();
                inventaris[i][j] += stock[j];

            }
            
            System.out.println();
        }

        //informasi update
        inventaris[3][0] -= 1;
        inventaris[3][3] -= 5;
        inventaris[3][1] -= 2;
        
    }

    public static void dataStok() {
        System.out.println("=====================");
        System.out.println("Menu 2 . Data Stock");
        System.out.println("=====================");
        System.out.println();
        boolean ada = true;
        //check ada tidak?
        for (int i = 0; i < cabang.length; i++) {
            for (int j = 0; j < cabang.length; j++) {
                if (inventaris[i][j]==0) {
                    ada = false;
                    System.out.println("Tidak ada data. Data belum dimasukkan. ");
                    System.out.println();
                    return;
                }
            }
        }


        //tampilan
        for (int j = 0; j < cabang.length; j++) {
            System.out.print("\t\t"+jenisBunga[j]);   
        }
        System.out.println();
        for (int i = 0; i < cabang.length; i++) {
            System.out.print(cabang[i]+"\t");
            for (int j = 0; j < 4; j++) {
                System.out.print(inventaris[i][j]+"\t\t\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pendapatan(){
        System.out.println("=====================");
        System.out.println("Menu 3 . Pendapatan");
        System.out.println("=====================");
        System.out.println();
        
        //perhitungan
        for (int i = 0; i < cabang.length; i++) {
            for (int j = 0; j < cabang.length; j++) {
                penghasilan[i] += inventaris[i][j] * harga[j] ;
            }
        }

        System.out.println("Rincian Harga Bunga");
        for (int i = 0; i < cabang.length; i++) {
            System.out.println((i+1)+"."+jenisBunga[i]+" = "+harga[i]);
        }

        for (int i = 0; i < cabang.length; i++) {
            System.out.println("Cabang "+cabang[i]+": "+penghasilan[i]);
        }
        System.out.println();
    }

    public static void informasi (){
        System.out.println("=====================");
        System.out.println("Menu 4. Informasi Update");
        System.out.println("=====================");
        System.out.println();

        System.out.println("Karena adanya badai di Cabang RoyalGarden4, terdapat beberapa bunga mati.");
        System.out.println("Diantaranya 1 bunga Aglonema , 2 bunga Keladi ,dan 5 bunga Mawar .");
        System.out.println();
        
    }
}