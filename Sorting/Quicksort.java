package Sorting;

import java.util.*;

//Quick sort : Pivot and Partition
//time complexity : WORST CASE = O(n^2) ,AVERAGE CASE= O(nlogn) , BEST CASE
public class Quicksort {
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];// here pivot element=last element
        int i = low - 1;// smaller than pivot

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;// space
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }
        // swap
        i++;// space for pivot
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quicksort(int arr[], int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);// pivot index

            quicksort(arr, low, pivot - 1);// sorting from starting(low) to pivot-1(pivot index-1)

            quicksort(arr, pivot + 1, high);// sorting of right side of pivot
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;// size of array

        quicksort(arr,0,n-1);

        //print array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}

//WORST CASE :O(n^2) WHEN pivot is always smallest element or greatest element
//            when there is no element in left or right from pivot 
//            (n) for each level and (n) for loop at each level, time complexity=O(n^2)

//worst case occurs only when data is already sorted in ascending or decending order