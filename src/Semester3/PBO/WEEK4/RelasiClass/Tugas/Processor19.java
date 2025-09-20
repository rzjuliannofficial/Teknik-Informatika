package Semester3.PBO.WEEK4.RelasiClass.Tugas;

public class Processor19 {
    private String merk;
    private int core;

    public Processor19(String merk , int core){
        this.merk = merk;
        this.core = core;
    }

    public void setCore(int core) {
        this.core = core;
    }
    public int getCore() {
        return core;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }

    public String infoProcessor(){
        String info = "";
        info += "Merk : "+this.merk+"\n";
        info += "Core : "+this.core+"\n";
        return info;
    }
    
}
