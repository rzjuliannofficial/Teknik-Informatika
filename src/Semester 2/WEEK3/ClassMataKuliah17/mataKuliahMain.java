package WEEK3.ClassMataKuliah17;
import java.util.Scanner;
public class mataKuliahMain {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jumlah Mata Kuliah Yang Akan Diinput : ");
        int jumlahMataKuliah = sc.nextInt();
        sc.nextLine();

        mataKuliah[] arrMataKuliah = new mataKuliah[jumlahMataKuliah]; //deklarasi array of object
        String kode , nama , dummy ;
        int sks , jumlahJam;

        //dengan constructor
        System.out.println("Konstruktor 1 tanpa parameter");
        mataKuliah mk1 = new mataKuliah(); //inisialisasi objek pertama
        System.out.println("Kode : " + mk1.kode);
        System.out.println("Nama : " + mk1.nama);

        System.out.println();
        System.out.println("Konstruktor 2 dengan parameter");
        for (int i = 0; i < arrMataKuliah.length; i++) {
            System.out.println("Mata Kuliah ke-" + (i+1));
            System.out.print("Kode : ");
            kode = sc.nextLine();
            System.out.print("Nama : ");
            nama = sc.nextLine();
            System.out.print("SKS : ") ;
            sks = sc.nextInt();
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(sc.nextLine()); // konvert string ke int
            System.out.println("-----------------------------");
            
            //buat objek baru dibawah karena objek belum diinisialisasi karena ada parameter
            arrMataKuliah[i] = new mataKuliah(kode, nama, sks, jumlahJam); // buat objek baru
        }

        System.out.println();
        for (int i = 0; i < arrMataKuliah.length; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            System.out.println("Kode : " + arrMataKuliah[i].kode);
            System.out.println("Nama : " + arrMataKuliah[i].nama);
            System.out.println("SKS : " + arrMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrMataKuliah[i].jumlahJam);
            System.out.println("-----------------------------");
        }

        //tambah data
        mataKuliah mk2 = new mataKuliah();
        System.out.println();
        System.out.println("Tambah Data");
        mk2.tambahData("TIF", "Algoritma dan Struktur Data", 3, 6);
        mk2.tampilInfo();
        sc.close();
    }
}
