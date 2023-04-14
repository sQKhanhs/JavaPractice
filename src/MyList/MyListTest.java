package MyList;
import java.util.ArrayList;

public class MyListTest {
    public static void main(String[] args){
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);
        listInteger.add(3);

        System.out.println(listInteger.get(2));
        System.out.println(listInteger.clone());
    }
}
