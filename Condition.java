import java.util.*;

// print ADULT OR NOT
public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("ADULT");
        } else {
            System.out.println("NOT ADULT");
        }

    }
}
