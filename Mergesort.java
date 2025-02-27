
//merge sort (divide and conquer)
//time complexity = O(nlogn)
public class Mergesort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // BASE CASE
        if (si >= ei) {
            return;
        }
        // mid = ?
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);// left part
        mergeSort(arr, mid + 1, ei);// right part

        // merge left + right
        merge(arr, si, mid, ei);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
        int temp[] = new int[ei - si + 1];// temp arr[size]
        int i = si;// iterator left part
        int j = mid + 1;// iterator right part
        int k = 0;// iterator for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        // for left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        // for right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        // copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
        // printArr(arr);
    }

    public static void main(String[] args) {

        // array
        int arr[] = {6, 3, 9, 5, 2, 8};

        System.out.print("Sorted array= ");

        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);

    }

}
