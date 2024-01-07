package Recursion;

//TIME COMPLEXITY : O(N!)
//print all permutations of string
public class PermutationOfString {

    // FUNC DEFINTION
    public static void printPerm(String str, String permutation) {
        // BASE CASE
        if (str.length() == 0) {
            System.out.println(permutation);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            // "abc"->"ab" if currchar=c then remaining string is "ab"
            // in substring end string are not included
            String newstr = str.substring(0, i) + str.substring(i + 1);
            printPerm(newstr, permutation + currChar);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        System.out.print("Given string is = ");
        System.out.println(str);

        System.out.println("All possible permutations are");
        printPerm(str, " ");// func call

    }
}
