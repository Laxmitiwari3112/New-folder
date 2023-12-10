//     *
//    ***
//   *****
//  *******
//  *******
//   *****
//    ***
//     *

public class Diamond {
    public static void main(String[] args) {
        
        int n=4;

        //UPPER HALF
        
        //loop for row
        for(int i=1;i<=n;i++){

            //SPACES
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

            //STARS
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }System.out.println();
        }

        //LOWER HALF

        //loop for row
        for(int i=1;i<=n;i++){
            
            //spaces
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            //STARS
            for(int j=2*(n-i)+1;j>=1;j--){
                System.out.print("*");
            }System.out.println();

        }
    }
}
