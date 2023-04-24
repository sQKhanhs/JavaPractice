package Threading;

public class RunnableDemo implements Runnable{
    private Thread t;
    private final String threadName;
    public RunnableDemo(String name){
        threadName = name;
        System.out.println("Creating thread: " + threadName);
    }
    @Override
    public void run() {
        System.out.println("Running: " + threadName);
        try {
        for(int i = 10; i > 0; i--){
            System.out.println("Thread " + threadName + "," + i);
            Thread.sleep(500);
        }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Exiting: " + threadName);
    }
    public void start(){
        System.out.println("System starting: " + threadName);
        if (t == null){
            t = new Thread(this, threadName);
            t.start();
        }
    }
    public static void main(String[] args){
        System.out.println("Main thread running...");
        RunnableDemo runnableDemo = new RunnableDemo("Thread 1(Receiving information)");
        runnableDemo.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread 2(Sending email)");
        runnableDemo2.start();
        System.out.println("Main thread stopped!!!");
    }
}
