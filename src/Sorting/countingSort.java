package Sorting;
import java.util.*;
public class countingSort {
    public static void sorting(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int[] count = new int[largest+1];
        for(int i=0; i<arr.length; i++){
            count[arr[i]]++;

        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = { 73, 6, 97, 39, 2, 3784, 792, 33, 2, 1, 97, 88, 6, 3};
        sorting(arr);

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
