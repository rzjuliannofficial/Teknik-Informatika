package WEEK5.BruteForceDivideConquer;
public class faktorial17 {

    int n ;
    int faktorialBF(int n){
        int fakto = 1;
        
        // for (int i = 1; i <= n ; i++) {
        //     fakto *= i; //fakto = fakto * i 
        // }
        // return fakto;

        int i = 1;
        while (true) {
            fakto = fakto* i;
            System.out.println(i);
            if (i == n) {  
                break;
            }
            i++;
        }
        return fakto;
    }
    
    
    int faktorialDC(int n){
        if (n==1) {
            return 1;
        }else{
            int fakto = n * faktorialDC(n-1);
            return fakto;
        } 
    }
}