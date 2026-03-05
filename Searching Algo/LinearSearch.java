public class LinearSearch{
    public static void main(String[] args) {
        int[] arr = {23, 24, 25, 34, -12, 12, 32, 33};
        int target = 32;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
        
    }

    static int linearSearch(int[] arr, int target){
        for (int i = 0; i < arr.length ; i++){
            if (arr[i] == target){
                return i;
            }
        }

        return -1;

    }

}