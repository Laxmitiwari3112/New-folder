import java.util.*;
//perimeter of rectangle
public class PerimeterRectangle {
    public static void main(String[] args) {
        
    
    System.out.println("Enter length and breadth respectively:");
    Scanner sc=new Scanner(System.in);
    int l=sc.nextInt();//length 
    int b=sc.nextInt();//breadth

    int perimeter=2*(l+b);
    System.out.print("PERMETER OF RECTANGLE="+perimeter);
    }
}

