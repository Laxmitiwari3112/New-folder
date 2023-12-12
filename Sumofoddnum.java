import java.util.*;

// print sum of odd num frm 1 to n
public class Sumofoddnum {
    public static void main(String[] args) {

        // n given by user
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=1;i<=n;i++){
            
            //output
            if(i%2!=0){
            // int sum=i;
             int sum=i;
             System.out.println(sum);
            }
            else{
                System.out.println();
            }
        }

    }
}
