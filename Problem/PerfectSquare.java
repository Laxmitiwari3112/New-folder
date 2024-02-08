import java.util.*;

//give an integer n, return the least number of perfect square numbers that sum to n
// input=12 , output=3 as 12=4+4+4
public class PerfectSquare {
    public static int SumOfleastperfectSqr(int num){
        int []dp=new int[num+1];//array to store least perfect sqr sum for eachnum upto n
       //BASE CASE 
       dp[0]=0;
       dp[1]=1;

       for(int i=2;i<=num;i++){
        int min=Integer.MAX_VALUE;
        for(int j=1;j*j<=i;j++){
            int rem=i-j*j;//remaining

            if(dp[rem]<min){
                min=dp[rem];
            }
        }
        dp[i]=min+1;
       }
       return dp[num];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number = ");
        int num = sc.nextInt();

        System.out.print("Sum of least number of  perfect squares for given number  = ");
        System.out.print(SumOfleastperfectSqr(num));
       
    }
}
