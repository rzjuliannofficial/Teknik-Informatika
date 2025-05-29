package WEEK12;

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
}
