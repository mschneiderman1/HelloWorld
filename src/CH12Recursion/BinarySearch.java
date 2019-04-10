package CH12Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 9, 10, 12};
        System.out.println(iterativeBinarySearch(array, 9) + " " +
                recursiveBinarySearch(array, 9, array.length - 1, 0));
        System.out.println(iterativeBinarySearch(array, 10) + " " +
                recursiveBinarySearch(array, 10, array.length - 1, 0));
        System.out.println(iterativeBinarySearch(array, 8) + " " +
                recursiveBinarySearch(array, 8, array.length - 1, 0));
    }

    public static int iterativeBinarySearch(int[] array, int target) {
        int mid;
        int max = array.length - 1;
        int min = 0;
        while (min <= max){
            mid = (max + min) / 2;
            if(array[mid] > target) {
                max = mid - 1;
            } if(array[mid] < target){
                min = mid + 1;
            }
             if(array[mid] == target){
                return mid;
            }
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] array, int target, int max, int min){
            // base case
        if(min > max){
            return -1;
        } else {
            int mid = (max + min) / 2;
            if(array[mid] > target){
                return recursiveBinarySearch(array, target, mid - 1, min);
            }
            else if(array[mid] < target){
                return recursiveBinarySearch(array, target, max, mid + 1);

            }else {
                return mid;
            }
        }
    }
}
