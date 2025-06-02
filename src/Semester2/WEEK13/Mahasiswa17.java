package WEEK13;

public class Mahasiswa17 {
    String nim;
    String nama;
    String prodi;
    Double ipk;

    public Mahasiswa17(String nim, String nama, String kelas, Double ipk ){
        this.nim = nim;
        this.nama = nama;
        this.prodi = kelas;
        this.ipk = ipk;
    }

    public void tampilkanData() {
        System.out.printf("|%-15s|%-15s|%-15s|%-15.2f|%n", nim, nama, prodi, ipk);
    }
}
