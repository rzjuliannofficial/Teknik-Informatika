package WEEK3.Latihan;

public class Guru {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public Guru(String kode, String nama, boolean jenisKelamin, int usia) {
        //note: jika Nama parameter sama dengan atribut, kita harus memakai this agar tidak eror
            // jika tidak ingin menggunakan this, nama parameter dan atribut harus berbeda. misal nama = n
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilkanInfo() {
        System.out.println("Kode\t\t: " + kode);
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + (jenisKelamin ? "Pria" : "Wanita"));
        System.out.println("Usia\t\t: " + usia + " tahun");
        System.out.println("-----------------------------------");
    }

    void cekUmur() {
        System.out.println(usia > 55 ? "Guru ini sudah pensiun" : "Guru ini belum pensiun");
    }
}
