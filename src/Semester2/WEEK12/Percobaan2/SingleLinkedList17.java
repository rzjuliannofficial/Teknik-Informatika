package WEEK12.Percobaan2;

public class SingleLinkedList17 {
    Node17 head;
    Node17 tail;

    boolean isEmpty() {
        return (head == null);
    }

    public void print(){
        if (!isEmpty()) {
            Node17 temp = head;
            System.out.println("Isi Linked List:\t");
            while (temp != null) {
                temp.data.tampilkanInformasi();
                temp = temp.next;
            }
            System.out.println();
        }else {
            System.out.println("Linked list kosong");
        }
    }

    public void addFirst(Mahasiswa17 input){
        Node17 nodeInput = new Node17(input, null);
        if (isEmpty()) {
            head = nodeInput;
            tail = nodeInput;
        } else {
            nodeInput.next = head;
            head = nodeInput;
        }
    }

    public void addLast(Mahasiswa17 input){
        Node17 nodeInput = new Node17(input, null);
        if (isEmpty()) {
            head = nodeInput;
            tail = nodeInput;
        }else {
            tail.next = nodeInput;
            tail = nodeInput;
        }
    }

    //akan eror jika tidak ada data didalam SLL
    public void insertAfter(String key , Mahasiswa17 input){
        Node17 nodeInput = new Node17(input, null);
        Node17 temp = head;
        
        //tambahan inisiatif
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak bisa insert after");
            return;
        }

        do {
            if(temp.data.nama.equalsIgnoreCase(key)){
                nodeInput.next = temp.next;
                temp.next = nodeInput;
                if (nodeInput.next == null) {
                    tail = nodeInput;
                }
                break;
            }
            temp = temp.next;
        }while (temp != null);
        
        //tambhana jika key tidak ada didalam data
        if (temp == null) {
            System.out.println("tidak ada nama data : "+key); 
        }
    }

    public void insertAt(int indeks, Mahasiswa17 input){
        //tambahan inisiatif
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak bisa insert at index");
            return;
        }
        
        if (indeks < 0) {
            System.out.println("Indeks salah");
        } else if (indeks == 0) {
            addFirst(input);
        } else {
            Node17 temp = head;
            for (int i = 0; i < indeks; i++) {
                temp = temp.next;
            }
            temp.next = new Node17(input, temp.next);
            if (temp.next.next == null) {
                tail=temp.next;
            }
        }
    }

    public void getData(int indeks){
        Node17 temp = head;
        for (int i = 0; i < indeks; i++) {
            temp = temp.next;
        }
        temp.data.tampilkanInformasi();
    }

    public int indexOf(String key){
        Node17 temp = head;
        int indeks = 0;
        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
            temp = temp.next;
            indeks++;
        }

        if (temp == null) {
            return -1; // jika tidak ditemukan
        } else {
            return indeks; // mengembalikan indeks dari data yang ditemukan
            
        }
    }

    public void removeFirst(){
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak bisa remove first");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast(){
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak bisa remove last");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node17 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    // public void remove(String key){
    //     if (isEmpty()) {
    //         System.out.println("Linked list kosong, tidak bisa remove");
    //     }else {
    //         Node17 temp = head;
    //         while (temp != null) {
    //             if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
    //                 this.removeFirst();
    //                 break;
    //             } else if (temp.data.nama.equalsIgnoreCase(key)) {
    //                 temp.next = temp.next.next;
    //                 if (temp.next == null) {
    //                     tail = temp;
    //                 }
    //                 break;
    //             }
    //             temp = temp.next;
    //         }
    //     }
    // }

    public void removeAt(int indeks){
        if (indeks == 0) {
            removeFirst();
        }else {
            Node17 temp = head;
            for (int i = 0 ; i < indeks -1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
    }
}
