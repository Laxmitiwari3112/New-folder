import java.util.*;

// average of 3 num given by user
public class AverageofNum {

    // public static int calculateAverage(int a,int b,int c){
    // //AVERAGE OF THREE NUM
    // int Average=(a+b+c)/2;
    // return Average;
    // }

    public static void main(String[] args) {

        // INPUT
        System.out.println("Input any three numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // OUTPUT
        // System.out.print("Average of three numbers:");
        int average = (a + b + c) / 2;
        System.out.println("Average of numbers:" + average);

        System.out.println();
    }

}
