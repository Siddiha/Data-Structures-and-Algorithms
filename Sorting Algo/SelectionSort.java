import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2, 12};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
        
    }

    static void selectionSort(int[] arr){
        for (int i =0 ;i < arr.length ; i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
            swap(arr, maxIndex, last);
        }
    }

    static void swap(int[] arr, int first, int last){
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

    }

    static int getMaxIndex(int[] arr, int start ,  int end){
        int maxvalue = start;
        for (int i = start ; i <= end ; i++){
            if (arr[maxvalue] < arr[i]){
                maxvalue = i;
            }
        }

        return maxvalue;

    }
    
}
