package Sorting;

//time complexity : O(n^2)
//SELECTION SORT : select smallest elements & arrange at first unsorted place
public class Selectionsort {
    public static void printArray(int arr[]){
        //elements in sorted order
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        //elements array
        int arr[]={7,8,3,1,2};

        //selection sort
        //outer loop
        for(int i=0;i<arr.length-1;i++){
            int smallest=i;
            //innner loop for comparing elemnts
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }

            }
            int temp =arr[smallest];
            arr[smallest]=arr[i];
            arr[i]=temp;
        }

        //output
        System.out.println("SORTED ARRY BY SELECTION SORTING IS");
        printArray(arr);

    }
}
