import java.util.*;
public class Sumofoddnterm {
    public static void main(String[] args) {
        System.out.print("Enter terms n=");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int oddsum=0;
        int evensum=0;
        
        for(int i=1;i<=n;i++){
            if(n%2!=0){
                oddsum=oddsum+i;
            }
            // else {
            //     evensum=evensum+i;
            // }
        }
        System.out.println("The Sum of odd numbers till n terms are="+oddsum);
        // System.out.print("The Sum of even numbers till n terms are="+evensum);

    }
    
}
