package WEEK7.Jobsheet7.searchSquential;

public class mahasiswaBerprestasi17 {
    mahasiswa17[] listMhs= new mahasiswa17[5];
    int indeks;

    public void tambah(mahasiswa17 m){
        if (indeks < listMhs.length) {
            listMhs[indeks] = m;
            indeks++;
        }else{
            System.out.println("Data sudah penuh");
        }
    }

    void tampil(){
        for (mahasiswa17 m : listMhs) {
            m.tampilInformasi();
            System.out.println("=====================================");
        }
    }

    int sequentialSearch(double cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++) {
            if (listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(double cari, int left, int right){
        int mid;
        if (right >= left){
            mid=(left+right)/2;
            if (cari== listMhs[mid].ipk) {
                return mid;
            }
            else if(listMhs[mid].ipk > cari){
                return findBinarySearch(cari, left, mid-1); //ini rekursif jadi maksudnya kembali ke fungsi findBinarySearch lagi
            }
            else{
                return findBinarySearch(cari, mid+1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(double cari, int posisi){
        if (posisi!=-1) {
            System.out.println("Data mahasiswa dengan IPK :"+cari+" ditemukan pada indeks "+posisi);
        }else{
            System.out.println("Data mahasiswa dengan IPK :"+cari+" tidak ditemukan");
        }
    }

    void tampilDataSearch( double cari, int posisi){
        if (posisi != -1) {
           System.out.println("nim\t : "+listMhs[posisi].nim); 
           System.out.println("nama\t : "+listMhs[posisi].nama); 
           System.out.println("kelas\t : "+listMhs[posisi].kelas); 
           System.out.println("ipk\t : "+cari);
        }else{
            System.out.println("Data mahasiswa dengan IPK :"+cari+" tidak ditemukan");
        }
    }
}
