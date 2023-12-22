package Sorting;

//time complexity of this code = O(n^2)
//BUBBLE SORT : Pass(loop)=n-1 , traversing in each paas=n
public class BubbleSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        // array
        int arr[] = { 7, 8, 3, 1, 2 };

        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) { // array length : n-1
            // sorting for remaining elements
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];// temperory variable
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // output
        printArray(arr);
    }
}
