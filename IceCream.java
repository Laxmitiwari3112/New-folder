
import java.util.*;
// import java.lang.*;
// import java.io.*;

class IceCream {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        System.out.print("icecream cones: ");
        int ice_creamCones = sc.nextInt();
        System.out.print("scoops: ");
        int Scoops = sc.nextInt();

        if (ice_creamCones <= Scoops) {
            // System.out.println("maximum number of ice cream cones made by chef are ");
            System.out.print("maximum number of ice cream cones made by chef are " + ice_creamCones);
        } else {
            //  System.out.println("maximum number of ice cream cones made by chef are ");
            System.out.println("maximum number of ice cream cones made by chef are " + Scoops);
        }
    }
}
