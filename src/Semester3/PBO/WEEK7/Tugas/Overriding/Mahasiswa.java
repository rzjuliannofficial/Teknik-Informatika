package Semester3.PBO.WEEK7.Tugas.Overriding;

class Mahasiswa extends Manusia {
    // Overriding method makan()
    @Override
    public void makan() {
        System.out.println("Mahasiswa sedang makan mie instan di kos-kosan.");
    }
    
    // Method spesifik Mahasiswa
    public void tidur() {
        System.out.println("Mahasiswa sedang tidur setelah begadang.");
    }
}