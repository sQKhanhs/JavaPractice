package Fan;

public class TestFan {
    public static void main(String[] args){
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.fast);
        fan2.setSpeed(fan1.medium);
        fan1.setRadius(10);
        fan2.setRadius(5);
        fan1.setColor("yellow");
        fan2.isOff();
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
    }
}
