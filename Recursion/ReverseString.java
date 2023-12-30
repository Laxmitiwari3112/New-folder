package Recursion;

//Reverse string (with help of index variable)
public class ReverseString {
    public static void Printreverse(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));// idx = stringlength-1=last index 
        Printreverse(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        System.out.println("Oringinal string = " + str);

        System.out.print("Reversed String = ");
        Printreverse(str, str.length() - 1);
    }
}
