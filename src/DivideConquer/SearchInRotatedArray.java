package DivideConquer;

public class SearchInRotatedArray {

    public static int search(int[] arr, int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            return mid;
        }

        // If the left half is normally ordered
        if (arr[si] <= arr[mid]) {
            // Target is in the left half
            if (tar >= arr[si] && tar < arr[mid]) {
                return search(arr, tar, si, mid - 1);
            } else {
                // Target is in the right half
                return search(arr, tar, mid + 1, ei);
            }
        } else {
            // If the right half is normally ordered
            // Target is in the right half
            if (tar > arr[mid] && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            } else {
                // Target is in the left half
                return search(arr, tar, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int tarIdx = search(arr, target, 0, arr.length - 1);
        System.out.print(tarIdx);
    }
}
