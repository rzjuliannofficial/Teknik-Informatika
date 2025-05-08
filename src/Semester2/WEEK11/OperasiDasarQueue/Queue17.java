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

    public void clear(){
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            front = rear = -1;
            size=0;
            System.out.println("Queue berhasi dikosongkan");
        }
    }
    

    public void Enqueue(int dt){
        if (isFull()) {
            System.out.println("Queue sudah penuh");
        }else{
            if (isEmpty()) {
                front = rear =0;
            }else {
                if (rear == max -1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear]= dt;
            size++;
        }
    }
}
