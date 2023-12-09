// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14
public class Numpyd {
    public static void main(String[] args) {
        int n=5;
        int number=1;

        //loop for rows
        for(int i=1;i<=n;i++){

            //loop for colomn
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }
}
