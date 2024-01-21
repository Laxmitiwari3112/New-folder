package Recursion;

// area =2*n  where tile = 2* 1
//count the number of ways to tile 
public class TilingProblem {
    public static int tilingproblm(int n){// 2 *n (floor size)

        //BASE CASE
        if(n==0||n==1){
            return 1;
        }

        //vertical choice
        int fnm1= tilingproblm(n-1);// for n minus 1 =  (n-1)

        //horizontal choice
        int fnm2=tilingproblm(n-2);//for (n-2)

        //total ways
        int totalways=fnm1+fnm2;
        return totalways;

    }
    
    public static void main(String[] args) {

        System.out.print("Total number of ways for tiling = ");
        System.out.println(tilingproblm(3));//n = 3
            }
}
