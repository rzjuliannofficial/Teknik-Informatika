package Semester3.PBO.WEEK3.MotorEncapulation;

public class Motor19 {
    private int kecepetan = 0; 
    private boolean kontakOn = false;


    public void matikanMesin(){
        kontakOn = false;
    }
    
    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+ kecepetan +"\n");
    }
}
