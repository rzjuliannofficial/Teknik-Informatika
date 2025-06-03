package WEEK13;

import java.util.Scanner;

public class DoubleLinkedList17 {
    Node17 head;
    Node17 tail;
    int size;

    public DoubleLinkedList17(){
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa17 input){
        Node17 newNode17 = new Node17(input);
        if (isEmpty()) {
            head=tail=newNode17;
        } else {
            newNode17.next = head;
            head.prev = newNode17;
            head = newNode17;
        }
        size++;
    }

    public void addLast(Mahasiswa17 input){
        Node17 newNode17 = new Node17(input);
        if (isEmpty()) {
            head = tail = newNode17; 
        }else {
            tail.next = newNode17;
            newNode17.prev = tail;
            tail = newNode17;
        }
        size++;
    }

    public void insertAfter(String key, Mahasiswa17 input){
        Node17 current = head;
        // current sama kyk temp di single linked list
        //cari node by nim = key
        while (current != null && !current.data.nim.equalsIgnoreCase(key)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + key + " tidak ditemukan.");
            return;
        }

        Node17 newNode17 = new Node17(input);
        //jika current adalah tail, cukup tambahkan di belakang / sama kyk addlast
        if (current == tail) {
            current.next = newNode17;
            newNode17.prev = current;
            tail = newNode17;
        }else {
            //jika current bukan tail, tambahkan di tengah
            newNode17.next = current.next;
            newNode17.prev = current;
            current.next.prev = newNode17;
            current.next = newNode17;
        }
        System.out.println("Node berhasil ditambahkan setelah NIM " + key + ".");
        size++;
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Linked list kosong");
            return;
        }
        Node17 current = head;
        System.out.println("================================================================+");
        System.out.println("Antrian mahasiswa:");
        System.out.println("================================================================+");
        System.out.printf("|%-15s|%-15s|%-15s|%-15s|%n","Nim","Nama","Prodi","Ipk");
        System.out.println("================================================================+");
        while (current != null) {
            current.data.tampilkanData();
            current = current.next;
        }
        System.out.println("================================================================+");
    }

    public Mahasiswa17 inputData(Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Prodi: ");
        String prodi = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        Double ipk = sc.nextDouble();
        return new Mahasiswa17(nim, nama, prodi, ipk);
        //akan mengembalikan objek Mahasiswa17 yang baru dibuat
    }

    public void removeFirst(){
        if (isEmpty()){
            System.out.println("Linked list kosong, tidak ada yang bisa dihapus.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        System.out.println("Node pertama berhasil dihapus.");
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list kosong, tidak ada yang bisa dihapus.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        System.out.println("Node terakhir berhasil dihapus.");
    }

    public void addAt (int indeks , Mahasiswa17 input){
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak bisa menambahkan data pada indeks " + indeks);
        }else {
            if (indeks == 0) {
                addFirst(input);
            }else if (indeks < 0) {
                System.out.println("Indeks tidak valid, harus >= 0");
            } else {
                Node17 current = head;
                for (int i = 0; i < indeks - 1 && current != null; i++) {
                    current = current.next;
                }

                if (current == null) {
                    System.out.println("Indeks melebihi jumlah node yang ada, tidak bisa menambahkan data pada indeks " + indeks);
                    return;
                }
                System.out.println("Node berhasil ditambahkan pada indeks " + indeks + ".");
                size++;
            }
        }
    }

    public void removeAfter(String key) {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak bisa menghapus data setelah NIM " + key);
            return;
        }

        Node17 current = head;
        while (current != null && !current.data.nim.equalsIgnoreCase(key)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Node dengan NIM " + key + " tidak ditemukan.");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah NIM " + key + ".");
            return;
        }

        Node17 removeAfter = current.next;
        current.next = removeAfter.next;

        //UPDATe pointer 
        if (removeAfter.next != null) {
            removeAfter.next.prev = current;
        } else {
            tail = current; // Jika yang dihapus adalah tail, update tail
            tail.next = null;
        }
        System.out.println("Node dengan NIM " + removeAfter.data.nim + " berhasil dihapus.");
        size--;
    }

    public void removeAt(int indeks) {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak bisa menghapus data pada indeks " + indeks);
            return;
        }

        if (indeks < 0) {
            System.out.println("Indeks tidak valid, harus >= 0");
            return;
        }

        if (indeks == 0) {
            removeFirst();
            return;
        }

        Node17 current = head;
        for (int i = 0; i < indeks && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Indeks melebihi jumlah node yang ada, tidak bisa menghapus data pada indeks " + indeks);
            return;
        }

        // Jika yang dihapus adalah tail
        if (current == tail) {
            removeLast();
            size--;
            System.out.println("Node indeks " + indeks + " , berhasil dihapus.");
            return;
        }

        // Update pointer untuk menghapus node
        current.prev.next = current.next;
        current.next.prev = current.prev;
        System.out.println("Node pada indeks " + indeks + " berhasil dihapus.");
        size--;
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada data yang bisa ditampilkan.");
        } else {
            System.out.println("Data mahasiswa pertama:");
            head.data.tampilkanData();
        }
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada data yang bisa ditampilkan.");
        } else {
            System.out.println("Data mahasiswa terakhir:");
            tail.data.tampilkanData();
        }
    }

    public void getAt(int indeks){
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada data yang bisa ditampilkan.");
            return;
        }

        if (indeks < 0) {
            System.out.println("Indeks tidak valid, harus >= 0");
            return;
        }

        //mencari node pada indeks tertentu
        Node17 current = head;
        for (int i = 0; i < indeks && current != null; i++) {
            current = current.next;
        }
        //check kondisi
        if (current == null) {
            System.out.println("Indeks melebihi jumlah node yang ada, tidak bisa menampilkan data pada indeks " + indeks);
        } else {
            System.out.println("Data mahasiswa pada indeks " + indeks + ":");
            current.data.tampilkanData();
            
        }
    }

    public void getSize(){
        if (isEmpty()) {
            System.out.println("Linked list kosong, tidak ada data yang bisa ditampilkan.");
            return;
        }else {
            System.out.println("Jumlah data mahasiswa dalam linked list: " + size);
        }
    }
}
