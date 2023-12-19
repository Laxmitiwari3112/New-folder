package Strings;
import java.util.*;

//replace the letter e with i from the string given by user
public class Repalceletter {
    public static void main(String[] args) {
        
        //input
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER STRING NAME =");
        String str=sc.next();

        //output of given string
        System.out.println("String name given by user is "+str);

        String result="";

        //replacing
        System.out.print("After replacing =");
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='e'){
                result+='i';
            }
            else{
                result+=str.charAt(i);
            }
        }

        System.out.print(result);
    }
}
