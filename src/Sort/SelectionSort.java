package Sort;

public class SelectionSort {
    static int[] list = {-2, 11, 1, 5, 10, 8, 20, 15, 9, 7, 16, 3};
    //static int[] list2 = {0, 1, 2, 10, 3, 4, 11, 12, -1, 7, 5, 6};

    public void selectionSort(int[] list) {
        int min;
        int minIndex;
        for(int index = 0; index < list.length; index++){
            minIndex = index;
            min = list[minIndex];
            for(int index2 = index + 1; index2 < list.length; index2++){
                if(list[index2] < min){
                    minIndex = index2;
                    min = list[index2];
                }
            }
            if(minIndex != index){
                int temp = list[index];
                list[index] = min;
                list[minIndex] = temp;
            }
        }

    }
        public static void main(String[] args){
            SelectionSort sort = new SelectionSort();
            for (int number : SelectionSort.list)
                System.out.print(number + " ");
            sort.selectionSort(SelectionSort.list);
            System.out.println("\nArray after sorting: ");
            for (int number : SelectionSort.list)
                System.out.print(number + " ");
        }
    }

