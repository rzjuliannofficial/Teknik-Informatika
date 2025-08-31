public class sepatuLari extends alasKaki{
    String tipeSol;
    
    public void tipeSol(String newValue){
        tipeSol = newValue;
    }

    public void cetak(){
        super.cetak();
        System.out.println("Tipe Sol: " +tipeSol);
    }
}
