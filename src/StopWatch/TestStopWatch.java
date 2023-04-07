package StopWatch;

public class TestStopWatch {
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        StopWatch watch = new StopWatch();
        int arr[] = new int[10000];
        watch.start();
        System.out.println("Start time: " + watch.getStartTime());
        for(int index = 0; index < arr.length; index++){
            arr[index] = (int) (Math.random() * 100000);
        }
        ob.sort(arr);
        watch.end();
        System.out.println("End time: " + watch.getEndTime());
        System.out.println("Sorted array");
        ob.printArray(arr);
        System.out.println("Elapsed time:" + watch.getElapsedTime());
    }
}
