package WEEK5.Sum;

public class sum17 {
    
    double[] keuntungan ;
    public sum17(int element){ //ingat menggunakan public agar bisa di akses beda folder
                           //ga pake gpp
        keuntungan = new double[element];
    }
       
    double totalBF(){
        double total = 0;
           for (int i = 0; i < keuntungan.length; i++) {
               total += keuntungan[i]   ;
           }
        return total;
    }

    double totalDC(double[] indekKeuntungan, int left , int right){
        if (left==right) { // Base case: Jika hanya ada satu elemen, langsung kembalikan nilainya
            return indekKeuntungan[left];
        }


        int mid = (left+right)/2; //menentukan indeks titik tengah
        //jika misal indeks kiri 0 dan indeks kanan 4, mid akan 2
        double lsum = totalDC(indekKeuntungan, left, mid); //menghitung total dari subarray kiri
        //dapatlah diibaratkan sebagai menghitung total dari array indekKeuntungan[0 sampai 2]

        double rsum = totalDC(indekKeuntungan, mid+1, right); //menghitung total dari subarray kanan
        //dapatlah diibaratkan sebagai menghitung total dari array indekKeuntungan[3 sampai 4]
        return lsum + rsum;

        //jadi lsum akan menghitung total dari indekKeuntungan[0 sampai 2]
        //dan rsum akan menghitung total dari indekKeuntungan[3 sampai 4]
    }
}