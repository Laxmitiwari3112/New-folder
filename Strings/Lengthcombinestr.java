package Strings;
import java.util.*;

//print length of combined string given by user
public class Lengthcombinestr {
    public static void main(String[] args) {
        
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string name=");
        String str1=sc.next();//string 1
        System.out.print("Enter second string name=");
        String str2=sc.next();//string 2

        //concatenation : string addition
        String combined=str1+" "+str2;

        //output the length of combined string 
        System.out.println(combined.length());

    }
}
