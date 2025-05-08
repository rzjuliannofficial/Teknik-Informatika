package WEEK11.OperasiDasarQueue;

public class Queue17 {
    int[] data;
    int front;
    int rear;
    int size;
    int max;

    public Queue17(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }

    
}
