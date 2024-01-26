package recursion;

public class Fibonacci {
    public static int Fibo(int n){
        if (n == 1 || n == 0){
            return 1;
        }
        int fnm1 = Fibo(n-1);
        int fnm2 = Fibo(n-2);
        int fn = fnm1 + fnm2;
        return fn;

    }
    public static void main(String[] args){
        System.out.println(Fibo(10));
    }
}
