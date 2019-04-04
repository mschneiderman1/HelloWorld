package CH12Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 9, 10, 12};
        System.out.println(iterativeBinarySearch(array, 9));
        System.out.println(iterativeBinarySearch(array, 10));
        System.out.println(iterativeBinarySearch(array, 8));
    }

    public static int iterativeBinarySearch(int[] array, int target) {
        int mid = (array[0] + array[array.length - 1]) / 2;
        int max = array.length - 1;
        int min = 0;
        while (array[mid] != target){
            if(array[mid] > target) {
                max = mid - 1;
                mid = (max + min) / 2;
            }else if(array[mid] < target){
                min = mid + 1;
                mid = (max + min) / 2;
            }
            if(max < min){
                return -1;
            }
        }
        return mid;
    }
}
