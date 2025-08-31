public class alasKaki {
    String tipe, warna, asal, warnaNext;
    boolean answer;

    public void setTipe(String newValue){
        tipe = newValue;
    }
    public void setWarna(String newValue){
        warna = newValue;
    }

    public void SNI(boolean newValue){
        answer = newValue;
    }
    public void madeIn (String newValue){
        asal = newValue;
    }
    public void gantiWarna(String newValue){
        warnaNext = newValue;
    }
    
    
    public void cetak(){
        System.out.println("Tipe alas kaki yang dipakai: "+ tipe);
        System.out.println("Warna: " +warna);
        System.out.println("Berstandart SNI: " + answer);
        System.out.println("Made In: "+ asal);
        System.out.println("Ganti warna: "+warnaNext);
    }
}
