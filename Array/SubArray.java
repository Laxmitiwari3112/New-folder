package Array;

//print sub array of Array
public class SubArray {
    public static void printSubarrays(int numbers[]){
        int ts=0;//total subarray
        for(int i=0;i<numbers.length;i++){//for source
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total SubArray = "+ts);
    }
    public static void main(String[] args) {
        int numbers[]={1, 4, 6, 8, 10};

        System.out.println("SubArray of given Array");
        printSubarrays(numbers);
    }
}
