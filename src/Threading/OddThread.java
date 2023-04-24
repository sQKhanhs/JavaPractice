package Threading;

public class OddThread implements Runnable {
    private Thread thread;

    public Thread getThread() {
        return thread;
    }


    public OddThread() {
        thread = new Thread(this, "Count");
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 10; i += 2) {
                System.out.println(i);
                Thread.sleep(10);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
