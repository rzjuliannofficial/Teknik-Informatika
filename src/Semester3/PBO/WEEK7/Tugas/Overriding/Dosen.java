package Semester3.PBO.WEEK7.Tugas.Overriding;

class Dosen extends Manusia {
    // Overriding method makan()
    @Override
    public void makan() {
        System.out.println("Dosen sedang makan siang di kantin fakultas.");
    }
    
    // Method spesifik Dosen
    public void lembur() {
        System.out.println("Dosen sedang lembur memeriksa tugas.");
    }
}
