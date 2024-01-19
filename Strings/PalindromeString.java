package Strings;
import java.util.*;
// TIME COMPLEXITY : O(n) linear TC
//check if string is palindrome
public class PalindromeString {
    public static boolean isPalindrome(String str){
        int n=str.length();

        //loop 
        for(int i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                //not a palindrome 
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String to check palindromic string or not = ");
        String str=sc.next();
        //String str="racecar";

        System.out.println(isPalindrome(str));
        
    }
    
}
