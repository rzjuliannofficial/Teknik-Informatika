package Semester3.PBO.WEEK10.Tugas;

public class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public void heal() {
        // Akan dioverride di subclass
    }
    
    @Override
    public void destroyed() {
        // Akan dioverride di subclass
    }
    
    public String getZombieInfo() {
        return "Zombie Data =\n" +
               " Health = " + health + "\n" +
               " Level = " + level + "\n";
    }
}
