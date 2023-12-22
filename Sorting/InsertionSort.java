package Sorting;

// INSERTION SORT : arr[i+1] compare with arr[i] and arr[i+1]>arr[i] true else swap
public class InsertionSort {
    public static void printArray(int arr[]) {
        // sorted elements
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {

        // array
        int arr[] = { 7, 8, 3, 1, 2 };

        // insertion sort
        // outer loop
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            // placement
            arr[j + 1] = current;
        }
        System.out.println("SORTED ELEMENTS BY INSERTION SORTING");
        printArray(arr);
    }

}
