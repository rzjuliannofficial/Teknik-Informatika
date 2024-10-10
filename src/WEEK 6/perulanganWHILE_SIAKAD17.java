import java.util.Scanner;
public class perulanganWHILE_SIAKAD17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilai, jml, i=1;

        System.out.print("Masukkan jumlah mahasiswa: ");
        jml =sc.nextInt();

        //Cocok untuk perulangan yang  tidak  diketahui jumlah pengulangannya

        while (i<=jml) { //knp <=? karena jika inputan 5 yang  diinginkan 5 kali, beda lagi kalau i=0
            System.out.print("Masukkan nilai mahasiswa: ");
            nilai=sc.nextInt();

            if (nilai<0 || nilai >100) {
                System.out.println("Nilai tidak valid. Masukkan lagi nilai yang valid");
                continue;//untuk  melompati perulangan saat nilai tidak valid. 
                //jika tidak ada ini maka akan berlanjut ke pengondisian/akan masuk nilai "else".
            }
            
            if (nilai >80 && nilai <=100) {
                System.out.println("Nilai mahasiswa ke-"+i+ " adalah A");
                System.out.println("Bagus pertahankan nilainya!");
            } else if (nilai >73 && nilai <=80) {
                System.out.println("Nilai mahasiswa ke-"+i+" adalah B+");
            } else if (nilai >65 && nilai <=73) {
                System.out.println("Nilai mahasiswa ke-"+i+" adalah B");
            } else if (nilai >60 && nilai <=73) {
                System.out.println("Nilai mahasiswa ke-"+i+" adalah B+");
            } else if (nilai >50 && nilai <=60) {
                System.out.println("Nilai mahasiswa ke-"+i+" adalah C");
            } else if (nilai >39 && nilai <=50) {
                System.out.println("Nilai mahasiswa ke-"+i+" adalah D");
            } else {
                System.out.println("Nilai mahasiswa ke-"+i+" adalah E");
            }
            i++;
        }
        sc.close();
    }
}