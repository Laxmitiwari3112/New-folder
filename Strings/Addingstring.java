package Strings;

import java.util.*;

//concatenation: addition of more than one string and print output
//addition of string
//comarision of string
//seperate sub string
public class Addingstring {

    public static void main(String[] args) {

        // declaration
        // concatenation(addition of two string)
        String firstname = "Tony";
        String lastname = "Stark";
        String fullname = firstname + " " + lastname;

        System.out.println(fullname);
        // print length of string
        System.out.println(fullname.length());// no.of element=lenght of that string

        // chaarAT
        // access characters of a string
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

        // comparision of Strings
        String name1 = "Tony";
        String name2 = "Tony";
        // 1 s1>s2 :+ve value
        // 2 s1=s2 : 0
        // 3 s1<s2 : -ve value

        // me you (you is big string as first char y has higher),compare all characters

        // name1==name2 fails in some cases so we use compareTo function
        if (name1.compareTo(name2) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("String are not equal");
        }

        // compare
        String sentence = "My name is Tonny";
        // substring(beg index, end index)
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

        String nameA = "TonyStark";
        String nameB = nameA.substring(4);// by default end index is as last index
        System.out.println(nameB);
    }
}
