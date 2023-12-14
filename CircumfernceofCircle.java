import java.util.*;
public class CircumfernceofCircle {
  public static float calculateCIRCUMFERNCE(float n){
   float circumference=2*n*pi;
   return circumference;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    float n=sc.nextFloat();
    float pi=3.140000;

    int circumference=calculateCIRCUMFERNCE(n);
    System.out.println(circumference);
  }
    
}
