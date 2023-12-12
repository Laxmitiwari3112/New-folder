import java.util.*;

// all even number till n(n given by user)
public class Allevennum {
    public static void main(String[] args) {

        // input
        System.out.print("Enter number n=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // output
        System.out.println("All even numbers tilll n are");
        for (int i = 1; i <= n; i++)

            if (i % 2 == 0) {
                System.out.println(i);
            } else {
                System.out.print(" ");
            }
        System.out.println();

    }
}
