
          
// *        *
// **      **
// * *    * *
// *  *  *  *
// *   **   *
// *   **   *
// *  *  *  *
// * *    * * 
// **      **
// *        *
          
public class Hollowbutterfly {
    public static void main(String[] args) {
        int n=5;

        //UPPER FIRST HALF
        // loop for row
        for(int i=1;i<=n;i++){
            //loop for colomn
            for(int j=1;j<=i;j++){
                
                //STARS
                if(j==1||j==i){
                System.out.print("*");}
                else{
                    System.out.print(" ");
                }
               
            } System.out.println();
        }

        //SPACE BTW BOTH HALF(upper)
         //int space=2*(n-i);
         for(int j=1;j<=2*(n-j);j++){
             System.out.println(" ");
         }
        // System.out.println();

        //

        //UPPER second HALF
        // loop for row
        for(int i=1;i<=n;i++){
            //loop for colomn
            for(int j=1;j<=i;j++){
                
                //STARS
              if(j==1||j==i)
                {
                System.out.print("*");}
                else{
                    System.out.println(" ");
                }
               
            } //System.out.println();
        }//System.out.println();
    }
}
