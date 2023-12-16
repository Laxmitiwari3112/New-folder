import java.util.Scanner;

public class SumOddofnterm {
    public static void main(String[] args) {
        // n given by user
        System.out.print("Enter terms n=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int oddsum = 0;

        System.out.println("ODD numbers till n terms are: ");
        for (int i = 1; i <= n; i++) {

            // output
            if (i % 2 != 0) {

                System.out.print(i + " ");
                oddsum = oddsum + i;

            } else {
                System.out.println();
            }
        }
        System.out.println();

        System.out.print("SUM OF ALL ODD NUMBERS TILL N term:");
        System.out.println(oddsum);

        System.out.println();

    }
}
