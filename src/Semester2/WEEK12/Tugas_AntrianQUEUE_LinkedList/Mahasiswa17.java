package WEEK12.Tugas_AntrianQUEUE_LinkedList;

public class Mahasiswa17 {
    String nim;
    String nama;
    String prodi;
    String kelas;

    public Mahasiswa17(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", nim, nama, prodi, kelas);
    }
}
