package WEEK10.PengumpulanTugas;

public class StackTugasMahasiswa17 {
    
    Mahasiswa17[] stack;
    int top;
    int size;

    // Constructor untuk inisialisasi stack
    public StackTugasMahasiswa17(int size) {
        this.size = size;
        stack = new Mahasiswa17[size];
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

    public void push(Mahasiswa17 mhs) {
        if (!isFull()) {
            top++; // Menambah indeks top
            stack[top] = mhs; // Menambahkan mahasiswa ke stack
            System.out.printf("Tugas %s telah berhasil dikumpulkan.\n", mhs.nama);
        } else {
            System.out.println("Stack penuh, tidak bisa menambah tugas lagi.");
        }
    }

    public Mahasiswa17 pop() {
        if (!isEmpty()) { //!isEmpty()) , jadi jika hasil isEmpty() false, if akan di negasi , = true
                          //jika hasilnya false maka tidak masuk if
            Mahasiswa17 mhs = stack[top]; // Mengambil mahasiswa dari stack
            top--; // Mengurangi indeks top
            return mhs; // Mengembalikan mahasiswa yang diambil
        } else {
            System.out.println("Stack kosong, tidak ada tugas yang bisa diambil.");
            return null; // Tidak ada mahasiswa yang bisa diambil
        }
    }

    public Mahasiswa17 peek(){
        if (!isEmpty()) { //!isEmpty()) , jadi jika hasil isEmpty() false, if akan di negasi , = true
                          //jika hasilnya false maka tidak masuk if       
            return stack[top]; // Mengembalikan mahasiswa di posisi top
        }else {
            System.out.println("Stack kosong, tidak ada tugas yang bisa dilihat.");
            return null; // Tidak ada mahasiswa yang bisa dilihat
        }
    }

    public void print(){
        //menampilkan secara ASCENDING,
        // for (int i = 0; i <= top; i++) {
        //     System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas );
        // }  

        //Stack    //menampilkan secara DESCENDING,
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas );
        }
        System.out.println();
    }
}
