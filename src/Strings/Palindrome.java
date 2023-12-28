package Strings;

public class Palindrome {
    public static boolean CheckPal(String A){
        for (int i=0;i<A.length(); i++) {
            if (A.charAt(i) != A.charAt(A.length() - i - 1)) {
                System.out.println("Not Pallindrome");
                return false;
            }
        }
        System.out.println("Pallindrome");
        return true;
    }
    public static void main (String args[]){
        String A = "NOhjjON";
        CheckPal(A);
    }
}
