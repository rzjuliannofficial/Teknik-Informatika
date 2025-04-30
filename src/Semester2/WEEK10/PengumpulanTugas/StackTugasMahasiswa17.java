package WEEK10.PengumpulanTugas;

public class StackTugasMahasiswa17 {
    
    Mahasiswa17[] stack;
    int top; //indeks top dari stack
    int size;
    int done;

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
            stack[top] = mhs; // Menambahkan mahasiswa ke stack;
            System.out.printf("Tugas %s telah berhasil dikumpulkan.\n", mhs.nama);
            done++;
        } else {
            System.out.println("Stack penuh, tidak bisa menambah tugas lagi.");
        }
    }
    
    // Catatan: Apabila diperlukan informasi mengenai data mahasiswa yang diambil, maka tipe
            //kembalian harus berupa object Mahasiswa. Sebaliknya, tipe kembalian void dapat digunakan jika
            //data mahasiswa yang dikeluarkan tidak akan diolah atau digunakan lagi
    
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

    public Mahasiswa17 peekBottom() {
        if (!isEmpty()) {
            return stack[0]; // Mengembalikan mahasiswa di posisi terbawah
        } else {
            System.out.println("Stack kosong, tidak ada tugas yang bisa dilihat.");
            return null;
        }
    }

    public int tugasTerkumpulkan() {
        return done; // Mengembalikan jumlah tugas yang sudah dikumpulkan
    }

    public int tugasBelumDinilai() {
        return top + 1; // Mengembalikan jumlah tugas yang belum dinilai
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


    public String konversiDesimalKeBiner(int nilai){
        StackKonversi17 stackKonversi = new StackKonversi17(); //inisialisasi objek stackKonversi menggunakan class StackKonversi17
        while (nilai != 0) { 
            int sisa = nilai % 2; //sisa bagi 2
            stackKonversi.push(sisa); //push ke stack
            nilai = nilai / 2; //nilai dibagi 2
        }
        String biner = new String(); //inisialisasi string biner menjadi objek baru
        while (!stackKonversi.isEmpty()) {
            biner += stackKonversi.pop(); //pop dari stack
        }
        return biner;
    }

}
