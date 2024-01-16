package Strings;
import java.util.*;

//compare two strings 
public class CompareStrings {
    public static void main(String[] args) {
        
        String name1="tony";
        String name2="tony";
        if(name1.compareTo(name2)==0){
            System.out.println("They are same string");
        } else{
            System.out.println("they are different strings");
        }

        //if we use name1==name2 then sometimes gives incorrect output

        //we use name1.compareTO(name2)==0 or name1.equals(name2)


        
    }
}
