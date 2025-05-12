package WEEK11.Tugas;

import WEEK2.classMahasiswa.mahasiswa17;

public class AntrianPersetujuanKRS17 {
    Mahasiswa17[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianPersetujuanKRS17(int max){
        this.max = max ;
        this.data = new Mahasiswa17[max]; //inisialisasi panjang array data
        this.size = 0;
        this.front = 0; //index depan
        this.rear = -1; //index belakang
    }

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatAntrianTerdepan(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("=========================================");
            System.out.println("Menampilkan antrian terdepan");
            System.out.println("=========================================");
            System.out.printf("%-15s|%-15s|%-15s|%-15s|%n","nim","nama","prodi","kelas");
            System.out.println("=========================================");
            data[front].tampilkanData();
        }
    }
    
    public void tampilkanSemuaAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("=========================================");
            System.out.println("Daftar antrian persetujuan KRS");
            System.out.println("=========================================");
            System.out.printf("%-15s|%-15s|%-15s|%-15s|%n","nim","nama","prodi","kelas");
            System.out.println("=========================================");
            for (int i = 0; i < size; i++) {
                System.out.print(i+1+". ");
                data[i].tampilkanData();
            }
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public void tambahAntrian(Mahasiswa17 mhs){
        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah antrian");
        } else {
            ++rear; //rear yang awalnya -1 menjadi +1 jika kita menambah antrian
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " telah berhasil masuk ke dalam antrian");
        }
    }

    public Mahasiswa17 layaniAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return null;
        } else {
            Mahasiswa17 mhs = data[front];
            front++;
            size--;
            return mhs;
        }
    }

    public void ResetAntrian(){
        size = 0;
        front = 0;
        rear = -1;
        System.out.println("Antrian telah di RESET");
    }
}