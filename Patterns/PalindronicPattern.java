
//     1
//    212
//   32123
//  4321234
// 543212345

public class PalindronicPattern {
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

            // first half triangle
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }

            // second half triangle
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
        System.out.println();
    }
}
