package Semester3.PBO.WEEK4.RelasiClass.Percobaan4;

public class Kursi19 {
    private String nomor;
    private Penumpang19 penumpang;

    Kursi19(String nomor){
        this.nomor = nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }
    public String getNomor() {
        return nomor;
    }

    public void setPenumpang(Penumpang19 penumpang) {
        this.penumpang = penumpang;
    }
    public Penumpang19 getPenumpang() {
        return penumpang;
    }

    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
            info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}
