package Strings;
import java.util.*;

//print length of string
public class Printlength {
    public static void main(String[] args) {
        StringBuilder str1=new StringBuilder("Tony");
        str1.append("Stark");

        //print string
        System.out.println(str1);

        //print length of string
        System.out.println(str1.length());
    }
}
