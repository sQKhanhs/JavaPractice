package BinarySearch;

public class BinarySearch {
    public static final int NOFOUND = -1;
    static Integer[] list = {2,3,10,15,16,10,29,35,40,45,55,56,60,63,79,81,99};
    public int binarySearch(Integer[] list,int value){
        int left = 0;
        int right = list.length;
        while(right > left){
            int mid = (left + right) / 2;
            if(value < list[mid]){
                right = mid - 1;
            } else if(value > list[mid]){
                left = mid + 1;
            } else{
                return mid;
            }
        }
        return NOFOUND;
    }
}
