package Bits;

//shifting and obtain bit mask
// OR operator use and get result [|]
public class SetBit {
   public static void main(String[] args) {
    int n=5;//number 5=0101
    int pos=1;//position
    int BitMask=1<<pos;//shifting and get BitMask

    //OR operator use 
    int newNumber=BitMask|n;
    System.out.println(newNumber);
   } 
}
