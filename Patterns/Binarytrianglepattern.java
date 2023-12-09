
// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

public class Binarytrianglepattern {
    public static void main(String[] args) {
        int n = 5;

        // loop for rows
        for (int i = 1; i <= n; i++) {

            // loop for colomn
            for (int j = 1; j <= i; j++) {

                // here if position i+j is divisible by 2 then it print 1 else 0
                if ((i + j) % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
