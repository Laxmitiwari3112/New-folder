package Array;

// BRUTE FORCE : Maximum sub array sum
// time complexity  O(n^3) 
public class MaxSubArraySum {
    public static void SubarraySum(int number[]){
        //int ts=0;//total subarrays

        int currSum=0;
        int maxSum=Integer.MIN_VALUE;

        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=i;j<number.length;j++){
                int end=j;
                currSum=0;
                for(int k=start;k<=end;k++){
                    //System.out.print(number[k]+" ");
                    //subarray sum
                    currSum+=number[k];
                }
                System.out.println("("+currSum+")");
                if(maxSum<currSum){
                    maxSum=currSum;
                }
               // ts++;
               // System.out.println();
            }
           // System.out.println();
        }
        //System.out.println("total subarrays = "+ts);
        System.out.println("Maximum Sum = "+maxSum);
    }

    public static void main(String[] args) {
        int number[]={1, -2, 6, -1, 3};
       //int number[]={2,4,6,8,10};

        SubarraySum(number);
    }
    
}
