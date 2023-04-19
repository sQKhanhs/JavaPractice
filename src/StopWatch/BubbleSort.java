package StopWatch;

public class BubbleSort {
    static int[] list = {-2, 11, 1, 5, 10, 8, 20, 15, 9, 7, 16, 3};
    //static int[] list2 = {0, 1, 2, 10, 3, 4, 11, 12, -1, 7, 5, 6};

    public void bubbleSort(int[] list) {
        for (int loop = 0; loop < list.length; loop++) {
            for (int index = 0; index < list.length - 1; index++) {
                if (list[index] > list[index + 1]) {
                    int temp = list[index];
                    list[index] = list[index + 1];
                    list[index + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort sort = new BubbleSort();
        for (int number : BubbleSort.list)
            System.out.print(number + " ");
        sort.bubbleSort(BubbleSort.list);
        System.out.println("\nArray after sorting: ");
        for (int number : BubbleSort.list)
            System.out.print(number + " ");
    }
}