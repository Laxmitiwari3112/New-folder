package Function;

//Function Overloading : Multiple functions with the same name but different parameters.
public class FunctionOverloading {

    // func to calc int sum
    public static int sum(int a, int b) {
        return a + b;
    }

    // func to calc float sum
    public static float sum(float a, float b) {
        return a + b;
    }

    public static void main(String[] args) {

        System.out.print("Sum of a and b = ");
        System.out.println(sum(3, 5));// int values
        System.out.println(sum(2.4f, 5.1f));// float values
    }

}
