import java.util.*;
//area of circle
public class AreaOfcircle {
    public static void main(String[] args) {
        System.out.println("ENTER RADIUS OF CIRCLE:");
        Scanner sc=new Scanner(System.in);
        float rad=sc.nextInt();//radius of circle
        float PI=(float)22/7;

        float area=PI*rad*rad;
        System.out.println("AREA OF CIRCLE:"+area);
    }
}
