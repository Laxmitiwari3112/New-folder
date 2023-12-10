
//     1
//    1 2
//   1 2 3
//  1 2 3 4
// 1 2 3 4 5

public class Numpyramid {
    public static void main(String[] args) {
        int n = 5;
        // loop for row
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // loop for colomn
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
