package Array;

//KADANE'S ALGORITHM : max sum of sub array
// time complexity : O(n)
public class MaxSbArraySum {
    public static void kadanesSum(int number[]) {
        int ms = Integer.MIN_VALUE;// max sum
        int cs = 0;// currSum

        for (int i = 0; i < number.length; i++) {
            cs += number[i];
            if (cs < 0) {// when num is -ve then we store 0
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("Max SubArray Sum is = " + ms);
    }

    public static void main(String[] args) {
        int number[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        kadanesSum(number);
    }
}
