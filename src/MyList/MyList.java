package MyList;

public class MyList<E> extends java.util.ArrayList {
    private int size = 0;
    private int DEFAULT_CAPACITY = 10;
    private Object[] data;

    MyList() {
        data = new Object[DEFAULT_CAPACITY];
    }

    MyList(int capacity) {
        data = new Object[capacity];
    }


    

    public void clear() {
        data = (E[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }


}
