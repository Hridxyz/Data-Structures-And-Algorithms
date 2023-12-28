package Strings;
// convert "aaabbcccdd" to "a3b2c3d2"
public class String_Compression {
    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < str.length();i++){
            int count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count > 1){
                newStr.append(Integer.toString(count));
            }
        }
        return newStr.toString();
    }
    public static void main(String args[]){
        String str = "aaabbbcccsddfffffff";
        System.out.println(compress(str));
    }
}