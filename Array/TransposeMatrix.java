package Array;

import java.util.*;

//transpose of matrix
public class TransposeMatrix {
    public static void main(String[] args) {

        // input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size=");
        int row = sc.nextInt();
        System.out.print("Enter column size=");
        int column = sc.nextInt();

        // 2-D array
        int[][] number = new int[row][column];

        // input elements in 2-D array
        System.out.println("enter elements in matrix:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        // obtaind 2-d array
        System.out.println("OBTAINED MATRIX");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        // transpose of matrix
        System.out.println("TRANSPOSE OF MATRIX IS:");
        for (int j = 0; j < column; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }
    }
}
