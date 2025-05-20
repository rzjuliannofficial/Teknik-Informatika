package WEEK11.Praktikum2;

public class AntrianLayanan17 {
    Mahasiswa17[] data;
    int front;
    int rear;
    int size;
    int max;

    public AntrianLayanan17(int max){
        this.max = max ;
        this.data = new Mahasiswa17[max]; //array data
        this.size = 0; 
        this.front = 0; 
        this.rear = -1; 
    }

    boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }

    boolean isFull(){
        if (size == max) {
            return true;
        }else {
            return false;
        }
    }

    public void lihatTerdepan(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else {
            System.out.println("Antrian mahasiswa terdepan:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Daftar Mahasiswa dalam antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max; 
            System.out.print((i+1) + ". ");
            data[index].tampilkanData();
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public void tambahAntrian(Mahasiswa17 mhs){
        if (isFull()) {
            System.out.println("Antrian penuh. tidak dapat menambah mahasiswa.");
            return;
        }
        rear = (rear + 1) % max; 
        //penjelasan singkat: ini adalah cara agar efisiensi memory => misal (0 + 1) % 5 = 1, ini membatasi front dapat digunakan terus menerus , jika front = 5 maka akan kembali ke 0
        //jika menggunakan rear++ maka akan ada index out of bound 
        //jika kita sdh full emngisi, terus kita pop 1 orang, jika masukkan lagi maka index out of bound.
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian.");
    }
    
    public Mahasiswa17 layananMahasiswa17(){
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa17 mhs = data[front];
        front = (front + 1) % max;
        size--;
        return mhs;
    }

    public void lihatTerakhir(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else {
            System.out.println("Antrian mahasiswa terakhir:");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkanData();
        }
    }

    public void clear(){
        if (isEmpty()) {
            System.out.println("antrian masih kosong");
        }else {
            front = 0;
            rear = -1;
            size=0;
            System.out.println("antrian berhasil dikosongkan");
        }
    }
}