//     1
//    1 1
//   1 2 1
//  1 3 3 1
// 1 4 6 4 1

public class Pascalpyramid {
    public static int factorial(int n) {
        int i, f = 1;

        for (i = 1; i <= n; i++) {
            f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        int n = 5, r, c, space;

        for (r = 0; r < n; r++) {
            for (space = 0; space < (n - r - 1); space++) {
                System.out.print(" ");
            }
            for (c = 0; c <= r; c++) {
                int s = factorial(r);
                int t = factorial(r - c);
                int u = factorial(c);

                System.out.print(s / (t * u) + " ");
            }
            System.out.println();
        }
    }
}
