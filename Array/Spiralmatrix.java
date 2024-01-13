package Array;

import java.util.*;

// print spiral matrix for given matrix

//  1  2  3  4 
//  5  6  7  8 
//  9 10 11 12
// 13 14 15 16

//output : 1 2 3 4 8 12 16 14 13 9 5 6 7 11 10
public class Spiralmatrix {
    public static void printSpiral(int matrix[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length - 1;
        while (startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(matrix[startrow][j] + " ");// (strrow) to (str col to end col)
            }

            // right
            for (int i = startrow + 1; i <= endrow; i++) {
                System.out.print(matrix[i][endcol] + " ");// (strrow+1 to end row) to (end col)
            }

            // bottom
            for (int j = endcol - 1; j >= startcol; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(matrix[endrow][j] + " "); // (endcol-1 to strcol) to (end row)
            }

            // left
            for (int i = endrow - 1; i >= startrow + 1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(matrix[i][startcol] + " ");// (str col) to (endrow-1 to strrow+1) to
            }
            startrow++;
            startcol++;
            endrow--;
            endcol--;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int matrix[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        System.out.println("Spiral matrix for given matrix");
        printSpiral(matrix);

    }
}
