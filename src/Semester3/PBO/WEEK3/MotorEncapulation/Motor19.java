package Semester3.PBO.WEEK3.MotorEncapulation;

public class Motor19 {
    public int kecepetan = 0; 
    public boolean kontakOn = false;

    public void printStatus(){
        if (kontakOn == true) {
            System.out.println("Kontak On");
        }else{
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan "+ kecepetan +"\n");
    }
}
