package recursion;

public class FriendsPairingProblem {
    public static int friendsPairing(int n){
        if( n == 1 || n==2 ){
            return n;
        }
        int fnm1 = friendsPairing(n-1); //Single
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1) * fnm2;
        return fnm1 + pairWays;
    }
    public static void main(String[] args){
        System.out.print(friendsPairing(3));
    }
}
