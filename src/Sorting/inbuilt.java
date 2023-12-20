package Sorting;
import java.util.Arrays;
import java.util.*;
public class inbuilt {


    public static void main (String[] args) {
        int arr[] = {2, 3, 4, 5, 7, 5, 39, 45};
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr, 3,8);
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        Arrays.sort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
