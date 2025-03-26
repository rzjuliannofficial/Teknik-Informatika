package WEEK6.jobseet.latihanPraktikum;

public class sortingData17 {
    
    void bubbleSortASC(dosen17[]arrDosen17){
        //jika usia aja, maka cmn usia yg swap, tapi jika dengan menampilkan nama , maka data akan salah
        
        // for (int i = 0; i < arrDosen17.length-1; i++) { //arrdosen17.length-1 karena dalam bobblesort, setiap iterasi memastikan 1 element sdh berd diposisi akhir
        //     int temp = 0;
        //     for (int j = 1; j < arrDosen17.length-i; j++) {
        //         if (arrDosen17[j].usia < arrDosen17[j-1].usia) { //ascending
        //             temp = arrDosen17[j].usia;
        //             arrDosen17[j].usia = arrDosen17[j-1].usia;
        //             arrDosen17[j-1].usia=temp;
        //         }
        //     }
        // }
        

        //dengan kode seperti ini dapat mengurutkan semua data tidak hanya usia
        for (int i = 0; i < arrDosen17.length-1; i++) { //arrdosen17.length-1 karena dalam bobblesort, setiap iterasi memastikan 1 element sdh berd diposisi akhir
            

            dosen17 temp = arrDosen17[i]; // dengan mengubah arrdosen17 menjadi variabel, maka kita dapat mengakses nilai arrdosen17 dn memanipulasinya
                                         //maksudnya dengan itu kita dapat memasukkan nilai arrdosen, kedalam temp yang dibuat dengan var kelas, dan itu membuat temp dapat mengakses semua data arrdosen17[i]
            for (int j = 1; j < arrDosen17.length-i; j++) {
                if (arrDosen17[j].usia < arrDosen17[j-1].usia) { //ascending
                    temp = arrDosen17[j];
                    arrDosen17[j]= arrDosen17[j-1];
                    arrDosen17[j-1]=temp;
                }
            }
        }
    }

    void insertionSortDESC(dosen17[]arrDosen17){
        for (int i = 1; i < arrDosen17.length; i++) {
            dosen17 temp = arrDosen17[i]; //menggunakan var class dosen17 yang berupa kelas agar dapat menyimpan data yang berada disana
            int j = i-1; // mulai dari j = 0
            while (j>=0 && arrDosen17[j].usia < temp.usia) {
                arrDosen17[j+1] = arrDosen17[j];
                j--; // j=-1
                        //jika true langung break karena dicheack di awal while
            }
            //karena ini arry, maka tidak boleh minus, j+1=0
            arrDosen17[j+1]=temp; // j = 0
        }
    }
    //tampil sesudah sorting
    void tampil(dosen17[]arrDosen17){
        for (int i = 0; i < arrDosen17.length; i++) {
            System.out.println("-----------------------------------");
            System.out.println("Nama Dosen : "+arrDosen17[i].nama);
            System.out.println("Umur : "+arrDosen17[i].usia);
        }
    }
}