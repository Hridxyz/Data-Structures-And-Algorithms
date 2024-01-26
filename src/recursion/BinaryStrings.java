package recursion;

public class BinaryStrings {
    public static void BinaryStringsProblem(int n, int lastPlace, String str){
            if ( n==0 ){
                System.out.println(str);
                return;
            }
            BinaryStringsProblem(n-1, 0, str+"0");
            if(lastPlace == 0){
                BinaryStringsProblem(n-1, 1, str+"1");
            }
    }
    public static void main(String[] args){
        BinaryStringsProblem(3,0, "");
    }
}
