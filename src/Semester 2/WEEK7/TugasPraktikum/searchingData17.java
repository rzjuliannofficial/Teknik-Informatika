package WEEK7.TugasPraktikum;

public class searchingData17 {
    
    void PencarianDataSequential(dosen17[]arrDosen, String cariNama){
        int posisiDitemukan = -1; //inisialisasi posisi ditemukan
        for (int i = 0; i < arrDosen.length; i++) {
            if (arrDosen[i].nama.equalsIgnoreCase(cariNama)) {
                posisiDitemukan = i; //menyimpan posisi ditemukan
            }
        }
        if (posisiDitemukan != -1) {
            System.out.println("Data Dosen Ditemukan pada Index : " + posisiDitemukan);
            arrDosen[posisiDitemukan].tampilkanInfo(); //menampilkan data dosen yang ditemukan
        }else{
            System.out.println("Data Dosen dengan nama "+cariNama+" Tidak Ditemukan"); //jika tidak ditemukan
        }
    }

    void PencarianDataBinary(dosen17[]arrDosen17 , int cariUmur , int left ,int right){
        int mid;
        if (right >= left){
            mid=(left+right)/2;
            if (cariUmur== arrDosen17[mid].usia) {
                System.out.println("Data Dosen Ditemukan pada Index : " + mid);
                arrDosen17[mid].tampilkanInfo(); //menampilkan data dosen yang ditemukan
            }
            else if(arrDosen17[mid].usia > cariUmur){
                PencarianDataBinary(arrDosen17, cariUmur, left, mid-1); //ini rekursif jadi maksudnya kembali ke fungsi PencarianDataBinary lagi
            }
            else{
                PencarianDataBinary(arrDosen17, cariUmur, mid+1, right);
            }
        }else{
            System.out.println("Data Dosen dengan umur "+cariUmur+" Tidak Ditemukan"); //jika tidak ditemukan
        }
    }
}
