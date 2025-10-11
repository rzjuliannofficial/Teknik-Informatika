package Semester3.PBO.WEEK7.Tugas.Overriding;

class Manusia {
    // Method bernafas() tidak di-override
    public void bernafas() {
        System.out.println("Manusia sedang bernafas...");
    }

    // Method yang akan di-override
    public void makan() {
        System.out.println("Manusia sedang makan nasi.");
    }
}
