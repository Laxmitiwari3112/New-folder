import java.util.*;
//   *****
//   *****
//   *****
//   *****

public class Solidrectanglepattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4; // sc.nextInt(); //for rows 4
        int m = 5; // sc.nextInt(); //for coloumns 5

        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
