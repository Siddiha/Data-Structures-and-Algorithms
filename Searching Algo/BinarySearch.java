import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 4;

        // Sort the array first
        Arrays.sort(arr);

        int ans = binarySearch(arr, target);
        System.out.println("Index of target: " + ans);
    }

    static int binarySearch(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target > arr[mid]) {
                start = mid + 1;
            } 
            else if (target < arr[mid]) {
                end = mid - 1;
            } 
            else {
                return mid; // target found
            }
        }

        return -1; // target not found
    }
}