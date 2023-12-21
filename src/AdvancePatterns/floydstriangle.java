package AdvancePatterns;

public class floydstriangle {
    public static void main (String[] args){
        int k = 1;
        int c = 5;
        for( int i=1; i<=c; i++){
            for( int j = 1; j<=i; j++){
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }
}
