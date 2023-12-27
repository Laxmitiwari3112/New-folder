package Strings;

import java.util.*;

//Given two string array word1 and word2, return true if the two arrays represents the same string, and false otherwise.
// A string represented by an array elements concatenated in order forms the strings
public class CheckTwoMergedString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // word1=str1+str2
        System.out.println("Enter two strings for word1");
        String str1 = sc.next();
        String str2 = sc.next();
        // array1 str1 and str2
        System.out.println("[" + str1 + "," + str2 + "]");

        String word1 = (str1 + str2);// word1=str1+str2
        System.out.println("WORD1=" + word1);

        // word2=str3+str4
        System.out.println("Enter two strings for word2");
        String str3 = sc.next();
        String str4 = sc.next();
        // array2 for str3 and
        System.out.println("[" + str3 + "," + str4 + "]");

        String word2 = (str3 + str4);// word2=str3+str4
        System.out.println("WORD2=" + word2);

        // check word2=word2 or not
        if (word1.compareTo(word2) == 0) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }

    }
}
