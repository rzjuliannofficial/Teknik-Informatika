package WEEK13;
import java.util.Scanner;

public class quiz2_17 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String wilayahArr[]= new String[3];
        String kategoriArr[] = new String[3];
        int donasi[][] = new int[3][3];
        String wilayah , kategori;
        double persentase=0 , totalpr= 0, totpersentase= 0;

        //input nama lokasi
        System.out.println("Masukkan nama wilayah untuk setiap lokasi:");
        for (int i = 0; i < wilayahArr.length; i++) {
            System.out.print("Wilayah "+(i+1)+": ");
            wilayahArr[i] = sc.nextLine();
        }
        //input kategori
        for (int i = 0; i < kategoriArr.length; i++) {
            System.out.print("Masukkan kategori barang : ");
            kategoriArr[i] = sc.nextLine();
        }
        //data kategori
        System.out.println("DATA INPUT BARANG");
        for (int i = 0; i < kategoriArr.length; i++) {
            System.out.println((i+1)+"-"+kategoriArr[i]);
        }
        System.out.println();
        // data lokasi
        System.out.println("DATA INPUT BARANG");
        for (int i = 0; i < wilayahArr.length; i++) {
            System.out.println((i+1)+"-"+wilayahArr[i]);
        }
        //input data kategori
        System.out.println();
        System.out.println("INPUT DATA");
        while (true) {
            //karena yang ditanya jenis barang jadi automatis kita butuh memasukkan index nama barang
            System.out.print("kategori barang (1-"+(kategoriArr.length)+"): ");
            int indexBarang = sc.nextInt();
            if (indexBarang>kategoriArr.length || indexBarang < 0) {
                System.out.println("Masukkan index yang benar!");
                continue;
            }
            
            System.out.print("wilayah (1-"+(wilayahArr.length)+"): ");
            int indexwilayah = sc.nextInt();
            if (indexwilayah>wilayahArr.length || wilayahArr.length< 0) {
                System.out.println("Masukkan index yang benar!");
                continue;
            }
            
            System.out.print("Tambah donasi: ");
            int tambahStok = sc.nextInt();
            
            //Masukkan ke input kedalam array
            donasi[indexBarang-1][indexwilayah-1] += tambahStok;

            System.out.print("Lanjut?(0/1)");
            int lanjut = sc.nextInt();
            if (lanjut==0) {
                break;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Tabel stok gudang: ");
        for (int i = 0; i < wilayahArr.length; i++) {
            System.out.print("\t"+wilayahArr[i]);
        }
        for (int i = 0; i < kategoriArr.length; i++) {
            System.out.print("\n"+kategoriArr[i]+":\t");
            for (int j = 0; j < donasi[i].length; j++) {
                System.out.print(donasi[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        int total = 0;
        System.out.println("Jumlah donasi setiap wilayah");
        for (int j = 0; j < kategoriArr.length; j++) {
            total = 0;
            for (int i = 0; i < donasi.length; i++) {
                total += donasi[i][j];
            }
            System.out.println(wilayahArr[j]+" : "+total);
            totalpr += total;
            System.out.println();
        }
        System.out.println("Presentase donasi setiap kategori");
        for (int i = 0; i < donasi.length; i++) {
            persentase = 0;
            
            for (int j = 0; j < donasi[i].length; j++) {
                persentase = (donasi[i][j]*100)/totalpr;
                totpersentase += persentase;
            }
            System.out.println(kategoriArr[i] +" : " +totpersentase);
            System.out.println();
        }
        System.out.println("Kontribusi terbanyak setiap kategori: ");
        for (int i = 0; i < donasi.length; i++) {
            int indexMax = 0;
            for (int j = 0; j < donasi.length; j++) {
                if (donasi[i][j] > donasi[i][indexMax]) {
                    indexMax = j;
                }  
            }
            if (indexMax!=0) {
                System.out.println(kategoriArr[i] +" : "+ wilayahArr[indexMax]);
            }else {
                System.out.println(kategoriArr[i]+": Tidak ada kontribusi");
            }
        }
    }
}

