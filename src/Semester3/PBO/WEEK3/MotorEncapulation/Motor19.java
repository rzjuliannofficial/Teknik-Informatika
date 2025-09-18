package Semester3.PBO.WEEK3.MotorEncapulation;

public class Motor19 {
    private int kecepetan = 0; 
    private boolean kontakOn = false;

    public void nyalakanMesin(){
        kontakOn = true;
    }

    public void matikanMesin(){
        kontakOn = false;
        kecepetan = 0;
    }

    public void tambahKeceptan(){
        if (kontakOn == true) {
            kecepetan += 5;
        }else{
            System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
        }
    }

    public void kurangiKeceptan(){
        if (kontakOn == true) {
            kecepetan -= 5;
        }else{
            System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
        }
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
