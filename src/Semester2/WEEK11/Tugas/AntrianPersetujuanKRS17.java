package WEEK11.Tugas;

public class AntrianPersetujuanKRS17 {
    Mahasiswa17[] data;
    int front;
    int rear;
    int size;
    int max;
    int done = 0;
    int totalMahasiswa = 30; // Total mahasiswa yang harus dilayani oleh DPA

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
        }else if (size < 2 || size == 1) {
            System.out.println("Jumlah Antrian kurang dari 2");
            System.out.println("===================================================================+");
            System.out.println("Menampilkan antrian 1 terdepan");
            System.out.println("===================================================================+");
            System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n","nim","nama","prodi","kelas");
            System.out.println("===================================================================+");
            data[front].tampilkanData();
            System.out.println("===================================================================+");
        } else {
            System.out.println("===================================================================+");
            System.out.println("Menampilkan antrian 2 terdepan");
            System.out.println("===================================================================+");
            System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n","nim","nama","prodi","kelas");
            System.out.println("===================================================================+");
            for(int i = 0 ; i < 2 ; i++){
                data[front+i].tampilkanData();
            }
            System.out.println("===================================================================+");
        }
    }
    
    public void lihatTerakhir(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        }else {
            System.out.println("===================================================================+");
            System.out.println("Antrian mahasiswa terakhir:");
            System.out.println("===================================================================+");
            System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n","nim","nama","prodi","kelas");
            System.out.println("===================================================================+");
            data[rear].tampilkanData();
            System.out.println("===================================================================+");
        }
    }

    public void tampilkanSemuaAntrian(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("===================================================================+");
            System.out.println("Daftar antrian persetujuan KRS");
            System.out.println("===================================================================+");
            System.out.printf("no |%-15s|%-15s|%-15s|%-15s|%n","nim","nama","prodi","kelas");
            System.out.println("===================================================================+");
            for (int i = 0; i < size; i++) {
                System.out.print(i+1+". ");
                data[front+i].tampilkanData();
            }
            System.out.println("===================================================================+");
        }
    }

    public int getJumlahAntrian(){
        return size;
    }

    public int getJumlahSudahDilayani(){
        return done;
    }

    public int getJumlahBelumDilayani() {
        return totalMahasiswa - done;
    }

    public void tambahAntrian(Mahasiswa17 mhs){
        if (done + size >= totalMahasiswa) {
            System.out.println("Tidak dapat menambahkan lebih banyak mahasiswa. Total mahasiswa yang harus dilayani adalah " + totalMahasiswa);
            return;
        }

        if (isFull()) {
            System.out.println("Antrian penuh, tidak dapat menambah antrian");
        } else {
            rear++; //rear yang awalnya -1 menjadi +1 jika kita menambah antrian
            data[rear] = mhs;
            size++;
            System.out.println(mhs.nama + " telah berhasil masuk ke dalam antrian");
        }
    }

    public void layaniAntrian(){
        if (done >= totalMahasiswa) {
            System.out.println("Semua mahasiswa sudah dilayani.");
            return;
        }

        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            
        } else {
            if (size < 2 || size == 1) {
                System.out.println("Jumlah Antrian kurang dari 2");
                System.out.println("================================================================+");
                System.out.println("Memanggil 1 mahasiswa untuk proses KRS");
                System.out.println("================================================================+");
                System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n","nim","nama","prodi","kelas");
                System.out.println("================================================================+");
                data[front].tampilkanData();
                front++;
                done++;
                size--;
                System.out.println("================================================================+");
            } else {
                System.out.println("================================================================+");
                System.out.println("Memanggil 2 mahasiswa untuk proses KRS");
                System.out.println("================================================================+");
                System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n","nim","nama","prodi","kelas");
                System.out.println("================================================================+");
                for (int i = 0; i < 2; i++) {
                    data[front].tampilkanData();
                    front++;
                    size--;
                    done++;
                }
                System.out.println("===============================================================+");
            }
        }
    }

    public void ResetAntrian(){
        size = 0;
        front = 0;
        rear = -1;
        System.out.println("Antrian telah di RESET");
    }
}