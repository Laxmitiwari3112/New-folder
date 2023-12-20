package Strings;
import java.util.*;

//insert character to string
//Deletion of characters from string
public class Insertchar{
    public static void main(String[] args) {
        //DECLARATION
        StringBuilder str1=new StringBuilder("Harry");
        
        //INSERT(adding char at beg position)
        str1.insert(0,'S');
        System.out.println(str1);


        //DELETING CHARACTER
        StringBuilder str2=new StringBuilder("Stark");
        str2.delete(0,1);
        System.out.println(str2);
    }
    
}
