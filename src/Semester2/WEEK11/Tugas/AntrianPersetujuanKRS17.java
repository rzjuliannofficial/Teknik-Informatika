package WEEK11.Tugas;

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
}
