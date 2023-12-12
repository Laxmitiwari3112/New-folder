import java.util.*;
//fabonacci series

import javax.sql.rowset.spi.SyncResolver;
public class Fibonacciseries {
 public static int fib(int n){
    int a=0;
    int b=1;
    int c;
    if(n==0){
        return a;
    }
    for(int i=2;i<=n;i++){
         c=a+b;
         a=b;
         b=c;
    }
    return b;
 }

 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(fib(n));
 }
// System.out.println();
}
