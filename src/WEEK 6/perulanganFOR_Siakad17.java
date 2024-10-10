import java.util.Scanner;

/**
 * perulangan1Percobaan1_17
 */
public class perulanganFOR_Siakad17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai=0 , tertinggi=0, terendah=100;
        int jumlahLulus=0;

        //for cocok untuk perulangan yang sudah diketahui jumlahnya

        for (int i = 0; i <= 2; i++) { // Loop dari 1 sampai 10
           System.out.print("Masukkan nilai mahasiswa ke-"+ i +": "); 
           nilai = sc.nextDouble();

           //cara membaca nya
           if (nilai > tertinggi) { //jika nilai > tertinggi(true), input nilai akan masuk ke var TERTINGGI menggantikan nilai 0.
            tertinggi=nilai;
            //JIKA false,  maka nilai tidak akan diperbarui ke Var tertinggi
           }
           //LANJUT
           if (nilai < terendah) { //JIKA NILAI TADI < TERENDAH(100) , input nilai akan masuk menggantikan nilai 100 tersebut
            terendah=nilai;
           }
           // Cek apakah mahasiswa lulus (nilai >= 60)
            if (nilai>=60) {
            jumlahLulus++;
           }

           //jika sudah sampai sini, karena perulanagan, maka kan kembali ke awal FOR, menggunakan save INPUTAN TADI.
        }
        
        System.out.println("Nilai tertinggi : "+tertinggi);
        System.out.println("Nilai terendah : "+terendah);
        System.out.println("Jumlah mahasiswa lulus :"+jumlahLulus);
        sc.close();
    }
}