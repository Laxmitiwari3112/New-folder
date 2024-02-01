

//convert number to string  
public class DigitToString {

    static String digit[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    public static void printstring(int num) {
        // BASE CASE
        if (num == 0)
            ;
        return;

        // WORKING
        int lastdigit = num % 10;
        printstring(num / 10);
        System.out.println(digit[lastdigit] + " ");
    }

    public static void main(String[] args) {
        //int num = 1234;
        printstring(1234);
        System.out.println();
    }
}
