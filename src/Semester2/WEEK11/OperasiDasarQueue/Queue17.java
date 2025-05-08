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

    boolean isFull(){
        if (size == max) {
            return true;
        }else {
            return false;
        }
    }

    public void peek(){
        if (!isEmpty()) {
            System.out.println("Eelemnt terdepan: "+data[front]);
        }else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else{
            int i = front;
            while (i != rear) {
                System.out.print(data[i] + " ");
                i = (i+1) % max;
            }
        System.out.println(data[i] + " ");
        System.out.println("Jumlah element = "+size);
        }
    }
}
