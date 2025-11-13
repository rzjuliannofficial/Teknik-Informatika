package Semester3.PBO.WEEK10.Tugas;

public class WalkingZombie extends Zombie {
    
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        double healAmount = 0;
        if (this.level == 1) {
            healAmount = 0.2 * this.health; // 20%
        } else if (this.level == 2) {
            healAmount = 0.3 * this.health; // 30%
        } else if (this.level == 3) {
            healAmount = 0.4 * this.health; // 40%
        }
        this.health += (int) healAmount;
    }

    @Override
    public void destroyed() {
        this.health -= 0.02 * this.health; // berkurang 2%
    }
    
    @Override
    public String getZombieInfo() {
        return "Walking " + super.getZombieInfo();
    }
}
