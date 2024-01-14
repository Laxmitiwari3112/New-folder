package Array;

//pairs in array
public class PairsInArray {
    public static void printPairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")"+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int numbers[]={2, 4, 6, 8, 10};

        System.out.println("Possible pairs of Array");
        printPairs(numbers);
    }
    
}
