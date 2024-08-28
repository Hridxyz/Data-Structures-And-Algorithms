# Element Swapping Challenge

## Problem Statement

A software development firm is hiring engineers and has designed the following challenge for its online test.

Given an array `arr` that contains `n` integers, the following operation can be performed on it any number of times (possibly zero):

1. Choose any index `i` (`0 ≤ i < n - 1`) and swap `arr[i]` and `arr[i + 1]`.
2. Each element of the array can be swapped at most once during the whole process.

The strength of an index `i` is defined as `(arr[i] * (i + 1))` using 0-based indexing. The objective is to find the maximum possible sum of the strength of all indices after performing the optimal swaps.

Mathematically, the task is to maximize:

\[ \text{Maximize: } \sum_{i=0}^{n-1} arr[i] \times (i + 1) \]

### Example
Consider `n = 4`, `arr = [2, 1, 4, 3]`.

It is optimal to swap `arr[2]` and `arr[3]`, then `arr[0]` and `arr[1]`. The final array becomes `[1, 2, 3, 4]`.

The sum of strengths = `(1 * 1 + 2 * 2 + 3 * 3 + 4 * 4) = 30`, which is the maximum possible. Thus, the answer is 30.

## Function Description

Complete the function `getMaximumSumOfStrengths` in the editor below.

```java
public static long getMaximumSumOfStrengths(List<Integer> arr)
```

### Parameters
- **List<Integer> arr**: A list of integers representing the initial array.

### Returns
- **long**: The maximum possible sum of strengths of all indices after the operations are applied optimally.

### Constraints
- \(1 \leq n \leq 10^5\)
- \(1 \leq arr[i] \leq 10^5\)

### Input Format
- The input consists of an integer `n`, the size of the array, followed by `n` integers representing the array `arr`.

### Output Format
- Output a single integer, the maximum sum of strengths that can be achieved.

## Sample Input
**Input**
```
4
2 1 4 3
```

**Output**
```
30
```

**Explanation**
It is optimal to swap `arr[2]` and `arr[3]`, and `arr[0]` and `arr[1]`. The final array is `[1, 2, 3, 4]`. The sum of strengths is `30`, which is the maximum possible.

## Approach & Solution

### Approach
1. **Initial Calculation**: Start by calculating the initial sum of strengths for the array without any swaps.
2. **Adjacency Consideration**: Iteratively check each pair of adjacent elements and compute the new possible strength sum if they were swapped.
3. **Optimization**: Track the maximum sum found by swapping each adjacent pair. Consider edge cases where no swaps might give the maximum result.
4. **Final Output**: Return the maximum sum of strengths obtained.

### Challenges
- Handling large arrays efficiently within the constraints.
- Ensuring that swapping optimizes the sum without missing potential better swaps.

### Solution Strategy
The primary strategy revolves around iterating through the array to consider each adjacent swap, updating the sum accordingly, and ensuring that the maximum possible sum is captured. This approach aims to balance between simplicity and performance, leveraging the fact that the swap can be performed once for adjacent elements.

### Edge Cases
- Arrays that are already sorted might require no swaps.
- Arrays with repeating elements where swapping does not change the order significantly.
- Large arrays with elements near the upper constraint limit.

---

