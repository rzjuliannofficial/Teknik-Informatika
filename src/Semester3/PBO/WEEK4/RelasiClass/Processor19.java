package Semester3.PBO.WEEK4.RelasiClass;

public class Processor19 {
    private String merk;
    private double cache;

    Processor19(String merk , double cache){
        this.merk = merk;
        this.cache = cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public double getCache() {
        return cache;
    }

    public String getMerk() {
        return merk;
    }

    public void info(){
        System.out.printf("Merk Processor = %s\n", merk);
        System.out.printf("Cache Memory = %.2f\n", cache);
    }
}
