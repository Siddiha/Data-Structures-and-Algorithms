public class BubbleSort{
    public static void main(String[] args) {
        int[] arr = {-1, 7, 32, 24, -12};
        bubble(arr);
    }

    static void bubble(int[] arr){
        boolean swapped;

        for (int i = 0; i < arr.length; i++){
            swapped = false;

            for (int j = 0 ; j < arr.length - i ; j++){
                if ( arr[j] < arr[j - 1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped){
                break;
            }
        }
    }
}