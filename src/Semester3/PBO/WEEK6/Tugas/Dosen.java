package Semester3.PBO.WEEK6.Tugas;

public class Dosen extends Pegawai {
    int jumlahSKS;
    int Tarif_SKS = 10000 ;

    public Dosen(String nip, String nama, String alamat){
        super(nip, nama, alamat);
    }

    public void setJumlahSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int getGaji(){
        return jumlahSKS * Tarif_SKS;
    }
}
