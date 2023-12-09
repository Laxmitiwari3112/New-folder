
// 12345
// 1234
// 123
// 123
// 12
// 1
public class Invertednumpyd {
    public static void main(String[] args) {

        int n = 5;

        // loop fpr rows
        for (int i = 1; i <= n; i++) {

            // loop for colomns
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
