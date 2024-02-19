package Sorting;

public class insertionSort {
    public static void Sorting2(int[] arr){
        for( int i=0; i<arr.length-1; i++){
            int curr = i;
            int prev = i-1;
            //Finding of correct position to insert
            while(prev >=0 && arr[prev] > arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
            }

            //insertion
            arr[prev+1] = arr[curr];
        }
    }


    public static void main (String[] args) {
        int[] arr = {2, 3, 4, 5, 7, 5, 39, 45};
        Sorting2(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
