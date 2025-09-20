package Semester3.PBO.WEEK4.RelasiClass.Tugas;

public class Battery19 {
    String merk;
    int capacity;

    public Battery19(String merk , int capacity){
        this.merk = merk;
        this.capacity = capacity;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCapacity() {
        return capacity;
    }

    public String infoBattery(){
        String info = "";
        info += "Merk : "+ merk + "\n";
        info += "Capacity : "+ capacity +"Wh\n";
        return info;
    }
}
