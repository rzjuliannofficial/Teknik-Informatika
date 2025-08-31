public class alasKaki_Demo {
    public static void main(String[] args) {
        alasKaki alasKaki1 = new alasKaki();
        alasKaki alasKaki2 = new alasKaki();
        sepatuLari alasKaki3 = new sepatuLari();

        alasKaki1.setTipe("sandal");
        alasKaki1.setWarna("hitam");
        alasKaki1.SNI(true);
        alasKaki1.madeIn("China");
        alasKaki1.gantiWarna("-");
        alasKaki1.cetak();
        System.out.println();

        alasKaki2.setTipe("sepatu");
        alasKaki2.setWarna("hitam-putih");
        alasKaki2.SNI(true);
        alasKaki2.madeIn("Indonesia");
        alasKaki2.gantiWarna("-");
        alasKaki2.cetak();
        System.out.println();

        alasKaki3.setTipe("sepatu");
        alasKaki3.setWarna("putih");
        alasKaki3.SNI(true);
        alasKaki3.madeIn("US");
        alasKaki3.gantiWarna("-");
        alasKaki3.tipeSol("Carbon");
        alasKaki3.cetak();
    }
}
