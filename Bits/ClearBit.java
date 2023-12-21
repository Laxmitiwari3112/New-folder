package Bits;

//Clear Bit 
// shifting and obtain BIT MASK
//AND with NOT operator use 
public class ClearBit {
    public static void main(String[] args) {
        int n=5;//number 5=0101
        int pos=2;//position
        int BitMask=1<<pos;//shifting

        int notBitMask=~(BitMask);//OR operator use with BIT MASK
        int newNumber=notBitMask&n;//AND operator use ~(number)

        //output (DECIMAL VALUES)
        System.out.println(newNumber);
    }
}
