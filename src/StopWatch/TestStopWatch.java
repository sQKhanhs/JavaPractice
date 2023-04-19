package StopWatch;

public class TestStopWatch {
    public static void main(String args[])
    {
        InsertionSort ob = new InsertionSort();
        StopWatch watch = new StopWatch();
        int arr[] = new int[100000];
        watch.start();
        System.out.println("Start time: " + watch.getStartTime());
        for(int index = 0; index < arr.length; index++){
            arr[index] = (int) (Math.random() * 100000);
        }
        ob.insertionSort(arr);
        watch.end();
        System.out.println("End time: " + watch.getEndTime());
        System.out.println("Elapsed time:" + watch.getElapsedTime());
        System.out.println("Sorted array");
    }
}
