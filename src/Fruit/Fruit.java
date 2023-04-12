package Fruit;
import Animal.Edible;

public abstract class Fruit implements Edible {
    public static void main(String[] args){
    Fruit[] fruits = new Fruit[2];
    fruits[0] = new Orange();
    fruits[1] = new Apple();
        for(Fruit element: fruits){
            System.out.println(element.howToEat());
        }
    }
}

