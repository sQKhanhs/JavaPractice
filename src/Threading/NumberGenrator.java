package Threading;

public class NumberGenrator implements Runnable {
    private Thread thread;
    private String name;

    public Thread getThread() {
        return thread;
    }

    public String getName() {
        return name;
    }

    public NumberGenrator(String name){
        this.name = name;
        thread = new Thread(this, "Count");
    }

    @Override
    public void run() {
        try {
            for(Integer i = 0; i <= 10; i++){
                System.out.println("Thread " + getName() + ": " + i);
                Thread.sleep(500);
                System.out.println("Hash code " + getName() + ": " + i.hashCode());
            }
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args){
        NumberGenrator numberGenerator = new NumberGenrator("1");
        numberGenerator.getThread().setPriority(Thread.MAX_PRIORITY);
        NumberGenrator numberGenerator2 = new NumberGenrator("2");
        numberGenerator2.getThread().setPriority(Thread.MIN_PRIORITY);
        numberGenerator.getThread().start();
        numberGenerator2.getThread().start();
    }
}
