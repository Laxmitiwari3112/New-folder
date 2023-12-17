package Array;

import java.util.*;
//create two d array
public class TwoDArray {
    public static void main(String[] args) {
        
        //input size
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter row size=");
        int row=sc.nextInt();//row
        System.out.print("Enter column size=");
        int column=sc.nextInt();//column
        int[][] number=new int[row][column];

        //input 
        //row
        System.out.println("Enter numbers for 2-D array");
        for(int i=0;i<row;i++){
            //column
            for(int j=0;j<column;j++){
                number[i][j]=sc.nextInt();
            }
        }

        //output
        System.out.println("Obtained 2-D array is");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

    }
}
