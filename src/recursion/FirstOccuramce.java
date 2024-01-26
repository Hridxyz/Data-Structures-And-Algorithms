package recursion;

public class FirstOccuramce {
    public static int check(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return check(arr, key, i+1);
    }
    public static void main(String[] args){
        int arr[] = {1,3,4,7,3,7,8,3};
        System.out.print(check(arr, 7, 0));
    }
}
