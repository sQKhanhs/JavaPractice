package Threading;

public class Count implements Runnable {
    private Thread thread;
    public Count(){
        thread = new Thread(this, "My Runnable Thread");
        thread.start();
    }

    @Override
    public void run() {
        for(int i = 10; i >= 0; i--){
            try {
                System.out.println(i);
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Thread stopped");
    }

    public Thread getThread() {
        return thread;
    }

    public static void main(String[] args){
    Count count = new Count();
    while (count.getThread().isAlive()){
        try {
            System.out.println("Main thread still running");
            Thread.sleep(1500);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    System.out.println("Main thread stopped");
    }
}
