import java.util.*;
//Enter number x for base and n for power
public class Exponent {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter  exponent=");
        int n=sc.nextInt();
        System.out.print("Enter base=");
        int x=sc.nextInt();
        int val=pow(int x,int n);//x=base and n=power

       //
        System.out.print("VALUE="+val);

    }
}
