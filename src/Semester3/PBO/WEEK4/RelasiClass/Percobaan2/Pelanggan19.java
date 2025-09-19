package Semester3.PBO.WEEK4.RelasiClass.Percobaan2;

public class Pelanggan19 {
    
    private String nama;
    private Mobil19 mobil;
    private Sopir19 sopir;
    private int hari;

    Pelanggan19(){}

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }

    public void setMobil(Mobil19 mobil) {
        this.mobil = mobil;
    }
    public Mobil19 getMobil() {
        return mobil;
    }

    public void setSopir(Sopir19 sopir) {
        this.sopir = sopir;
    }
    public Sopir19 getSopir() {
        return sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }
    public int getHari() {
        return hari;
    }

    public int hitungBiayaTotal(){
        return mobil.hitungBiayaMobil(hari)
        + sopir.hitungBiayaSopir(hari);
    }

}
