
// 1 1 1 1
//  2 2 2
//   3 3
//    4

public class InvertedNumpyramid {
    public static void main(String[] args) {
        int n = 4;
        // loop for row
        for (int i = 1; i <= n; i++) {

            // SPACES
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // loop for colomn
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
