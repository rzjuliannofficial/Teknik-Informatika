package Semester3.PBO.WEEK10.Tugas;

public class Barrier implements Destroyable {
    private int strength;
    
    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroy() {
        this.strength -= 10; // Asumsi: setiap destroy mengurangi 10.
    }
    
    @Override
    public void destroyed() {
        this.strength -= 10; // Menggunakan method destroy() pada Barrier.
    }
    
    public String getBarrierInfo() {
        return "Barrier Strength = " + strength + "\n";
    }
}
