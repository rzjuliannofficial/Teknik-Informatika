package WEEK10.PengumpulanTugas;

public class Mahasiswa17 {
    
    //disclaimer
    //Catatan: Tipe data pada variabel stack menyesuaikan dengan data yang akan disimpan di dalam Stack. 
            //Pada percobaan ini, data yang akan disimpan merupakan array of object dari Mahasiswa,
            //sehingga tipe data yang digunakan adalah Mahasiswa.
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
