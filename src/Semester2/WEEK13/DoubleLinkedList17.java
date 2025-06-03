package WEEK13;

import java.util.Scanner;

public class DoubleLinkedList17 {
    Node17 head;
    Node17 tail;

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
    }
}
