package Queue;

public class Node<Type> {
    public Type key;
    public Node next;
    public Node(Type key){
        this.key = key;
        this.next = null;
    }
}
