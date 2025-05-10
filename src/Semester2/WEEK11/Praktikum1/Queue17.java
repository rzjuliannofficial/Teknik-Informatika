package WEEK11.Praktikum1;
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
            while (i != rear) { //pokok jika i ga sama dengan rear akan looping
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
        }else{ //jika tidak full masuk
            if (isEmpty()) { //check apakah queue kosong, false lanjut else
                front = rear =0;
            }else { //masuk ke else jika data sdh tidak kosong, atau indeks 0 sdh terisi 
                if (rear == max -1) { //check apakah rear sudah diujung
                    rear = 0;
                } else { //jika vbelum rear++
                    rear++;
                }
            }
            data[rear]= dt;
            size++;
        }
    }
    
    public int Dequeue(){
        int dt = 0;
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        }else {
            dt = data[front]; //front ini dimulai dari 0, karena sdh di inisialisasi menjadi 0 di enqueue
            size--; //perlu di ingat bahwa size ini dimulai dari indeks maxnya, karena sdh di increamet di enqueue
                    //sizw hanya berfungsi untuk indikasi isfull dan isEmpty    
            if(isEmpty()){
                front = rear = -1;
            }else{
                if (front == max -1) {
                    front =0;
                }else{
                front++;
                }
            }
        }
        return dt;
    }
}
