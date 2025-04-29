package WEEK10.PengumpulanTugas;

public class StackKonversi17 {
    int[] tumpukanBiner;
    int size;
    int top; //indeks top dari stack

    //konstruktor 
    public StackKonversi17 (){
        this.size = 32; //asumsikan ukuran stack 32 bit
        tumpukanBiner = new int[size];
        top = -1; // Stack kosong
    }

    public boolean isEmpty(){
        return top == -1; // Stack kosong
    }

    public boolean isFull(){
        return top == size - 1; // Stack penuh
    }

    public void push(int data){
        if (isFull()) {
            System.out.println("Stack penuh");
        }else {
            top++;
            tumpukanBiner[top] = data; // Menambahkan data ke stack
        }
    }

    public int pop(){
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1; // Tidak ada data yang bisa diambil
        }else {
            int data = tumpukanBiner[top]; // Mengambil data dari stack
            top--; // Mengurangi indeks top
            return data; // Mengembalikan data yang diambil
        }
    }

}
