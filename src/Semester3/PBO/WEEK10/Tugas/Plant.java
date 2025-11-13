package Semester3.PBO.WEEK10.Tugas;
public class Plant {
    public void doDestroy(Destroyable d) {
        d.destroyed();
        
        // Asumsi tambahan: Zombie heal setelah destroyed, berdasarkan contoh output.
        if (d instanceof Zombie) {
            ((Zombie) d).heal();
        }
    }
}