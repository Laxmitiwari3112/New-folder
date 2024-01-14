package Array;

//TIME COMPLEXITY : O(n+m) 
//O(n) for n>>m , O(m) for n<<m 
//search in sorted matrix(staircase search)
public class SearchinSortedMatrix {

    public static boolean staircaseSearch(int matrix[][],int key){
        int row=0;
        int col=matrix[0].length-1;//search from (0,j) : first row last col

        while(row<matrix.length&&col>=0){
            if(matrix[row][col]==key){
                System.out.println("Found Key at "+"("+row+","+col+")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;//key <cell value then left
            }
            else{
                row++;//key>cell value then bottom
            }
        }
        System.out.println("Key is not found!");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10, 20, 30, 40},{15, 25, 35,45},{27, 29, 37, 48},{32, 33, 39, 50}};

        int key=33;
        staircaseSearch(matrix,key);
    }
}
