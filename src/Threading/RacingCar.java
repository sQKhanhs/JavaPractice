package Threading;

import java.util.Random;

public class RacingCar implements Runnable {
    public static final int DISTANCE = 100;
    public static final int STEP = 2;
    private String name;
    public RacingCar(String name){
        this.name = name;
    }


    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        int runDistance = 0;
        while (runDistance < DISTANCE){
            try {
                int speed = (new Random()).nextInt(20);
                runDistance += speed;
                String log = "|";
                int percentDistance = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < 100; i += STEP) {
                    if (percentDistance >= i + STEP) {
                        log += "=";
                    } else if (percentDistance >= i && percentDistance < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car " + name + ": " + log + " Run Distance: " + runDistance + " KM");
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println("Car " + name + " broken");
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car " + name + " finished in " + ((endTime - startTime)/1000) + "s");
    }
    public static void main(String[] args){
        RacingCar racingCarA = new RacingCar("A");
        RacingCar racingCarB = new RacingCar("B");

        Thread threadA = new Thread(racingCarA);
        threadA.start();
    }
}
