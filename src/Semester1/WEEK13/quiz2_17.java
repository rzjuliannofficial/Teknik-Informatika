package WEEK13;
import java.util.Scanner;

public class quiz2_17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double persentase=0;
        double totalWil = 0, totDon=0;
        
        System.out.print("Masukkan jumlah wilayah: ");
        int wilayah = sc.nextInt();

        String wilayahArr[]= new String[wilayah];
        String kategoriArr[] = {"Makanan", "Minuman", "Pakaian"};
        int donasi[][] = new int[wilayah][kategoriArr.length];
        sc.nextLine();
        //input nama lokasi
        System.out.println("Masukkan nama wilayah untuk setiap lokasi:");
        for (int i = 0; i < wilayahArr.length; i++) {
            System.out.print("Wilayah "+(i+1)+": ");
            wilayahArr[i] = sc.nextLine();
        }
        System.out.println();
        for (int i = 0; i < wilayahArr.length; i++) {
            System.out.println("Wilayah: "+wilayahArr[i]);
            for (int j = 0; j < donasi[i].length; j++) {
                System.out.println("Masukkan donasi");
                System.out.print((i+1)+". "+kategoriArr[j] +": ");
                donasi[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        // // data lokasi
        // System.out.println("DATA INPUT BARANG");
        // for (int i = 0; i < wilayahArr.length; i++) {
        //     System.out.println((i+1)+"-"+wilayahArr[i]);
        // }
        // //input data kategori
        // System.out.println();
        // System.out.println("INPUT DATA");
        // while (true) {
        //     //karena yang ditanya jenis barang jadi automatis kita butuh memasukkan index nama barang
        //     System.out.print("kategori barang (1-"+(kategoriArr.length)+"): ");
        //     int indexBarang = sc.nextInt();
        //     if (indexBarang>kategoriArr.length || indexBarang < 0) {
        //         System.out.println("Masukkan index yang benar!");
        //         continue;
        //     }
            
        //     System.out.print("wilayah (1-"+(wilayahArr.length)+"): ");
        //     int indexwilayah = sc.nextInt();
        //     if (indexwilayah>wilayahArr.length || wilayahArr.length< 0) {
        //         System.out.println("Masukkan index yang benar!");
        //         continue;
        //     }
            
        //     System.out.print("Tambah donasi: ");
        //     int tambahStok = sc.nextInt();
            
        //     //Masukkan ke input kedalam array
        //     donasi[indexBarang-1][indexwilayah-1] += tambahStok;

        //     System.out.print("Lanjut?(0/1)");
        //     int lanjut = sc.nextInt();
        //     if (lanjut==0) {
        //         break;
        //     }
        //     System.out.println();
        // }
        System.out.println();
        System.out.println("Tabel stok gudang: ");
        for (int i = 0; i < wilayahArr.length; i++) {
            System.out.print("\t\t"+kategoriArr[i]);
        }
        for (int i = 0; i < kategoriArr.length; i++) {
            System.out.print("\n"+wilayahArr[i]+": \t");
            for (int j = 0; j < donasi[i].length; j++) {
                System.out.print("\t"+donasi[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        
        System.out.println("Jumlah donasi setiap wilayah");
        for (int i = 0; i < kategoriArr.length; i++) {
            totalWil = 0;
            for (int j = 0; j < donasi[i].length; j++) {
                totalWil += donasi[i][j];
            }
            System.out.println(wilayahArr[i]+" : "+totalWil);
            System.out.println();
            totDon += totalWil;
        }

        System.out.println("Total jumlah donasi: "+totDon);
        System.out.println();
        System.out.println("Presentase donasi setiap kategori");
        double totkateg = 0;
        for (int j = 0; j < donasi.length; j++) {
            persentase = 0;
            totkateg=0;
            for (int i = 0; i < wilayahArr.length; i++) {
                totkateg += donasi[i][j];
            }
            persentase = (totkateg/totDon)*100;
            System.out.println(kategoriArr[j] +" : " +persentase);
            System.out.println();
        }
        System.out.println("Kontribusi terbanyak setiap kategori: ");
        int indexMax2 = 0;
        for (int j = 0; j < kategoriArr.length; j++) {
            int indexMax = 0;
            for (int i = 0; i < wilayahArr.length; i++) {
                if (donasi[i][j] > donasi[indexMax][j]) {
                    indexMax = i;
                }else if (donasi[i][j] == donasi[indexMax][j]) {
                    indexMax2 = indexMax;
                    indexMax = i;
                     //jika kontribusi terbesar sama , maka tampilkan semua wilayah yang kontribusinya sama, tapi ini masih kurang jika ada 2 atau lebih wilayah yang kontribusinya sama
                    if (i == indexMax && indexMax2 == indexMax) {
                        indexMax2 = indexMax;
                    }
                }
            }
            if (indexMax==0) {
                System.out.println(kategoriArr[j]+": Tidak ada kontribusi");
            } else {
                System.out.print("\n"+kategoriArr[j] +" : "+ wilayahArr[indexMax]);
                //jika kontribusi terbesar sama , maka tampilkan semua wilayah yang kontribusinya sama, tapi ini masih kurang jika ada 2 atau lebih wilayah yang kontribusinya sama
                if (donasi[indexMax2][j] == donasi[indexMax][j]) {
                    System.out.print(" & "+wilayahArr[indexMax2]);
                    }
            }
        }
    }
}

