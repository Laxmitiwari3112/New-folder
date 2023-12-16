package Array;
import java.util.*;
public class Seachnum {
    public static void main(String[] args) {
        System.out.print("INPUT SIZE OF ARRAY=");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int num[]=new int[size];

        //input number
        for(int i=0;i<size;i++){
            num[i]=sc.nextInt();
        }

        //key element
        System.out.print("element to search=");
        int x=sc.nextInt();

        for(int i=0;i<size;i++){
            if(num[i]==x){
                System.out.println("Number "+x+" is at position "+(i+1));
            }
        }
    }
}
