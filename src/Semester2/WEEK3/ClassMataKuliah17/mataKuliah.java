package WEEK3.ClassMataKuliah17;

public class mataKuliah {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    //dengan constructor
    public mataKuliah(String kode, String nama, int sks, int jumlahJam) {
        //note: jika Nama parameter sama dengan atribut, kita harus memakai this agar tidak eror
            // jika tidak ingin menggunakan this, nama parameter dan atribut harus berbeda. misal nama = n
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public mataKuliah() {
        this.nama = "Tidak ada nama";
        this.kode = "Tidak ada kode";
    }

    void tambahData (String kode , String nama , int sks , int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tampilInfo() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }

}
