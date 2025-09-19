package Semester3.PBO.WEEK4.RelasiClass.Percobaan2;

public class Sopir19 {
    String nama;
    int biaya;

    Sopir19(){}

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }
    public int getBiaya() {
        return biaya;
    }

    public int hitungBiayaSopir(int hari){
        return biaya * hari;
    }
}
