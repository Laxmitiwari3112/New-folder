package Recursion;

//check if an array is sorted(strickly increasing) : { 1, 2, 3, 4, 5}
public class Checksorted {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }

        if (arr[idx] < arr[idx + 1]) {
            // array is sorted till now
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 3, 5 };
        isSorted(arr, 0);
        
        System.out.println("Is given array is strickly increasing : "+ isSorted(arr, 0));
    }
}
