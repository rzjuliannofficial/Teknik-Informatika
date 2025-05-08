package UTS_CM;
public class Penilaian7{
    Mahasiswa7 mahasiswa;
    MataKuliah7 matakuliah;
    double nilaiTugas, nilaiUTS, nilaiUAS, nilaiAkhir;
    
    Penilaian7(Mahasiswa7 mahasiswa, MataKuliah7 matakuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    void hitungNilaiAkhir(){
        this.nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUTS) + (0.4 * nilaiUAS);
    }
}