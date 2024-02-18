package recursion;

public class lastoccurance {
    public static int check(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        int isFound = check(arr, key, i+1);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args){
        int[] arr = {1,3,4,7,3,7,8,3};
        System.out.print(check(arr, 3, 0));
    }
}
