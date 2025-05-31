package WEEK12.Tugas_AntrianQUEUE_LinkedList;

public class SingleLinkedList_QUEUE {
    Node17 head;
    Node17 tail;
    int max;
    int size;

    public SingleLinkedList_QUEUE(int max) {
        this.max = max;
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    boolean isFull() {
        return size == max;
    }

    public void clear_linkedList_removeAll() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada yang bisa dihapus.");
            return;
        }

        head = null;
        tail = null;
        size = 0;
        System.out.println("Semua data antrian berhasil dihapus.");
    }

    public void enqueue_linkedList_AddLast(Mahasiswa17 input){
        if (size >= max) {
            System.out.println("Antrian penuh, tidak bisa menambahkan data baru.");
            return;
        }
        
        Node17 nodeInput = new Node17(input, null);
        if (isEmpty()) {
            head = nodeInput;
            tail = nodeInput;
        } else {
            tail.next = nodeInput;
            tail = nodeInput;
        }
        size++;
    }

    public void dequeue_linkedList_removeFirst(){
        if (isEmpty()) {
            System.out.println("Antrian kosong, tidak ada mahasiswa yang bisa dilayani.");
            return ;
        }

        System.out.println("Mahasiswa terdepan telah dilayani dan dihapus dari antrian.");
        System.out.println("===================================================================+");
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", "nim", "nama", "prodi", "kelas");
        System.out.println("===================================================================+");
        head.data.tampilkanData();
        System.out.println("===================================================================+");
        size--;
        
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
    }

    public void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("===================================================================+");
            System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n", "nim", "nama", "prodi", "kelas");
            System.out.println("===================================================================+");
            Node17 temp = head;
            int no = 1;
            while (temp != null) {
                System.out.print(no + ". ");
                temp.data.tampilkanData();
                temp = temp.next;
                no++;
            }
            System.out.println("===================================================================+");
        }
    }
    public void tampilkanAntrian_Head(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("===================================================================+");
            System.out.println("Antrian mahasiswa terdepan :");
            System.out.println("===================================================================+");
            System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n","nim","nama","prodi","kelas");
            System.out.println("===================================================================+");
            head.data.tampilkanData();
            System.out.println("===================================================================+");
        }
    }
    
    public void tampilkanAntrian_Tail(){
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("===================================================================+");
            System.out.println("Antrian mahasiswa terakhir :");
            System.out.println("===================================================================+");
            System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n","nim","nama","prodi","kelas");
            System.out.println("===================================================================+");
            tail.data.tampilkanData();
            System.out.println("===================================================================+");
        }
    }

    public void getJumlahAntrian() {
        System.out.println("Jumlah antrian saat ini: " + size);
    }
}