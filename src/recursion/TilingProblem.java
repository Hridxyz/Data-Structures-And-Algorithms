package recursion;

public class TilingProblem {
    public static int Tiling(int n){
        if( n==0 || n==1){
            return 1;
        }
        //vertical choice
        int fnm1 = Tiling(n-1);
        //horizontal choice
        int fnm2 = Tiling(n-2);
        int total = fnm2 + fnm1;
        return total;
    }
    public static void main(String[] args){
        System.out.print(Tiling(5));
    }
}
