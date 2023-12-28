package Strings;

public class String_Builder  {
    public static void main (String args []) {
    StringBuilder sb = new StringBuilder();
        for(char ch='a'; ch<='z'; ch++) {
        sb.append(ch);
    }
    //O(26) for this
        //for old method 0(n^2)
    System.out.println(sb);
    }
}
