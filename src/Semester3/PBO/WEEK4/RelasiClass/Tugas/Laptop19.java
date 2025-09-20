package Semester3.PBO.WEEK4.RelasiClass.Tugas;

public class Laptop19 {
    private String merk;
    private Processor19 proc;
    private Layar19 layar;
    private Battery19 battery;

    public Laptop19(String merk , Processor19 proc , Layar19 layar , Battery19 battery){
        this.merk = merk;
        this.proc = proc;
        this.layar = layar;
        this.battery = battery;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public void setProc(Processor19 proc) {
        this.proc = proc;
    }
    public void setBattery(Battery19 battery) {
        this.battery = battery;
    }
    public void setLayar(Layar19 layar) {
        this.layar = layar;
    }

    public String info(){
        String info = "";
        info += "--Merk-- \n" + this.merk + "\n";
        info += "\n--Processor-- \n" + this.proc.infoProcessor();
        info += "\n--Layar-- \n" + this.layar.infoLayar();
        info += "\n--Battery-- \n" + this.battery.infoBattery();
        return info;
    }
}
