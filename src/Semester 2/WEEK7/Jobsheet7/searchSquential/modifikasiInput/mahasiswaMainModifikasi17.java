package WEEK7.Jobsheet7.searchSquential.modifikasiInput;
import WEEK7.Jobsheet7.searchSquential.mahasiswa17;
import java.util.Scanner;

public class mahasiswaMainModifikasi17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        
        mahasiswaBerprestasiModifikasi17 list = new mahasiswaBerprestasiModifikasi17(); //buat objek list menggunakan class mahasiswaBerprestasi17
        mahasiswa17[] listMhs = new mahasiswa17[jumlah]; //array untuk menampung jumlah mahasiswa

        for (int i = 0; i < listMhs.length; i++) {
            System.out.print("Mahasiswa Data Mahasiswa ke-"+(i+1));
            System.out.print("\nNIM\t: ");
            String nim = sc.nextLine();
            System.out.print("Nama\t: ");
            String nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            String kelas = sc.nextLine();
            System.out.print("IPK\t: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("------------------------------------");
            listMhs[i] = new mahasiswa17(nim, nama, kelas, ipk);
        }

        list.tampil(listMhs); //memanggil method tampil dari objek class mahasiswaBerprestasi17
        System.out.println("Note: Karena kode ini blum menggunakan sorting, maka jika ingi menggunakan binary searching, inpud data harus urut(ASC)");
        System.out.println("-----------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-----------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK\t: ");
        double cari = sc.nextDouble();

        //nelakukan pencarian data sequential
        System.out.println("----------------------------------");
        System.out.println("Menggunakan sequential searching");
        System.out.println("----------------------------------");
        //mengikut jobsheet
        // double posisi = list.sequentialSearch(cari); //ini return menjadi indeks
        // int pos = (int) posisi;
        //lebih mudah menjadi
        int posisi = list.sequentialSearch(listMhs,cari); //ini return menjadi indeks
        list.tampilPosisi(listMhs,cari, posisi); //posisi langusng masuk indeks jadi tidak perlu ubah variabel baru
        list.tampilDataSearch(listMhs,cari, posisi);
        
        //melakukan pencarian data Binary
        System.out.println("----------------------------------");
        System.out.println("Menggunakan Binary searching");
        System.out.println("----------------------------------");
        int posisi2 = list.findBinarySearch(listMhs,cari, 0 , listMhs.length-1);
        list.tampilPosisi(listMhs,cari, posisi2);
        list.tampilDataSearch(listMhs,cari, posisi2);
        sc.close();
    }
}
