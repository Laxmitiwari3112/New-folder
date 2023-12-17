package Array;

import java.util.*;

//take matrix as input by user,search x and print indices at which it occurs
public class SearchkeytwoDarray {

    public static void main(String[] args) {
        // input row and colmn
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size=");
        int row = sc.nextInt();
        System.out.print("Enter column size=");
        int column = sc.nextInt();

        // 2-d array declaration
        int[][] number = new int[row][column];

        // input
        // row
        System.out.println("Enter elements for 2-D array");
        for (int i = 0; i < row; i++) {
            // column
            for (int j = 0; j < column; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        System.out.println("obtaind 2-D array is");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        // KEY ELEMENT
        System.out.print("Enter key element(X)=");
        int x = sc.nextInt();

        // SEARCHING
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (number[i][j] == x) {
                    System.out.print("X the key element is found at " + "(" + i + "," + j + ") position.");
                }
               
            }
        }
    }
}
