package recursion;

public class Duplicates {
    public static void removeduplicates(String str, int idx, StringBuilder newstr, boolean[] map){
        if (idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currChar = str.charAt(idx);
        if(map[currChar - 'a']){
            removeduplicates(str, idx+1, newstr, map);
        }
        else {
            map[currChar-'a'] = true;
            removeduplicates(str, idx+1, newstr.append(currChar), map);
        }

    }
    public static void main(String[] args){
        String str = "apnaaccolllegeee";
        removeduplicates(str, 0, new StringBuilder(), new boolean[26]);
    }
}
