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

    double totalDC(double[] arr, int l , int r){
        if (l==r) {
            return arr[l];
        }

        int mid = (l+r)/2;
        double lsum = totalDC(arr, l, mid);
        double rsum = totalDC(arr, mid+1, r);
        return lsum + rsum;
    }
}