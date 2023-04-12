package Animal;

public class Chicken extends Animal implements Edible{

    @Override
    public String makeSound() {
        return "bok bok";
    }

    @Override
    public String howToEat() {
        return "Deep fried";
    }
}
