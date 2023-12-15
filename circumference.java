import java.util.*;

//cicumference of rad given by user
public class circumference {
    // public static void main(String[] args) {
    // System.out.print("Enter radius of circle=");
    // Scanner sc = new Scanner(System.in);
    // float n = sc.nextFloat();
    // // int circumference=2*n*(22/7);
    // float PI =3.14 ;
    // float circumference = (float)(2 * n * PI);

    // System.out.print("Circumference="+circumference);
    // // System.out.println(2 * n * PI);
    public static float calculateCircumference(float n,PI) {
        float PI = 22 / 7;
       
        float circumference = 2 * n * PI;// n =radius
        return circumference;
    }//return circumference;

    }

 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    float PI = 22 / 7;
 float n=sc.nextFloat();
   float Circumference=calculateCircumference(float n,PI);
   System.out.println("Circimference of CIRCLE is="+ Circumference);
}
