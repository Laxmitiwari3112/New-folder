package Recursion;

//TIME COMPLEXITY : O(4^n)   as here max choice=4 pqrs
//print combinations are 0->".",1->"abc",2->"def",3->"ghi",4->"jkl",5->"mno",6->"pqrs",7->"tu",8->"vwx",9->"yz"
public class PrintKeypadCombination {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    
    //function definition
    public static void printComb(String str, int idx, String combination){

        //BASE CASE
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];

        for(int i=0;i<mapping.length();i++){
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str="23";

        System.out.println("Keypad combinations are");
        printComb(str, 0, " ");//func call
        
    }
    
}
