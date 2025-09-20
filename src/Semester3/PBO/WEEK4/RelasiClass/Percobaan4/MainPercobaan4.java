package Semester3.PBO.WEEK4.RelasiClass.Percobaan4;

public class MainPercobaan4 {
    public static void main(String[] args) {
        Penumpang19 p = new Penumpang19("12345", "Mr. Krab");
        Gerbong19 gerbong = new Gerbong19("A", 10);
        gerbong.setPenumpang(p, 1);
        System.out.println(gerbong.info());
        
        Penumpang19 budi = new Penumpang19(null, "Budi");
        gerbong.setPenumpang(budi, 1);
        System.out.println(gerbong.info());
    }    
}
