package Strings;
import java.util.*;

//reverse string (USING StringBuilder class)
public class ReverseString {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder("Helloworld");

        //loop for reversing
        for(int i=0;i<str1.length()/2;i++){
            int front =i;
            int back=str1.length()-i-1;//for h at 0 will bw filled at 5-0-1=4 index

            char frontChar=str1.charAt(front);//front
            char backChar=str1.charAt(back);//back 

            //for reversing replace front to back and back to front
            str1.setCharAt(front,backChar);
            str1.setCharAt(back,frontChar);

        }
        //OUTPUT
        System.out.println(str1);
    }
}
