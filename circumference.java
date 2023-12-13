import java.util.*;

//cicumference of rad given by user
public class circumference {
    public static void main(String[] args) {
        System.out.print("Enter radius of circle=");
        Scanner sc = new Scanner(System.in);
        float n = sc.nextInt();
        // int circumference=2*n*(22/7);
        float PI =22/7 ;
        float circumference = (float)(2 * n * PI);

     System.out.print("Circumference="+circumference);
       // System.out.println(2 * n * PI);

    }
}
