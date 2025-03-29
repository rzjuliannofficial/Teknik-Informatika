package WEEK7.Jobsheet7.searchSquential.modifikasiInput;
import WEEK7.Jobsheet7.searchSquential.mahasiswa17; // import class mahasiswa17
public class mahasiswaBerprestasiModifikasi17 {

    void tampil(mahasiswa17[] listMhs){
        for (mahasiswa17 m : listMhs) {
            m.tampilInformasi();
            System.out.println("=====================================");
        }
    }

    int sequentialSearch(mahasiswa17[] listMhs,double cari){
        int posisi = -1;
        for (int j=0; j<listMhs.length; j++) {
            if (listMhs[j].ipk == cari){
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    int findBinarySearch(mahasiswa17[] listMhs, double cari, int left, int right){
        int mid;
        if (right >= left){
            mid=(left+right)/2;
            if (cari== listMhs[mid].ipk) {
                return mid;
            }
            else if(listMhs[mid].ipk > cari){
                return findBinarySearch(listMhs,cari, left, mid-1); //ini rekursif jadi maksudnya kembali ke fungsi findBinarySearch lagi
            }
            else{
                return findBinarySearch(listMhs,cari, mid+1, right);
            }
        }
        return -1;
    }

    void tampilPosisi(mahasiswa17[] listMhs,double cari, int posisi){
        if (posisi!=-1) {
            System.out.println("Data mahasiswa dengan IPK :"+cari+" ditemukan pada indeks "+posisi);
        }else{
            System.out.println("Data mahasiswa dengan IPK :"+cari+" tidak ditemukan");
        }
    }

    void tampilDataSearch(mahasiswa17[] listMhs, double cari, int posisi){
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
