package Rectangle;

import java.util.Scanner;


    class TestRectangle{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Enter width");
            int width = input.nextInt();
            System.out.println("Enter height");
            int height = input.nextInt();
            Rectangle rectangle = new Rectangle(width,height);
            System.out.println(rectangle);
            System.out.println("Rectangle's perimeter: " + rectangle.getPerimeter());
            System.out.println("Rectangle's area: " + rectangle.getArea());
        }
    }

