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
        //desc, urutan dari besar ke kecil
        //misal data{1,2}
        for (int i = 0; i < listMhs.length; i++) { 
            for (int j = 1; j < listMhs.length-i; j++) { //kita mulai dari index 1
                if (listMhs[j].ipk > listMhs[j-1].ipk) { // bandingkan apakah nilai di index j lebih besar dari index j-1, jikat true masuk . 
                    //apakah 2 > 1 ? true masuk
                   mahasiswa17 temp = listMhs[j]; // masukkan value indek j kedalam temp agar tidak hilang. listmhs[j]=2 masuk ke temp
                    listMhs[j]=listMhs[j-1]; //swap indeks j-1 , kedalam indeks . listmhs[j-1]=1 masuk kedalam indeks j jadi data menjadi {1 , 1}, 
                    listMhs[j-1]=temp;  //masukkan value temp ke indeks j-1 .nah karena ingin swap menjadi yang besar terlebih dahulu
                                        //masukkan value temp ke list j-1. alhasil data akhir menjadi {2 , 1}
                    
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
    //asc
    void insertionSort(){
        for (int i = 1; i < listMhs.length; i++) {
            mahasiswa17 temp = listMhs[i]; //karena kita ingin menyimpan data listMhs[i] yang berupa arry
            //maka kita menggunakan var class mahasiswa17 untuk menjadikan temp sebagai wadah arr tersebut
            int j = i;
            while (j>=0 && listMhs[j-1].ipk>temp.ipk) {
                listMhs[j]=listMhs[j-1];
                j--;
            }
            //setlah terjadinya while, j--, maka j akan menjadi 0
            listMhs[j] = temp;
        }
        //untuk pembacaannya:
        //1. fori menggunakan indeks 1 untuk mulai, 
        //2. simpan value listMhs[i] ke dalam temp agar tidak hilang jika digeser
        //3. instansiasi int j=i, i = 1 == j
        //4. while dengan kondisi j>=0 dan listMhs[j-1].ipk>temp.ipk, yg mana jika meemnuhi salah satu kondisi maka while tdk akan berjalan
        //5. jika while true, value j=0 akan masuk kedalam listmhs indeks 1, mengubah value indeks 1 sebelumnya
        //6. karena ingin di swap , kita masukkan value temp ke indeks j yang sudah di j--, maka j=0, artinya value temp akan masuk ke indeks 0
    }   
}
