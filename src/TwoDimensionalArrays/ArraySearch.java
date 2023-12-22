package TwoDimensionalArrays;

public class ArraySearch {
    public static boolean staircaseSearch(int mat[][], int key){
        // array is sorted
        int row = 0, col = mat[0].length-1;
        while( row< mat.length && col >= 0){
            if(mat[row][col]==key){
                System.out.println("Key is at (" + row + "," + col + ")");
                return true;
            }
            else if(key<mat[row][col]){
                col--;
            }
            else {
                row++;
            }
        }
        System.out.print("Key not found");
        return false;
    }
    public static void main(String args[]){
        int matrix[][]={
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}
        };
        int key = 33;
        System.out.print(staircaseSearch(matrix, key));
    }
}
