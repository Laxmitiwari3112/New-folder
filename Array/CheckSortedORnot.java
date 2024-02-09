package Array;

import java.util.*;

// create  array by user and check sorted or not
public class CheckSortedORnot {
    public static void main(String[] args) {

        // input size of array
        System.out.print("Enter size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // array
        int number[] = new int[size];

        // input elements in array
        System.out.println("Enter elements for array");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        // System.out.print(number[i]);

        // check ascending or not
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 1; i < number.length - 1; i++) {

            if (number[i] > number[i + 1]) {
                // this is fpr ascending
                isAscending = false;
            }
            if (number[i] < number[i + 1]) {
                isDescending = false;
            }
        }

        if (isDescending) {
            System.out.println("The Array is in sorted descending order");
        }
        if (isAscending) {
            System.out.println("The Array is in sorted ascending order");
        } else {
            System.out.println("The array is not in sorted ascending order");
        }

    }
}
