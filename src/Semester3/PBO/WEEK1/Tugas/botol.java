public class botol {
    String tipe;
    int kapasitas ,berat = 0;
    boolean sni;

    public void setTipe(String newValue){
        tipe = newValue;
    }
    public void setKapasitas(int newValue){
        kapasitas = newValue;
    }

    public void isi(int newValue){
        berat += newValue;
    }
    public void keluarkan(int newValue){
        berat -= newValue;
    }
    public void SNI(boolean newValue){
        sni = newValue;
    }

    public void cetak(){
        System.out.println("Tipe botol: "+ tipe);
        System.out.println("Kapasitas botol: "+kapasitas+" ml");
        System.out.println("isi dalam botol sekarang: "+berat+" ml");
        System.out.println("Standart SNI: "+sni);
    }





}
