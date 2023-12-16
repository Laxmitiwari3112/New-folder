import java.util.*;

public class Marks {
    public static void main(String[] args) {

        int[] Marks = new int[3];

        // input
        // System.out.println("ENTER MARKS");
        // Scanner sc=new Scanner(System.in);
        // int math=sc.nextInt();
        // int science=sc.nextInt();
        // int hindi=sc.nextInt();

        // Marks[0]=math;
        // Marks[1]=science;
        // Marks[2]=hindi;

        Marks[0] = 97;
        Marks[1] = 88;
        Marks[2] = 79;

        // output
        System.out.println("OBTAINED MARKS ARE:");
        
        System.out.print("marks in maths=");
        System.out.println(Marks[0]);
        System.out.print("marks in hindi=");
        System.out.println(Marks[1]);
         System.out.print("marks in science=");
        System.out.println(Marks[2]);
    }
}
