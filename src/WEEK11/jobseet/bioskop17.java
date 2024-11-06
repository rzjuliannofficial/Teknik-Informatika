package WEEK11.jobseet;
public class bioskop17 {
    public static void main(String[] args) {
    String penonton[][]= new String[4][2];

    penonton[0][0]="Amin";
    penonton[0][1]="Bena";
    penonton[1][0]="Candra";
    penonton[1][1]="Dela";
    penonton[2][0]="Eka";
    penonton[2][1]="Farhan";
    penonton[3][0]="Gisel";
    penonton[3][1]="Hana";
    
    // penonton[][] masing-masing menggantikan %s, dengan \t menambah tab di antara keduanya, dan \n membuat baris baru setelah itu.
    System.out.printf("%s \t  %s\n", penonton[0][0], penonton[0][1]);
    System.out.printf("%s \t  %s\n", penonton[1][0], penonton[1][1]);
    System.out.printf("%s \t  %s\n", penonton[2][0], penonton[2][1]);
    System.out.printf("%s \t  %s\n", penonton[3][0], penonton[3][1]);
    System.out.println();
    System.out.println(penonton.length);
    // kita sebenarnya sedang meminta jumlah elemen di dalam baris ke-i dari array penonton. 
    // Karena setiap baris berisi 4 elemen, maka nilai penonton[i].length akan selalu 4 untuk setiap baris dalam array
    System.out.println(penonton[0].length);
    System.out.println(penonton[1].length);
    System.out.println(penonton[2].length);
    System.out.println(penonton[3].length);
    System.out.println();
    //modifikasi for loop
    for (int i = 0; i < penonton.length; i++) {
        System.out.println("Panjang baris ke-"+(i+1)+": "+penonton[i].length);
    }
    System.out.println();

    //foreach loop
    for (String[] barisPenonton : penonton) {
        System.out.println("Panjang baris: "+barisPenonton.length);
    }
    System.out.println("Penonton pada baris ke-3: ");
    for (int i = 0; i < penonton[2].length; i++) { //jadi biasanya kalau spesifik ada nomer index itu, masuk dalam baris tsb
        //jadi  kita harus mengetahui panjang baris ke3/ index ke 2 pada array
        //pembacaan: jika i < penonton index 2 (0 & 1) maka print baris 3 kolom i < length 
        System.out.println(penonton[2][i]);
    }
    //modifikasi perulangan di atas menjadi foreach loop
    System.out.println();
    System.out.println("modifikasi perulangan di atas menjadi foreach loop");
    System.out.println("Penonton pada baris ke-3: ");
    for (String i : penonton[2]) {
        System.out.println(i);
    }
    System.out.println();
    //modifikasi line29 unutk menampilkam nama penonton untuk setiap baris
    System.out.println("modifikasi line29 unutk menampilkam nama penonton untuk setiap baris");
    for (int i = 0; i < penonton.length; i++) {
        System.out.println("Penonton pada baris ke-"+(i+1)+": "+String.join(", ",penonton[i]));
    }
    }   
}
