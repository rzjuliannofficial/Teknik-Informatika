package WEEK3.Latihan;

public class DataGuru {

    // public DataGuru (){

    // }
    
    public void dataSemuaGuru (Guru[]arrGuru){
        System.out.println("----DATA SEMUA GURU----");
        for (int i = 0; i < arrGuru.length; i++) {
            arrGuru[i].tampilkanInfo();
            }

        
    }
}
