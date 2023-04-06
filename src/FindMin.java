public class FindMin {
    public static void main(String[] args) {
        int[] array = {-10, 5, 3, -11};
        System.out.println(findMin(array));
    }

    public static float findMin(int[] array) {
        float min = 99999;
        for (int j : array) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
