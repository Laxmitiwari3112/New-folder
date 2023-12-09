import java.util.*;
//* 
//** 
//*** 
//**** 

class firstclass {
    public static void main(String arg[]) {

        int n = 4;
        // outer loops

        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}