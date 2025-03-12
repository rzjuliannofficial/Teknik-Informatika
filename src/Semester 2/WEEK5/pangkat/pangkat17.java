package WEEK5.pangkat;

public class pangkat17 {
    int nilai , pangkat;

    pangkat17(int n, int p){ //konstruktor
        //note: jika Nama parameter sama dengan atribut, kita harus memakai this agar tidak eror
        // jika tidak ingin menggunakan this, nama parameter dan atribut harus berbeda. misal nama = n
        nilai = n;
        pangkat = p;
    }   

    int pangkatBF(){
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    int pangkatDC(int a , int n){
        if (n==1) {
            return a;
        }else{
            if (n%2==1) {
               return (pangkatDC(a, n/2)*pangkatDC(a, n/2)*a); //cara membacanya misal a = 2, n=5 maka => (2^(5/2)) * (2^(5/2)) * 2
                                                                //pangkatDC(2, 5) = 4 * 4 * 2 = 32. 
                                                                //kenapa 5/2 = 2? karena int. 
                                                                //dan di rekursif untuk ganjil dikali lagi dengan a, karena 5/2 sisa 1
            }else{
                return (pangkatDC(a, n/2)*pangkatDC(a, n/2)); 
            }
        }
    }
}
