package WEEK6.jobseet.praktikum2;

public class mahasiswaBerprestasi17 {

    mahasiswa17[] listMhs = new mahasiswa17[5];
    int idx;
        
    void tambah (mahasiswa17 m){ // menambahkan objek dari kelas mahasiswa
        if (idx < listMhs.length) {
            listMhs[idx]= m ;
            idx++;
        }else{
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for (mahasiswa17 m : listMhs) {
            m.tampilkanInformasi();
            System.out.println("------------------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0; i < listMhs.length; i++) {
            for (int j = 1; j < listMhs.length-i; j++) {
                if (listMhs[j].ipk > listMhs[j-1].ipk) {
                   mahasiswa17 temp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=temp;
                }
            }
        }
    }

    void selectionSort(){
        for (int i = 0; i < listMhs.length; i++) {
            
            int min = i;
            for (int j = i+1; j < listMhs.length; j++) {
                if (listMhs[min].ipk > listMhs[j].ipk) {
                    min = j;
                }
            }
            mahasiswa17 temp = listMhs[min];
            listMhs[min]=listMhs[i];
            listMhs[i]=temp;

            //cara lain logikanya sama
            // mahasiswa17 temp = listMhs[i];
            // listMhs[i]=listMhs[min];
            // listMhs[min]=temp;

            //intinya ada yang dimasukkan kedalam temp dahulu agar value dalm index tidak ketimpa
            //kedua, masukkan nilai yang ingin dimasukkan kedalam indeks yang sudah dipindah
            //masukkan kembali value temp ke indeks yang sudah berpindah
        }
    }

    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa17 temp = listMhs[i];
            int j = i;
            while (j>0 && listMhs[j-1].ipk>temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            listMhs[j] = temp;
        }
    }
}
