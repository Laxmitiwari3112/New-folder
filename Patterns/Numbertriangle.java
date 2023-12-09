
// 1
// 12
// 123
// 1234
// 12345

public class Numbertriangle {
    public static void main(String[] args) {
       
        int n=5;

        //loop for row
        for(int i=1;i<=n;i++){

            //loop for colomn
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
