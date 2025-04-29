package WEEK5.Latihan;

public class daftarNilaiMhs {
  int[] nim = {220101001,220101002,220101003,220101004,220101005,220101006,220101007,220101008 } ;   
  String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
  int[] nilaiUts = {78, 85, 90, 76, 92, 88, 80, 82};
  int[] nilaiUas = {82, 88, 87, 79, 95, 85, 83, 84};

  //DEVIDE AND CONQUER
  public int nilaiTertinggi(int left, int right){
    if(left == right){ //basecase: jika hanya satu elemen , languns return
      return nilaiUts[left];
    }
    
    int mid =(left+right)/2;
    int maxLeft = nilaiTertinggi(left, mid);
    int maxRight = nilaiTertinggi(mid+1, right);
    
    // System.out.println("Perbandingan nilai Tertinggi");
    // System.out.println(maxLeft +" dan "+maxRight);
    
    //kita menggunakna math.max untuk mencari nilai terbesar
    //math.max ini adalah kelas bawaan java untuk memudahkan
    return Math.max(maxLeft, maxRight); 
  }
  
  
  //DEVIDE AND CONQUER
  public int nilaiTerendah(int left, int right){
    if (left==right) { //basecase
      return nilaiUts[left];
    }
    
    int mid = (left+right)/2; //pembagian array
    int minLeft = nilaiTerendah(left, mid); // rekursif sisi kiri
    int minRight= nilaiTerendah(mid+1 , right); // rekursif sisi kanan
    
    // System.out.println("Perbandingan nilai Terendah");
    // System.out.println(minLeft +" dan "+minRight);
    

    return Math.min(minLeft, minRight);
  }

  //BRUTEFORCE
  public int rata2Uas(){
    int rata2nilaiUas=0;
    int total=0;
    for (int i = 0; i < nilaiUas.length; i++) {
      total += nilaiUas[i];
    }
    rata2nilaiUas = total / nilaiUas.length;
    return rata2nilaiUas;
  }
}
