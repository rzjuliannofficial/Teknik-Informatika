package WEEK11.Praktikum2;

public class Mahasiswa17 {
    String nama;
    String nim;
    String prodi;
    String kelas;

    public Mahasiswa17(String nama, String nim, String prodi, String kelas) {
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData(){
        System.out.println(nim + " - " + nama + " - " + prodi + " - " + kelas);
    }
}
