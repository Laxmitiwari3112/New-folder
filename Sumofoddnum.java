import java.util.*;

// print sum of odd num frm 1 to n terms
public class Sumofoddnum {
    public static int SumofOddNUMS(int n){
        int c=0;
       for(int i=1;i<=n;i++){
         if(n%2!=0){
        
          int sum=n+i;
        }
        return n;
    }}

    public static void main(String[] args) {

        // n given by user
        System.out.print("Enter terms n=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int oddSum=SumofOddNUMS(n);

        for(int i=1;i<=n;i++){
           
            //output
            //if(i%2!=0){
            //  int sum=i;
            //  int sum=sum+i;
            // int nodd=calculateSumOddnum(int n);
            //  System.out.println(nodd);
            // }
            // else{
            //     System.out.println();
            // }

            System.out.println("SUM OF ALL ODD NUMBERS TILL N term:");
            System.out.println(oddSum);

        }

    }
}
