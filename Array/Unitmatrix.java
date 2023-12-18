package Array;
import java.util.*;

//unit matrix of order n
public class Unitmatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter order of matrix,n = ");
        int order=sc.nextInt();

        //declaration of matrix
        int[][] number=new int[order][order];

        //create matrix 
        // //row
        // for(int i=0;i<order;i++){
        //     //colmn
        //     for(int j=0;j<order;j++){
        //         number[i][j]=sc.nextInt();
        //     }
        // }

        //elements
        System.out.println("ENTER ELEMENTS OF UNIT MATRIX");
         for(int i=0;i<order;i++){
            for(int j=0;j<order;j++){
                if(i==j){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
    }
}
