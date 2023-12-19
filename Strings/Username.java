package Strings;
import java.util.*;

//creating username by email ID given by user after removing @gmail.com
public class Username {
    public static void main(String[] args) {
        
        //input email
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your email-ID = ");
        String emailID=sc.next();

        String user="";

        //traversing then remove @gmail.com
        for(int i=0;i<emailID.length();i++){
            if(emailID.charAt(i)=='@'){
                break;
            }
            else{
                user+=emailID.charAt(i);
            }
        }
        //create username from email id string 
        System.out.print("USERNAME IS = "+user);
    
    }

}
