import java.util.*;
//fabonacci series of n terms 

public class Fibonacciseries {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      // System.out.println(fib(n));
      int a = 0, b = 1, c, count = n;//
      System.out.print(a + " " + b);// print 0 & 1

      for (int i = 2; i < count; ++i) {
         c = a + b;
         System.out.print(" " + c);
         a = b;
         b = c;
      }
   }
}
