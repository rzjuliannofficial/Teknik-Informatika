package Semester3.PBO.WEEK3.Koperasi;

public class Anggota19 {
    private String nomorKtp;
    private String nama;
    private int pinjam;
    private int angsur;
    private int jumlahPinjam;
    private int limitPeminjaman;

    Anggota19(String nomorKtp , String nama, int limitPeminjaman){
        this.nomorKtp = nomorKtp;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
    }

    public String getNama(){
        return nama;
    }

    public void pinjam(int pinjam){
        if (limitPeminjaman < pinjam) {
            System.out.println("Maaf, jumlah pinjam melebihi limit.");
        }else {
            jumlahPinjam += pinjam;
        }
    }

    public int getLimitPinjaman(){
        return limitPeminjaman;
    }

    public int getJumlahPinjaman(){
        return jumlahPinjam;
    }

    public void angsur(int angsur){
        if (angsur <= ((jumlahPinjam*10)/100)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.");
        }else {
            jumlahPinjam -= angsur;
        }
    }
}
