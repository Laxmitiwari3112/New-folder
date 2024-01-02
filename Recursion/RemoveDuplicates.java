package Recursion;

//remove  duplicates in string
public class RemoveDuplicates {
    // we create boolean type array name map of size 26(english alphabets=26)
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newsString) {

        // BASE CASE
        if (idx == str.length()) {
            System.out.println(newsString);
            return;
        }

        // current character
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newsString);
        } else {
            newsString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newsString);
        }
    }

    public static void main(String[] args) {
        // ORIGINAL string
        String str = "abbccda";
        System.out.println("Original string = " + str);

        // FUNCTION call
        System.out.print("Updated String = ");
        removeDuplicates(str, 0, " ");
    }

}
