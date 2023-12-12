import java.util.*;

//cicumference of rad given by user
public class circumference {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle=");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // int circumference=2*n*(22/7);
        int  PI =22/7 ;
        int circumference = 2 * n * PI;

        // System.out.print("Circumference="+circumference);
        System.out.println(2 * n * PI);

    }
}
