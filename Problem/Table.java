import java.util.*;

// table of n (n given by user)
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("TABLE OF:" + n);

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }
    }
}
