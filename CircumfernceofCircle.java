import java.util.*;
public class CircumfernceofCircle {
  public static float calculateCIRCUMFERNCE(float n,float PI){
    PI=22/7;
   float circumference=2*n*PI;
   return circumference;
  }
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    float n=sc.nextFloat();
    //float PI=22/7;

    int circumference=calculateCIRCUMFERNCE(n,PI);
    System.out.println(circumference);
  }
    
}
