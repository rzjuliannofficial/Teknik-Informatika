package WEEK2;
public class hapemain {
    public static void main(String[] args) {
        // hape phone = new hape(null, null, 0);
        // phone.merk = "samsul";
        // phone.tipe = "rongsok";
        // phone.ukuranLayar = 100f;
        hape phone = new hape("ssuusu", "nuayamll", 12);
        phone.cekKondisi(false);
        phone.tampilInformasi();
        phone.mengirimPesan(null, null, "null");

    }
}
