package Semester3.PBO.WEEK4.RelasiClass.Tugas;

public class Layar19 {
    
    String merk;
    String resolusi;

    public Layar19(String merk , String resolusi){
        this.merk = merk;
        this.resolusi = resolusi;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setResolusi(String resolusi) {
        this.resolusi = resolusi;
    }
    public String getResolusi() {
        return resolusi;
    }

    public String infoLayar(){
        String info = "";
        info += "Merk : "+ merk + "\n";
        info += "resolusi : "+ resolusi +"\n";
        return info;
    }

}
