package WEEK10.PengumpulanTugas;

public class Mahasiswa17 {
    
    String nama;
    String nim;
    String kelas;
    int nilai ;

    //konstructor kosongan
    Mahasiswa17(){

    }

    //konstructor dengan parameter
    Mahasiswa17(String nama , String nim, String kelas){
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        nilai = -1; //sebagai nilai awal ketika tugas belum dinilai
    }

    public void tugasDinilai(int nilai){
        this.nilai = nilai; //untuk mengeset nilai ketika dilakukan penilaian tugas mahasiswa 
    }

}
