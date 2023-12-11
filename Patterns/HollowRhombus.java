
//      *****
//     *   *
//    *   *
//   *   *
//  *****

public class HollowRhombus {
    public static void main(String[] args) {
        int n = 5;

        // loop for row
        for (int i = 1; i <= n; i++) {

            // SPACES
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // System.out.println();

            // loop for colomn
            for (int j = 1; j <= n; j++) {

                // STARS
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
