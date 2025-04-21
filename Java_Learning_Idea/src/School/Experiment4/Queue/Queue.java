package School.Experiment4.Queue;

public class Queue {
    private int[] element;
    private int size;
    public static final int DEFAULT_CAPACITY = 8;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        element = new int[capacity];
    }

    public void enqueue(int v){
        if(size >= element.length){
            int[] temp = new int[element.length*2];
            System.arraycopy(element,0,temp,0,element.length);
            element = temp;
        }
        element[size++] = v;
    }

    public int dequeue(){
        return element[--size];
    }

    public boolean empty(){
        return size == 0;
    }

    public int getSize(){
        return size;
    }
}
