import java.util.*;

//input a,b,c then output a=b or a>b or a<b
public class Comparision {
    public static void main(String args[]) {

        // INPUT
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // check
        if (a == b) {
            System.out.println("Equal");
        } else {
            if (a > b) {
                System.out.println("ais greater than b");
            } else {
                System.out.println("a is lesser than b");
            }
        }
    }

}
