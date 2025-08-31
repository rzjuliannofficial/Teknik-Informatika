package WEEK15;

import java.util.Stack;

public class StackDemo17 {
    public static void main(String[] args) {
        Book17 book1 = new Book17("1234", "Dasar Pemrograman");
        Book17 book2 = new Book17("7145", "Hafalah Shalat Delisa");
        Book17 book3 = new Book17("3562", "Muhammad Al-Fatih");

        Stack<Book17> books = new Stack<>();
        books. push(book1);
        books. push(book2);
        books. push(book3);

        Book17 temp = books.peek();
        if (temp != null) {
            System.out.println(temp.toString());
        }

        Book17 temp2 = books.pop();
        if (temp2 != null) {
            System.out.println(temp2.toString());
        }

        //mencari element(search) dalam stack
        int position = books.search(book2);
        if (position != -1) {
            System.out.println("Book ditemukan pada posisi: " + position);
        } else {
            System.out.println("Book tidak ditemukan dalam stack.");
        }

        //tampilkan semua elemnt dalam stack
        for (Book17 book : books) {
            System.out.println(book.toString());
        }
        
        System.out.println(books);
    }
}
