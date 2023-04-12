package Shape;

import java.util.Arrays;

public class TestComparableCircle {
    public static void main(String[] args){
        ComparableCircle[] circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3);
        circles[1] = new ComparableCircle(4, "red", true);
        circles[2] = new ComparableCircle(0.5);
        Arrays.sort(circles);
        for(ComparableCircle circle: circles){
            System.out.println(circle);
        }
        System.out.println(new ComparableCircle(3).compareTo(new ComparableCircle(4)));
    }
}
