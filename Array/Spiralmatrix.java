package Array;

import java.util.*;

// print spiral matrix for given matrix
public class Spiralmatrix {
    public static void main(String[] args) {

        // input size of matrix
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of row=");
        int row = sc.nextInt();
        System.out.print("'Enter size of column=");
        int column = sc.nextInt();

        // declaration of 2-D array
        int[][] numbers = new int[row][column];

        // define row and column condition
        // int row_start = 0;// starting
        // int row_end = row - 1;// ending row
        // int column_start = 0;// colmn starting
        // int column_end = column - 1;// column ending

        // create matrix for spiral matrix
        System.out.println("Enter elements for matrix:");
        for (int i = 1; row <= row ; i++) {
            for (int j = 1; j<=column; j++) {

                // input for matrix
                numbers[i][j] = sc.nextInt();
            }
        }

        // output as matrix
        System.out.println("RESULTANT MATRIX:");
        for (int i = 1; row <= row; i++) {
            for (int j = column; j > 1; j--) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }

        // OUTPUT OF SPIRAL ORDER OF MATRIX
        System.out.println("SPIRAL ORDER OF CREATED MATRIX IS:");
          //traverse first row
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= column; j++) {
                System.out.print(numbers[1][j]+" ");
            }
        }

         //traverse end column
          for (int i = 2; i <= row; i++) {
            for (int j =column; j <=column; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }
        
        column-=1;
        //traverse end row (end to start)
         for (int i = row; i<=row; i++) {
            for (int j = column; j >=1; j--) {
                System.out.print(numbers[i][j]+" ");
            }
        }

        //traverse first column
        row-=1;
        for (int i = row-1; i >=2; i--) {
            for (int j = 1; j <= 1; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }

        //traverse 2 row
       // row-=1;
         for (int i = 2; i <= 2; i++) {
            for (int j = 2; j <= column; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }
        
        //traverse second last column
          for (int i = 2; i <= row; i++) {
            for (int j = column-1; j <= column-1; j++) {
                System.out.print(numbers[j][j]+" ");
            }
        }

        //traverse second last row
         for (int i = row-1; i <= row-1; i++) {
            for (int j = column-2; j <= 2; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }

        column-=1;
        //traverse 2 column
         for (int i = row-2; i <=3; i++) {
            for (int j = 3; j <= 3; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }

        //traverse 3 row
         for (int i = 3; i <= 3; i++) {
            for (int j = 3; j <= column-3; j++) {
                System.out.print(numbers[i][j]+" ");
            }
        }


    }
}
