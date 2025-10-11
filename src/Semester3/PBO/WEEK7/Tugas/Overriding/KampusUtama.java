package Semester3.PBO.WEEK7.Tugas.Overriding;

public class KampusUtama {
    public static void main(String[] args) {
        // Objek Dosen
        Manusia objek1 = new Dosen(); 
        // Objek Mahasiswa
        Manusia objek2 = new Mahasiswa();

        System.out.println("--- Dynamic Method Dispatch (Overriding) ---");

        
        System.out.println("Objek 1 (Dosen):");
        objek1.bernafas(); // Dari Manusia
        objek1.makan();    // Dari Dosen (Overriding)

        System.out.println("\nObjek 2 (Mahasiswa):");
        objek2.bernafas(); // Dari Manusia
        objek2.makan();    // Dari Mahasiswa (Overriding)

        // Catatan: Method spesifik seperti lembur() dan tidur() tidak bisa diakses
        // menggunakan referensi Manusia karena Dosen dan Mahasiswa di-cast sebagai Manusia.
        // Contoh: objek1.lembur(); // ERROR
    }
}