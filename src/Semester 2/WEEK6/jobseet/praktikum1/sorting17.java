package WEEK6.jobseet.praktikum1;

public class sorting17 {
    
    int[] data;
    int jumData;

    sorting17(int Data[], int jumDat) {
        jumData = jumDat;
        data = new int[jumDat];
        for (int i = 0; i < jumData; i++) {
            data[i] = Data[i];
        }
    }

    //METODE BUBBLESORT
    void bubbleSort(){
        int temp = 0 ;
        for (int i = 0; i < jumData; i++) {
            for (int j = 1; j < jumData-i; j++) { //jumData-i dipergunakan untuk mengunci value
                                                //jadi misal j length = 5, kan indeks max = 4
                                                //di i= 0 maka value i= 0 bisa mentok ke kanan dan dikunci
                                                //kunci? karena saat i=1, indeks max j menjadi 4-1=3

                if (data[j-1]>data[j]) { //kita masuk di indeks j=1, untuk membandingkan dengan j=0
                    temp = data[j]; //jika true, indeks 1 masuk ke temp, dan terjadi kekosongan di indeks 1
                    data[j]=data[j-1]; // indeks 0 masuk ke indeks 1
                    data[j-1]=temp; // value yang ada di temp dimasukkan kedalam indeks 0
                }
            }
        }
    }

    //METHODE SELECTIONSORT (asc) kecil ke besar
    void selectionSort(){
        for (int i = 0; i < jumData-1; i++) {

            int min = i; //min = i = 0 dijadikan landasan pertama
            for (int j = i+1; j < jumData; j++) { //karena indeks 0 sudah dijadikan landasan pertama
                                                 //kita langung masuk kedalam j=i+1, jika indeks 0 maka langsung masuk indeks 1
                if (data[j]<data[min]) { // bandingkan value indeks yang masuk dalam min dgn value indeks j
                    min=j; //jika true, indeks j akan masuk ke dalam var min
                            //dan lanjut perulangan sampai ada selesai, dengan menggunakan var min yang baru
                }
            }
            int temp = data[i]; // memasukkan data indeks[i] kedalam temp, agar value tidak hilang jika perulanagn true
            data[i] = data[min]; //value data indeks min, menggantikan data[i]
            data[min]=temp; // setelah itu , data[i] yang disimpan dalam temp tadi, dipindahkan kedalam data indeks min  
                            //jadi sekarang data [min] adalah value dari temp
        }
    }

    //misal data {5, 3, 8, 1, 2}
    //perulangan 1
    //value data[i] masuk temp
    //inisialisasi j=i-1, karnea di perulangan inisialasi i=1, maka j=1-1=0
    //masuk while. apakah j>= 0 && data[j](5) > temp(3)

    void insertionSort(){
        for (int i = 1; i < jumData; i++) {
            int temp = data[i]; // Simpan nilai data[i] ke temp
            int j = i - 1; // Inisialisasi j sebagai indeks sebelumnya i-1
            
            //jgn lupa, kondisi dalam while digunakan untuk memastiakn loop berjalan
            //jadi while ini berjalan selama dua kondisi berikut masih true, salah sawwtu aja langusng break
            while (j >= 0 && data[j] > temp) { // Cek apakah elemen sebelumnya lebih besar
                data[j + 1] = data[j]; // jika ada elemen yang lebih besar dari temp Geser elemen ke kanan
                j--; // Pindah ke elemen sebelumnya
                //j disini sudah -1
            }
            data[j + 1] = temp; // j+1 menjadikan j=0, temp masuk kedalam indeks 0

            //jadi temp yg mulanya indeks 1, bervalue 3, menjadi ke indks 0 , dan indx 0 yang bervalue 5 , pindah ke indeks 1
        }
    }

    void insertionSortDESC(){
        for (int i = 1; i < jumData; i++) {
            int temp = data[i];
            int j=i-1;
            //data[j]=data[0], kalau dari perulangan 1, temp bervalue indeks 1
            while (j>=0 && data[j] < temp) { //menggunakan j>=0 agar j==0 juga diperiksa
                data[j+1] = data[j]; //value indeks 0 bergeser ke 1
                j--; //untuk keluar dari while, sekaran j=-1,
                        //jadi ,misal indeks i nya sudah puluhan, ya di ulang sampai j>=0
            }
            //while tadi mengakibatkan indeks 0 dan 1 bervalue sama
            //jadi masukkan temp ke indeks seharusnya / swap
            data[j+1] = temp; //j+1 karena j tadi sudah menjadi -1
        }
    }

    //NOTE = 
    //JADI perbedaan dari desc dan asc biasanya terletak pada kondisi didalam perulangannya
    //untuk insertionDESC ini TERLETAK PADA data[j] < temp (untuk desc)
    //untuk insertionASC ini TERLETAK PADA data[j] > temp (untuk ASC)
    void tampil(){
        for (int i = 0; i < jumData; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }
}
