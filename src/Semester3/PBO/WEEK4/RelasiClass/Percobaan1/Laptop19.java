package Semester3.PBO.WEEK4.RelasiClass.Percobaan1;

public class Laptop19 {
    private String merk;
    private Processor19 proc;

    Laptop19(String merk, Processor19 proc){
        this.merk = merk;
        this.proc = proc;
    }

    public void info(){
        System.out.println("Merk Laptop = " + merk);
        proc.info();
    }
}
