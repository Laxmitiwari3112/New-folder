package Recursion;

//print indices of key 
public class IndicesOfKey {
    public static void printIndicesKey(int[] arr, int key, int i) {
        // BASE CASE
        if (i == arr.length) {
            return;
        }

        // WORK
        if (arr[i] == key) {
            System.out.print(i + " ");
        }
        printIndicesKey(arr, key, i + 1);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 2, 4, 5, 6, 2, 7, 2, 2 };
        int key = 2;

        System.out.print("All occurences = ");
        printIndicesKey(arr, key, 0);// 0 to n indexing
        System.out.println();
    }
}
