package Recursion;

//total ways to pair friends : they can be alone or pair with one frnd
public class FriendsPairing {

    public static int friendPairing(int n){
        //base case
        if(n==1||n==2){
            return n;
        }

        //choice 
        //single
        int fnm1=friendPairing(n-1);//for n minus 1

        //pair
        int fnm2=friendPairing(n-2);
        int pairWays=(n-1)*fnm2;//(n-1)*f(n-2)

        //totalways
        int totalways=fnm1+pairWays;
        return totalways;

        //return friendPairing(n-1)+(n-1)*friendPairing(n-2);
    }
    public static void main(String[] args) {
        System.out.print("Total ways to pair friends = ");
        System.out.println(friendPairing(3));//frnds(n)=3
    }
    
}
