import java.util.*;

// sum of two integer (a,b given by user)
public class FunctionsSum {
    public static int calculateSum(int a,int b){
        int sum=a+b;
        return sum;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integers:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int sum=calculateSum(a,b);
       // System.out.print("Sum of given number:");
       System.out.println("Sum of given integers:"+sum);
    }
}
