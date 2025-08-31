package Semester3.PBO.WEEK1;

public class sepeda {

    private String merek;
    private int kecepatan;
    private int gear;

    public void setMerek(String newValue){
        merek = newValue;
    }

    public void gantiGear(int newValue){
        gear = newValue;
    }

    public void tambahKecepatan(int increament){
        kecepatan += increament;
    }

    public void rem(int decreament){
        kecepatan -= decreament;
    }

    public void cetakStatus(){
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
    }
}