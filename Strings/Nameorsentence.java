package Strings;

import java.util.*;

//we use string builder bcz in string addition/subtraction/modifiation of string are not allowed
//in stringbuilder these are allowed 
public class Nameorsentence {
    public static void main(String[] args) {
        String name = "harry";// String name="--- ";
        String sentence = "java is programming language.";

        // string is non primitive data type which stores data as
        // text/sentences/characters
        // these are CHAR,BINARY,ENUM,SET,ETC.....

        // input by user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String entername = sc.next();
        // FOR ONE WORD OUTPUT we use sc.next();
        // FOR COMPLETE LINE we use sc.nextLine();
        System.out.println("your name is : " + entername);
    }
}
