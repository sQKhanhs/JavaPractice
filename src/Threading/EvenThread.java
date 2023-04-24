package Threading;

public class EvenThread implements Runnable{
    private Thread thread;

    public Thread getThread() {
        return thread;
    }


    public EvenThread() {
        thread = new Thread(this, "Count");
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 10; i += 2) {
                System.out.println(i);
                Thread.sleep(15);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
