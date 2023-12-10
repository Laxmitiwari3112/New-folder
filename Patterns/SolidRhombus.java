
//     *****
//    *****
//   *****
//  *****
// *****

public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;

        // loop for row
        for (int i = 1; i <= n; i++) {

            // SPACES
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // loop for colomn
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
