package WEEK10.PengajuanIjinMahasiswa;

public class StackSurat17 {
    Surat17[] stackSurat; //deklarasi stack untuk menyimpan surat
    int size;
    int top; //indeks top dari stack

    //konstruktor
    public StackSurat17 (int size){
        this.size = size; //asumsikan ukuran stack 10 surat
        stackSurat = new Surat17[size];
        top = -1; // Stack kosong
    }

    public boolean isFull(){
        if (top == size - 1) {
            return true; // Stack penuh
        } else {
            return false; // Stack tidak penuh
        }
    }

    public boolean isEmpty(){
        if (top == -1) {
            return true; // Stack kosong
        } else {
            return false; // Stack tidak kosong
        }
    }

    public void push(Surat17 surat) {
        if (!isFull()) {
            top++; // Menambah indeks top
            stackSurat[top] = surat; // Menambahkan surat ke stack;
            System.out.printf("Surat %s telah berhasil diajukan.\n", surat.idSurat);
        } else {
            System.out.println("Stack penuh, tidak bisa menambah surat lagi.");
        }
    }

    public Surat17 pop(){
        if (!isEmpty()) { 
            Surat17 surat = stackSurat[top]; // Mengambil stackSurat indeks top , lalu disimpan ke surat
            top--; // Mengurangi indeks top
            return surat; // return surat yang terdapat value dari indeks top ke pemanggil
        } else {
            System.out.println("Stack kosong, tidak ada surat yang bisa diambil.");
            return null; // Tidak ada surat yang bisa diambil
        }
    }

    public Surat17 peek(){
        if (!isEmpty()) {
            return stackSurat[top]; // Mengembalikan surat teratas tanpa mengeluarkannya dari stack
        } else {
            System.out.println("Stack kosong, tidak ada surat yang bisa dilihat.");
            return null; // Tidak ada surat yang bisa dilihat
        }
    }

    public void searchingSurat(String namaMahasiswa){
        boolean ada = false; //flag untuk menandakan apakah surat ditemukan
        for (int i = 0; i <= top; i++) {
            if (stackSurat[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat ditemukan: ");
                stackSurat[i].tampilkanSurat(); // Menampilkan detail surat
                ada = true; //surat ditemukan
            }
        }
        if (!ada) {
            System.out.println("Surat tidak ditemukan untuk nama mahasiswa: " + namaMahasiswa);
        }
    }
}
