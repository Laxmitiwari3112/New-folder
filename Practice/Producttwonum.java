import java.util.*;

// product of two int (a,b given by user)
public class Producttwonum {
    public static int calculateProduct(int a,int b){
        int product=a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any two integer numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();

        int product=calculateProduct(a,b);
        System.out.println("Product of given numbers:"+product);
    }
}
