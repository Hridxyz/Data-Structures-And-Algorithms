package AdvancePatterns;

public class invertedRotatedHalfPyramid {

    public static void main (String[] args){
        int c=10;
        for(int i=1; i<c; i++){
            for (int j=1; j<c-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<c; i++){
            for( int j=0; j<i-1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

}