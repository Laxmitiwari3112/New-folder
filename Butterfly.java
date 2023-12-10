
// *      *
// **    **
// ***  ***
// ********
// ********
// ***  ***
// **    **
// *      *

public class Butterfly {
    public static void main(String[] args) {
        int n = 4;

        // loop for upper first half
        // loop for row
        for (int i = 1; i <= n; i++) {
            // loop for colomn
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // System.out.println();
        }

        // SPACES FOR UPPER HALF PATTERN
        for (int j = 1; j <= 2 * (n - j); j++) {
            System.out.print(" ");
        }
        System.out.println();

        // loop for upper second half
        // loop for row
        for (int i = 1; i <= n; i++) {
            // loop for colomn
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // loop for first lower half
        // loop for row
        for (int i = n; i >= 1; i--) {
            // loop for colomn
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // System.out.println();
        }

    }
}
