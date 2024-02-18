package Sorting;

public class selectionSort {
    public static void Sorting(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if (arr[minPos] > arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main (String[] args) {
        int[] arr = {2, 99, 4, 5, 7, 5, 39, 45};
        Sorting(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
