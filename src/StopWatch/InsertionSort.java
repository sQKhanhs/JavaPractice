package StopWatch;

public class InsertionSort {
    static int[] list = {-2, 11, 1, 5, 10, 8, 20, 15, 9, 7, 16, 3};
    //static int[] list2 = {0, 1, 2, 10, 3, 4, 11, 12, -1, 7, 5, 6};

    public void insertionSort(int list[]){
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
    }
    public static void main(String[] args){
        InsertionSort sort = new InsertionSort();
        for (int number : InsertionSort.list)
            System.out.print(number + " ");
        sort.insertionSort(InsertionSort.list);
        System.out.println("\nArray after sorting: ");
        for (int number : InsertionSort.list)
            System.out.print(number + " ");
    }
}
