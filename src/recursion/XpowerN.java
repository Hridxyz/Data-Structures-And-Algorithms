package recursion;

public class XpowerN {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x * power(x, n-1);
    }

    public static int optimisedPower(int x, int n){
        if(n==0){
            return 1;
        }
        int halfPowerSq = optimisedPower(x, n/2) * optimisedPower(x, n/2);
        if (n%2 != 0){
            halfPowerSq *= x;
        }
        return halfPowerSq;
    }
    public static void main(String[] args){
        System.out.print(optimisedPower(2,5));
    }

}
