package Queue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;
    public MyLinkedListQueue(){
        head = null;
        tail = null;
    }
    public void enqueue(int key){
        Node temp = new Node(key);
        if(this.tail == null){
            this.tail = this.head = temp;
        }
        this.tail.next = temp;
        this.tail = temp;
    }
    public Node dequeue(){
        if(this.head == null){
            return null;
        }
        Node temp = this.head;
        this.head = this.head.next;
        if(this.head == null){
            this.tail = null;
        }
        return temp;
    }
}
