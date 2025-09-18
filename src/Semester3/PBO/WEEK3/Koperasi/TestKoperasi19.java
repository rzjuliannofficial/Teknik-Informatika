package Semester3.PBO.WEEK3.Koperasi;

import java.util.Scanner;

public class TestKoperasi19 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int pinjam;
        // int angsur;
        Anggota19 donny = new Anggota19("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("\nMeminjam uang 10.000.000...");
        donny.pinjam(10000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMeminjam uang 4.000.000...");
        donny.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 1.000");
        donny.angsur(1000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        System.out.println("\nMembayar angsuran 3.000.000");
        donny.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.print("\nPinjam: ");
        int pinjam = sc.nextInt();
        donny.pinjam(pinjam);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.print("\nAngsur: ");
        int angsur = sc.nextInt();
        donny.angsur(angsur);
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());

        sc.close();
    }
}

