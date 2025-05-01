package WEEK10.PengajuanIjinMahasiswa;

public class Surat17 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIjin;
    int durasi;

    public Surat17(){

    }

    public Surat17(String idSurat, String namaMahasiswa, String kelas, char jenisIjin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.kelas = kelas;
        this.jenisIjin = jenisIjin;
        this.durasi = durasi;
    }

    public void tampilkanSurat() {
        System.out.println("=========================================");
        System.out.printf("%-10s| %-10s | %-10s | %-10s | %-10s |%n", "Id Surat", "Nama", "Kelas", "Jenis Ijin", "Durasi Ijin");
        System.out.printf("%-10s| %-10s | %-10s | %-10s | %-10s |%n", idSurat, namaMahasiswa, kelas, jenisIjin, durasi);
        System.out.println("=========================================");
    }
}
