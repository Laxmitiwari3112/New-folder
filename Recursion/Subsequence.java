package Recursion;

//TIME COMPLEXITY : O(2^n)
//print all subsequences of string
public class Subsequence {
    public static void subSequences(String str, int idx, String newString) {

        // BASE CASE
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);

        // to be
        subSequences(str, idx + 1, newString + currChar);

        // not to be
        subSequences(str, idx + 1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";

        System.out.println("ALL POSSIBLE SUBSEQUENCES OF STRINGS ARE");
        subSequences(str, 0, " ");
    }

}
