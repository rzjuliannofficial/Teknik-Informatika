package WEEK3.Tugas.DOSEN;

public class Dosen17 {
    
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen17 (String kode, String nama, Boolean jenisKelamin, int usia) {
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
}