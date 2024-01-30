package Recursion;

// Print binary string of size n without consecutive ones 
public class BinaryString {

    public static void printBinString(int n, int lastplace, String str){
        //BASE CASE 
        if(n==0){
            System.out.println(str);
            return;
        }

        //work
        printBinString(n-1, 0, str+"0");//we can place 0 in all situations

        if(lastplace==0){
            printBinString(n-1, 1, str+"1");//we can place 1 only if lastplace is 0
        }
    }

    public static void main(String[] args) {
        System.out.println("All possible Binary string of size n without consecutive ones");
        printBinString(3, 0, "");
    }
}
