package recursion;

public class sum {
    public static int Calsum (int n){
        if(n==1){
            return 1;
        }
        int sum1 = Calsum(n-1);
        int Sn = n + sum1;
        return Sn;
    }
    public static void main(String[] args){

        System.out.println(Calsum(10));
    }
}
