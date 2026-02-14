public class BinarySearch {
    public static void main(String[] args) {
       int[] arr = {12, 14, 53, -12, 12, 43};
       int target = 12;
       int ans = binarySearch(arr, target);
       System.out.println(ans);

        
    }

    Static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length - 1;

        while (start <= end){
            int middle = start + (end - start) / 2;
            if (target > arr[middle]){
                start = middle + 1;
            }else if (target < arr[middle]){
                end = middle - 1;
            }else{
                return middle;
            }

        }

        return -1;
    }
    
}
