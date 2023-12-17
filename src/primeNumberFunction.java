import java.util.*;
public class primeNumberFunction {
    public static boolean isPrime(int n){
        if (n==2) {
            return true;
        }
        for (int i=2; i<= Math.sqrt(n);i++) {
            if (n % i == 0) {
                return false;
            }

        }

    }
    public static void main (String args[]){
        int n=11;
        System.out.println(isPrime(n));

    }
}
