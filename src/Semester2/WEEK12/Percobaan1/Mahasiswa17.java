package WEEK12.Percobaan1;

public class Mahasiswa17 {
    String nim;
    String nama;
    String kelas;
    String ipk;

    public Mahasiswa17(String nim, String nama, String kelas, String ipk) {
     this.nim = nim;
     this.nama = nama;
     this.kelas = kelas;
     this.ipk = ipk;
    }

    public void tampilkanInformasi(){
        System.out.printf("%-15s %-15s %-15s %-15s %n", nama, nim, kelas, ipk);
    }
}
