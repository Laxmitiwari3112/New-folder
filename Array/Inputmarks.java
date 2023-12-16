package Array;

import java.util.*;

public class Inputmarks {
    public static void main(String[] args) {
        System.out.println("ENTER NUMBERS:");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(numbers[i]);
        }
    }
}
