

//merge sort (divide and conquer)
//time complexity = O(nlogn)
public class Mergesort {

    // public static void conquer(int arr[], int si, int ei, int mid) {
    //     int merge[] = new int[ei - si + 1];// size of array

    //     // index 1=si and 2=mid+1
    //     int idx1 = si;// track 1st array
    //     int idx2 = mid + 1;// track 2nd array
    //     int x = 0;// track index of merge

    //     // (n)
    //     while (idx1 <= mid && idx2 <= ei) {
    //         if (arr[idx1] <= arr[idx2]) {
    //             merge[x++] = arr[idx1++];
    //         } else {
    //             merge[x++] = arr[idx2++];
    //         }
    //     }
    //     while (idx1 <= mid) {
    //         merge[x++] = arr[idx1++];
    //     }
    //     while (idx2 <= ei) {
    //         merge[x++] = arr[idx2++];
    //     }
    //     for (int i = 0, j = si; i < merge.length; i++, j++) {

    //         arr[j] = merge[i];
    //     }
    // }

    //public static void divide(int arr[], int si, int ei) {

    //     if (si >= ei) {
    //         return;
    //     }
    //     // O(logn)
    //     // si=starting index and ei = ending index of array
    //     // we avoid (si+ei)/2 as sometimes it gives larger value than array
    //     int mid = si + (ei - si) / 2;
    //     divide(arr, si, mid);
    //     divide(arr, mid + 1, ei);
    //     conquer(arr, si, mid, ei);
    // }
   
    public static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[],int si,int ei){
        //mid = ?
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);//left part
        mergeSort(arr, mid+1, ei);//right part

        //merge left + right
        merge(arr, si,mid, ei);
    }


    public static void merge(int arr[],int si,int ei,int mid){
        int temp[]=new int[ei-si+1];//temp arr 
        int i=si;//iterator left part
        int j=mid+1;//iterator right part
        int k=0;//iterator for temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }
            else{
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        //for left part
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        //for right part
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        //copy temp to original array
        for(k=0,i=si;k<temp.length;k++,i++){
           arr[i]=temp[k];
        }
        //printArr(arr);
    }
    public static void main(String[] args) {

        // array
        int arr[] = { 6, 3, 9, 5, 2, 8 };

        System.out.print("Original array= "+arr);

        mergeSort(arr, 0, arr.length-1);

        //printArr(arr);





        // length of arr : total number of elements use
        //int n = arr.length;

        // function call
    //     divide(arr, 0, n - 1);
    //     // print
    //     System.out.println("sorted array");
    //     for (int i = 0; i < n; i++) {
    //         System.out.println(arr[i] + " ");
    //     }
    //     System.out.println();

    }

}
