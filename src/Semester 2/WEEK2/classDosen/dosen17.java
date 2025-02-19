package WEEK2.classDosen;

public class dosen17 {
    
    String idDosen ;
    String namaDosen ;
    boolean statusAktif = false;
    int tahunBergabung ;
    String bidangKeahlian;

    public dosen17() {
        idDosen = "D001";
        namaDosen = "Budi";
        statusAktif = true;
        tahunBergabung = 2010;
        bidangKeahlian = "Data Analisis";
    }

    public dosen17(String idDosen, String namaDosen, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
        this.idDosen = idDosen;
        this.namaDosen = namaDosen;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }

    void tampilInformasi() {
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama Dosen : " + namaDosen);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }

    void setStatusAktif(boolean status) {
        statusAktif = status;
        if (statusAktif == true) {
            System.out.println("Status berhasil diubah");
        }
    }

    int hitungMasaKerja(int tahunSekarang) {
        int masaKerja = tahunSekarang - tahunBergabung;
        return masaKerja;
    }

    void ubahKeahlian(String ubahKeahlian){
        bidangKeahlian = ubahKeahlian;
    }
}
