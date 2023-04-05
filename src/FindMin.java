public class FindMin {
    public static void main(String[] args){
        int[] array = {-10,5,3,-11};
        System.out.println(findMin(array));
    }

    public static int findMin(int[] array){
        int min = 99999;
        for(int i = 0; i < array.length; i++)
            if (array[i] < min) {
                min = array[i];
            }
        return min;
    }
}
