package Threading;

public class Main {
    public static void main(String[] args){
        try {
            OddThread oddThread = new OddThread();
            EvenThread evenThread = new EvenThread();
            evenThread.getThread().setPriority(Thread.MAX_PRIORITY);
            oddThread.getThread().start();
            oddThread.getThread().join();
            evenThread.getThread().start();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
