package PrimeNumbers;

import PrimeNumbers.primeNumberFunction;

public class Primes_in_a_range {
    public static void primes(int n){
        for(int i=2; i<=n;i++){
            if(primeNumberFunction.isPrime(i)){
                System.out.print(i+" ");
            }

        }
    }
}
