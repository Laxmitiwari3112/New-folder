import java.util.*;

//infinite loop
public class Infiniteloop {
    public static void main(String[] args) {
        System.out.print("Enter num n for infinite loop");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

         for (int i = n; i>=n;i++)
            
         {
             System.out.println(i);
         }
        System.out.println();
       
    }
}
