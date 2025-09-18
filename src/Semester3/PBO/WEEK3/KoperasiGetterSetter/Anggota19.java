package Semester3.PBO.WEEK3.KoperasiGetterSetter;

public class Anggota19 {
    private String nama;
    private String alamat;
    private float simpanan;

    public void setName(String nama){
        this.nama = nama;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public String getNama(){
        return nama;
    }

    public String getAlamat(){
        return alamat;
    }

    public float getSimpanan(){
        return simpanan;
    }

    public void setor(float uang){
        simpanan += uang;
    }

    public void ambil(float uang){
        simpanan -= uang;
    }
}
