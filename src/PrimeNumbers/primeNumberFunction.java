package PrimeNumbers;

import java.util.*;
public class primeNumberFunction {
    public static boolean isPrime(int n){
        if (n==2) {
            return true;
        } else {
            for (int i=2; i<=Math.sqrt(n); i++){
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true; // This will execute if no factors are found
    }

    public static void main (String[] args){
        int n=12;
        System.out.println(isPrime(n));

    }
}
