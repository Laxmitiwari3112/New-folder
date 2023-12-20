package Strings;
import java.util.*;

//reverse string (USING StringBuilder class)
public class ReverseString {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder("Helloworld");

        //loop for reversing
        for(int i=0;i<str1.length()/2;i++){
            int front =i;
            int back=str1.length()-i-1;

            char frontChar=str1.charAt(front);
            char backChar=str1.charAt(back);

            str1.setCharAt(front,backChar);
            str1.setCharAt(back,frontChar);

        }
        //OUTPUT
        System.out.println(str1);
    }
}
