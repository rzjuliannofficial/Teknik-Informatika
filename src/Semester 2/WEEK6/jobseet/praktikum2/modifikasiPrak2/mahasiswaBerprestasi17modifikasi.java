package WEEK6.jobseet.praktikum2.modifikasiPrak2;

import WEEK6.jobseet.praktikum2.mahasiswa17;
public class mahasiswaBerprestasi17modifikasi {

    void tampil(mahasiswa17[]arr){
        for (mahasiswa17 m : arr) {
            m.tampilkanInformasi();
            System.out.println("------------------------------");
        }
    }

    void bubbleSort(mahasiswa17[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j].ipk > arr[j-1].ipk) {
                   mahasiswa17 temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
    }

    void selectionSort(mahasiswa17[]arr){
        for (int i = 0; i < arr.length; i++) {
            
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[min].ipk > arr[j].ipk) {
                    min = j;
                }
            }
            mahasiswa17 temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

            //cara lain logikanya sama
            // mahasiswa17 temp = arr[i];
            // arr[i]=arr[min];
            // arr[min]=temp;

            //intinya ada yang dimasukkan kedalam temp dahulu agar value dalm index tidak ketimpa
            //kedua, masukkan nilai yang ingin dimasukkan kedalam indeks yang sudah dipindah
            //masukkan kembali value temp ke indeks yang sudah berpindah
        }
    }

    void insertionSort(mahasiswa17[]arr){
        for (int i = 1; i < arr.length; i++) {
            mahasiswa17 temp = arr[i];
            int j = i;
            while (j>=0 && arr[j-1].ipk>temp.ipk) {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j] = temp;
        }
    }
}