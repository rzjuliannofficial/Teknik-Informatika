import java.util.Scanner;

public class quiz17 {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
    //DEKLARARSI VARIABEL

    int tarifDasar, biayaBensin, hargaJual, biayaProduksi,  jumlahTransaksiDriver , jumlahTransaksiMerchant, totalTransaksi ;
    double komisiPerusahaan, resikoKeterlambatan ,jarakPerjalanan, keuntunganDriver, keuntunganMercant , keuntunganTotal, rata2Keuntungan, persenKonDriver, persenKonMerchant;

    //INPUT USER
    System.out.println("-------------");
    System.out.println("BAGI DRIVER");
    System.out.println("-------------");

    System.out.print("tarif dasar adalah Rp ");
    tarifDasar = sc.nextInt();
    System.out.print("biaya bensin adalah Rp ");
    biayaBensin = sc.nextInt();
    System.out.print("Jarak perjalanan yang ditempuh sejauh ");
    jarakPerjalanan = sc.nextDouble();
    System.out.print("Komisi Perusahaan(persen): ");
    komisiPerusahaan = sc.nextDouble();
    System.out.print("Resiko keterlambatan(persen): ");
    resikoKeterlambatan = sc.nextDouble();
    System.out.print(" Jumlah transaksi : ");
    jumlahTransaksiDriver = sc.nextInt();

    System.out.println("-------------");
    System.out.println("BAGI MERCHANT");
    System.out.println("-------------");
    System.out.print("Harga jual makanan sebesar Rp ");
    hargaJual = sc.nextInt();
    System.out.print("Biyaya makanan/produksi sebesar Rp ");
    biayaProduksi = sc.nextInt();
    System.out.print("Jumlah Transaksi: ");
    jumlahTransaksiMerchant = sc.nextInt();
    
    //perhitungan

    //KEUNTUNGAN DRIVER
    keuntunganDriver = ((tarifDasar*jarakPerjalanan)-(biayaBensin*jarakPerjalanan))*(1-(komisiPerusahaan/100))*(1-(resikoKeterlambatan/100))*jumlahTransaksiDriver;
    System.out.println("Keuntungan Driver sebesar Rp " + keuntunganDriver);
    
    //KEUNTUNGAN MERCHANT
    keuntunganMercant = (hargaJual- biayaProduksi) * (1-komisiPerusahaan/100) * (1-resikoKeterlambatan/100) *jumlahTransaksiMerchant;
    System.out.println("Keuntungan Merchant sebesar Rp " + keuntunganMercant);
    
    //TOTAL KEUNTUNGAN
    keuntunganTotal = keuntunganDriver+keuntunganMercant;
    System.out.println("Keuntungan Total dari 2 mitra tersebut adalah Rp "+keuntunganTotal);
    
    //RATA RATA KEUNTUNGAN SEMUA TRASKASI
    totalTransaksi= jumlahTransaksiDriver+jumlahTransaksiMerchant; 
    rata2Keuntungan = keuntunganTotal/totalTransaksi;
    System.out.println("Rata rata keuntungan dari semua transaksi adalah Rp "+rata2Keuntungan);

    //PRESENTASE KONTRIBUSI MITRA
    persenKonDriver = keuntunganDriver/keuntunganTotal*100;
    System.out.println("Persentase kontribusi Driver adalah " + persenKonDriver+ "%");

    persenKonMerchant = keuntunganMercant/keuntunganTotal*100;
    System.out.println("Persentase kontribusi Merchant adalah " + persenKonMerchant+ "%");
    
    




sc.close();
    }
}
