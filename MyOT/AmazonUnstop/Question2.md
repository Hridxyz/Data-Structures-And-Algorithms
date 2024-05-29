# Minimum Cost Subarray Problem

## Problem Statement

You are given two arrays, A and B, both of length N. The task is to find a contiguous subarray in array A such that the sum of its elements is at least K. The cost of selecting a subarray is determined by the sum of the corresponding elements in array B.

### Input Format:
1. The first line contains two integers, N (the length of arrays A and B) and K (the minimum required sum of the elements in the subarray selected from A).
2. The next N lines each contain two integers, representing the elements in arrays A and B:
   - \( A[i] \) (the ith element of array A)
   - \( B[i] \) (the ith element of array B)

### Output Format:
- Print an integer denoting the minimum cost to select a subarray from A whose sum is at least K.

### Example:

#### Example 1:
**Input:**
```
5 12
7 15
9 18
6 10
8 12
5 9
```
- **Array A:** [7, 9, 6, 8, 5]
- **Array B:** [15, 18, 10, 12, 9]
- **K:** 12

**Output:**
```
21
```

**Explanation:**
- The subarray [8, 5] has a sum of 13 which is >= 12.
- The corresponding elements in B are [12, 9].
- The cost is \( 12 + 9 = 21 \), which is the minimum possible cost.

## Solution

The solution involves using the sliding window technique to efficiently find the subarray in A with a sum of at least K and the minimum cost based on the corresponding elements in B.

### Steps:

1. **Initialize Variables:**
   - `minCost`: Set to the maximum integer value to ensure any valid cost found will be smaller.
   - `currentSumA`: Tracks the sum of the current subarray in A.
   - `currentCostB`: Tracks the cost of the current subarray in B.
   - `start`: The starting index of the current subarray.

2. **Iterate Over the End Index of the Subarray:**
   - Add the current element `A[end]` to `currentSumA` and `B[end]` to `currentCostB`.
   - Check if the current subarray's sum (`currentSumA`) is at least K.
   - If so, update `minCost` to be the minimum of the current `minCost` and `currentCostB`.
   - Shrink the subarray from the left by removing the element at the `start` index from `currentSumA` and `currentCostB`, then increment `start`.

### Example Walkthrough:

#### Input:
```
5 12
7 15
9 18
6 10
8 12
5 9
```

- **Initial State:**
  - `minCost = Integer.MAX_VALUE`
  - `currentSumA = 0`
  - `currentCostB = 0`
  - `start = 0`

#### Iterations:
1. **end = 0:**
   - `currentSumA = 7`
   - `currentCostB = 15`
   - `currentSumA < K` (No subarray sum meets K yet)

2. **end = 1:**
   - `currentSumA = 16` (7 + 9)
   - `currentCostB = 33` (15 + 18)
   - `currentSumA >= K`
     - `minCost = 33`
     - Remove `A[0]` (7) and `B[0]` (15)
     - `currentSumA = 9`
     - `currentCostB = 18`
     - `start = 1`

3. **end = 2:**
   - `currentSumA = 15` (9 + 6)
   - `currentCostB = 28` (18 + 10)
   - `currentSumA >= K`
     - `minCost = 28`
     - Remove `A[1]` (9) and `B[1]` (18)
     - `currentSumA = 6`
     - `currentCostB = 10`
     - `start = 2`

4. **end = 3:**
   - `currentSumA = 14` (6 + 8)
   - `currentCostB = 22` (10 + 12)
   - `currentSumA >= K`
     - `minCost = 22`
     - Remove `A[2]` (6) and `B[2]` (10)
     - `currentSumA = 8`
     - `currentCostB = 12`
     - `start = 3`

5. **end = 4:**
   - `currentSumA = 13` (8 + 5)
   - `currentCostB = 21` (12 + 9)
   - `currentSumA >= K`
     - `minCost = 21`
     - Remove `A[3]` (8) and `B[3]` (12)
     - `currentSumA = 5`
     - `currentCostB = 9`
     - `start = 4`

After the loop completes, the `minCost` is found to be 21, which is printed as the result.

## Java Code Implementation

```java
import java.util.Scanner;

public class MinimumCostSubarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
            B[i] = scanner.nextInt();
        }

        scanner.close();

        int minCost = Integer.MAX_VALUE;
        int currentSumA = 0;
        int currentCostB = 0;
        int start = 0;

        for (int end = 0; end < N; end++) {
            currentSumA += A[end];
            currentCostB += B[end];

            while (currentSumA >= K) {
                minCost = Math.min(minCost, currentCostB);

                currentSumA -= A[start];
                currentCostB -= B[start];
                start++;
            }
        }

        System.out.println(minCost);
    }
}
```

## Explanation of the Code:

1. **Reading Input:**
   - The input values are read into arrays A and B.
2. **Sliding Window Technique:**
   - The algorithm maintains a sliding window defined by the `start` and `end` pointers.
   - As `end` increases, elements are added to the current subarray sum and cost.
   - When the subarray sum is at least K, the cost is checked and possibly updated.
   - The `start` pointer is adjusted to try and reduce the subarray size while still maintaining the sum requirement.
3. **Finding Minimum Cost:**
   - The minimum cost is continuously updated as smaller costs are found during the iteration.

This approach ensures that the problem is solved efficiently, using the sliding window technique to find the optimal solution with a time complexity of O(N).
