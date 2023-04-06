public class JoinArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        int[] array2 = {4, 5, 6, 7};
        int[] array3 = new int[array.length + array2.length];
        System.arraycopy(array, 0, array3, 0, array.length);
        System.arraycopy(array2, 0, array3, array.length, array2.length);
        for (int element : array3) {
            System.out.println(element);
        }
    }
}
