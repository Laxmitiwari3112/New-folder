package Recursion;

import java.util.HashSet;

//print all unique subsequences
public class UniqueSubSeq {

    //function definition
    public static void subsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            }

            else {
                set.add(newString);
                 System.out.println(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);

    // to be
    subsequences(str, idx+1, newString+currChar,set);

        //not to be
        subsequences(str, idx+1, newString,set);
    
    }

    public static void main(String[] args) {
        String str="aaa";
        System.out.print("Given string is = ");
        System.out.println(str);
        HashSet<String> set=new HashSet<>();//hash set of strings

        System.out.println("Unique substrings of given string ");
        subsequences(str,0," ",set);//function call

    }

}
