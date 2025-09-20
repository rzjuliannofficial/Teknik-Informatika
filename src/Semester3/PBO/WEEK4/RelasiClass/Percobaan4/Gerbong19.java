package Semester3.PBO.WEEK4.RelasiClass.Percobaan4;

public class Gerbong19 {
    private String kode;
    private Kursi19[] arrayKursi; 

    public Gerbong19(String kode , int jumlah){
        this.kode = kode;
        this.arrayKursi = new Kursi19[jumlah];
        this.initKursi();
    }

    private void initKursi(){
        for (int i = 0; i < arrayKursi.length; i++) {
            this.arrayKursi[i] = new Kursi19(String.valueOf(i + 1));
        }
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    public String getKode() {
        return kode;
    }

    public void setPenumpang(Penumpang19 penumpang, int nomor) {
        if (arrayKursi[nomor-1].getPenumpang()!= null) {
            System.out.println("Maaf Kursi nomor "+ nomor +" sudah ditempati!");
        }else {
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);
        }
    }
    
    public Kursi19[] getArrayKursi() {
        return arrayKursi;
    }

    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi19 kursi : arrayKursi) {
            info += kursi.info();
        }
        return info;
    }
}
