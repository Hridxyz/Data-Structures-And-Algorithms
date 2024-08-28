# Maximum Sum of Strengths Problem

## Problem Overview

The objective of this problem is to find the maximum possible sum of strengths in an array after performing optimal swaps between adjacent elements. The sum of strengths is defined by the formula:

\[
\text{Sum} = \sum_{i=0}^{n-1} \text{arr}[i] \times (i + 1)
\]

Given an array of integers, you can swap adjacent elements to try and maximize this sum. Each element in the array can only be swapped once.

### Example

**Input:**

```
4
2 1 4 3
```

**Output:**

```
30
```

**Explanation:**

The initial sum without any swaps is `20`. By optimally swapping the elements (e.g., swapping `2` and `4`, then `1` and `3`), the sum can be increased to `30`.

## Approach to the Solution

This problem can be solved efficiently by following these steps:

1. **Initial Sum Calculation (`sum1`)**:
   - Start by calculating the sum of the array with no swaps.
   - This serves as a baseline for comparison.

2. **Even Index Pair Swaps (`sum2`)**:
   - Consider the array as a series of pairs of adjacent elements.
   - For each pair, ensure the larger element is on the right to maximize their contribution to the sum.
   - Calculate the sum after these swaps.

3. **Odd Index Pair Swaps (`sum3`)**:
   - If the array length is odd, consider pairs starting from the second element.
   - Swap adjacent elements where possible, ensuring the larger element is on the right.
   - Calculate the sum after these swaps.

4. **Maximize the Sum**:
   - Compare the results from the initial configuration, the even-index swaps, and the odd-index swaps.
   - The maximum value among these represents the best possible sum.

### Dynamic Programming Explanation

While the solution provided uses a straightforward greedy approach with element swaps, understanding how dynamic programming (DP) could be applied is essential:

- **DP State Definition**: We could define a state `dp[i][j]` representing the maximum sum possible for subarray `arr[i]` to `arr[j]`.
- **State Transition**: Transition between states could involve deciding whether to swap elements or not and calculating the resulting sum.
- **Optimization**: By filling the DP table for various subarrays and lengths, we would ultimately get the optimal solution for the entire array.

However, the provided greedy approach is efficient for this problem's constraints and directly addresses the goal.

## Code Implementation

### Java Code

The following Java code implements the solution using the approach described above:

```java
import java.util.*;

class Result {

    public static long getMaximumSumOfStrengths(List<Integer> arr) {
        int n = arr.size();
        long sum1 = 0, sum2 = 0, sum3 = 0;

        // Calculate initial sum (no swaps)
        for (int i = 0; i < n; i++) {
            sum1 += (i + 1) * arr.get(i);
        }

        // Make a copy of the original array
        List<Integer> brr = new ArrayList<>(arr);

        // Perform swaps in even pairs and calculate sum2
        for (int i = 0; i < n - 1; i += 2) {
            if (arr.get(i) > arr.get(i + 1)) {
                // Swap elements at indices i and i+1
                int temp = arr.get(i);
                arr.set(i, arr.get(i + 1));
                arr.set(i + 1, temp);
            }
        }
        // Calculate sum after even pair swaps
        for (int i = 0; i < n; i++) {
            sum2 += (i + 1) * arr.get(i);
        }

        // Restore arr from brr for the next operation
        arr = new ArrayList<>(brr);

        // Perform swaps in odd pairs (if n is odd) and calculate sum3
        if (n % 2 == 1) {
            for (int i = 1; i < n - 1; i += 2) {
                if (arr.get(i) > arr.get(i + 1)) {
                    // Swap elements at indices i and i+1
                    int temp = arr.get(i);
                    arr.set(i, arr.get(i + 1));
                    arr.set(i + 1, temp);
                }
            }
            // Calculate sum after odd pair swaps
            for (int i = 0; i < n; i++) {
                sum3 += (i + 1) * arr.get(i);
            }
        }

        // Return the maximum sum among the calculated sums
        return Math.max(sum1, Math.max(sum2, sum3));
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        int n = scanner.nextInt();

        // Input array elements
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }

        // Call the function and output the result
        long result = Result.getMaximumSumOfStrengths(arr);
        System.out.println(result);

        scanner.close();
    }
}
```

### Explanation

- **Initial Sum Calculation (`sum1`)**: Computes the initial sum of the array without any swaps.
- **Even Pair Swaps (`sum2`)**: Swaps elements in even-index pairs to maximize their contribution to the sum.
- **Odd Pair Swaps (`sum3`)**: Performs similar swaps on odd-index pairs if the array length is odd.
- **Maximum Sum**: The maximum of `sum1`, `sum2`, and `sum3` is returned as the final answer.

### Running the Solution

1. **Compile the Program**: 
   ```bash
   javac Solution.java
   ```
   
2. **Run the Program**: 
   ```bash
   java Solution
   ```

3. **Input**: 
   - The first input is an integer `n` representing the number of elements in the array.
   - The next `n` inputs are the elements of the array.

4. **Output**: 
   - The program prints the maximum possible sum of strengths after performing optimal swaps.

### Example Execution

**Input:**
```
4
2 1 4 3
```

**Output:**
```
30
```

## Conclusion

This problem offers a practical application of array manipulation and optimization strategies. Understanding and implementing the solution provides insight into problem-solving techniques such as greedy algorithms and dynamic programming, helping to build foundational skills in algorithm design.

