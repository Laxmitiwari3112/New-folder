package Array;

import java.util.*;

//search max & min element in an array
public class Searchingarray {
    public static void main(String[] args) {

        // input
        System.out.print("Enter size of array=");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // array
        int number[] = new int[size];

        // input numbers of array
        System.out.println("Enter number for array");
        for (int i = 0; i < size; i++) {
            number[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // find max and min number in an array
        System.out.println("result are");
        for (int i = 0; i < number.length; i++) {

            if (number[i] < min) {
                min = number[i];
            }
            if (number[i] > max) {
                max = number[i];
            }
        }
        System.out.println("Maximum value in array is " + max);
        System.out.println("Minimum value in array is " + min);

    }
}
