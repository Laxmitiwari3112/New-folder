package Array;

import java.util.*;

//print name given by user PRINT THEM AS OUTPUT
public class Inputname {
    public static void main(String[] args) {

        // input size
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();

        // array
        String name[] = new String[size];

        // input name

        for (int i = 0; i < size; i++) {
            System.out.println("ENTER NAME TO BE PRINT ");
            name[i] = sc.next();
        }

        // output
        for (int i = 0; i < size; i++) {

            System.out.println("Name given by user are " + (i + 1) + " is " + name[i]);
        }

    }
}
