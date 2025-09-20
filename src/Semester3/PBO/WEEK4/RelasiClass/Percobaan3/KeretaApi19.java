package Semester3.PBO.WEEK4.RelasiClass.Percobaan3;

public class KeretaApi19 {
    private String nama;
    private String kelas;
    private Pegawai19 masinis;
    private Pegawai19 asisten;

    public KeretaApi19(String nama, String kelas, Pegawai19 masinis) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi19(String nama, String kelas, Pegawai19 masinis, Pegawai19 asisten) {
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setMasinis(Pegawai19 masinis) {
        this.masinis = masinis;
    }

    public Pegawai19 getMasinis() {
        return masinis;
    }

    public void setAsisten(Pegawai19 asisten) {
        this.asisten = asisten;
    }

    public Pegawai19 getAsisten() {
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: \n" + this.masinis.info();
        if (this.asisten != null) {
            info += "Asisten: \n" + this.asisten.info();
        }
        return info;
    }
}
