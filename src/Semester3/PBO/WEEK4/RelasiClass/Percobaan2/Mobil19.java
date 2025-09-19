package Semester3.PBO.WEEK4.RelasiClass.Percobaan2;

public class Mobil19 {
    private String merk;
    private int biaya;

    Mobil19(){}

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getBiaya() {
        return biaya;
    }

    public String getMerk() {
        return merk;
    }

    public int hitungBiayaMobil(int hari){
        return biaya * hari;
    }
}
