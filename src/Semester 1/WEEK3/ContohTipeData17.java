package WEEK3;
public class ContohTipeData17 {
    public static void main(String[] args) {
        char golonganDarah = 'O';
        byte jarak = (byte) 130;
        short jumlahPendudukDalamSatuDusun =  1025;
        float suhu = 60.50F; //adanya F untuk mengenali angka 60.50 adalah float
        double berat = 0.5467812345;
        long saldo = 150000000;
        int angkaDesimal = 0x10;

        System.out.println("Golongan darah                  : "+(byte) golonganDarah); //OUTPUT AKAN MEMUNCULKAN NILAI, KARENA STRING TO BYTE
        System.out.println("Jarak                           : "+jarak);
        System.out.println("Jumlah penduduk dalam satu dusun: " + jumlahPendudukDalamSatuDusun);
        System.out.println("Suhu                            : "+ suhu);
        System.out.println("Berat                           : "+(float) berat);
        System.out.println("Saldo                           : "+saldo);
        System.out.println("Angka desimal                   : "+ angkaDesimal);
       
    }
}
