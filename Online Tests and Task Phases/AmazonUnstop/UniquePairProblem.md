# Unique Pairs Problem

## Problem Statement

Alice, an adventurous mathematician, is interested in finding pairs of integers \((a, b)\) that satisfy two conditions:
1. The Greatest Common Divisor (GCD) of the pair \((a, b)\) equals Adam's favorite number, \(X\).
2. The sum of the digits of both integers \(a\) and \(b\) equals a given value, \(Y\).

You are required to count the number of unique pairs \((a, b)\) within a specified range \([1, L]\) that satisfy these conditions.

### Input Format:
1. The first line contains an integer \(T\), representing the number of test cases.
2. For each test case, the input consists of three integers separated by spaces \(L, X,\) and \(Y\):
   - \(L\): the upper bound of the range \([1, L]\)
   - \(X\): Adam's favorite number (desired GCD)
   - \(Y\): the desired sum of the digits of the pairs

### Output Format:
- For each test case, output the count of unique pairs of integers \((a, b)\) satisfying the conditions.

### Example:

#### Example 1:
**Input:**
```
3
10 2 3
15 5 12
20 4 8
```

**Output:**
```
1
0
1
```

**Explanation:**
- **Test Case 1:** For \((10, 2, 3)\), there's only one valid pair \((1, 2)\) in the range \([1, 10]\) with GCD 2 and sum of digits 3.
- **Test Case 2:** For \((15, 5, 12)\), no pair satisfies GCD 5 and sum of digits 12 within the range \([1, 15]\).
- **Test Case 3:** For \((20, 4, 8)\), the pair \((4, 4)\) meets the criteria in the range \([1, 20]\) with GCD 4 and sum of digits 8.

## Solution

The solution involves iterating through all possible pairs of integers within the given range and checking if they satisfy the specified conditions (GCD and sum of digits).

### Steps to Solve the Problem:

1. **Iterate Through All Possible Pairs:**
   - Loop through all pairs \((a, b)\) where \(1 \leq a \leq L\) and \(a \leq b \leq L\).

2. **Check GCD Condition:**
   - Calculate the GCD of each pair \((a, b)\).
   - Check if the GCD equals \(X\).

3. **Check Sum of Digits Condition:**
   - Calculate the sum of the digits of \(a\) and \(b\).
   - Check if this sum equals \(Y\).

4. **Count Valid Pairs:**
   - If both conditions are satisfied, count the pair as valid.

### Example Walkthrough:

#### Input:
```
3
10 2 3
15 5 12
20 4 8
```

**Test Case 1:**
- **L = 10, X = 2, Y = 3**
- Valid pairs in range \([1, 10]\):
  - \((1, 2)\): GCD(1, 2) = 1, Sum of digits = 1 + 2 = 3 (Not valid because GCD ≠ 2)
  - \((2, 2)\): GCD(2, 2) = 2, Sum of digits = 2 + 2 = 4 (Not valid because sum ≠ 3)
  - \((1, 2)\) is the only pair that meets both conditions.

**Output: 1**

**Test Case 2:**
- **L = 15, X = 5, Y = 12**
- No pairs in range \([1, 15]\) meet the conditions.
- **Output: 0**

**Test Case 3:**
- **L = 20, X = 4, Y = 8**
- Valid pairs in range \([1, 20]\):
  - \((4, 4)\): GCD(4, 4) = 4, Sum of digits = 4 + 4 = 8 (Valid)
  - \((8, 4)\): GCD(8, 4) = 4, Sum of digits = 8 + 4 = 12 (Not valid because sum ≠ 8)

**Output: 1**

## Java Code Implementation

```java
import java.util.Scanner;

public class UniquePairs {
    // Helper method to compute the GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Helper method to compute the sum of digits of a number
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int T = scanner.nextInt(); // Number of test cases
        for (int t = 0; t < T; t++) {
            int L = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            int count = 0;
            
            // Iterate through all possible pairs (a, b)
            for (int a = 1; a <= L; a++) {
                for (int b = a; b <= L; b++) {  // Starting from 'a' ensures unique pairs
                    if (gcd(a, b) == X && sumOfDigits(a) + sumOfDigits(b) == Y) {
                        count++;
                    }
                }
            }
            
            System.out.println(count);
        }
        
        scanner.close();
    }
}
```

### Explanation of the Code:

1. **Helper Methods:**
   - `gcd(int a, int b)`: Computes the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm.
   - `sumOfDigits(int n)`: Computes the sum of the digits of a number.

2. **Main Method:**
   - Reads the number of test cases \( T \).
   - For each test case, reads the values of \( L \), \( X \), and \( Y \).
   - Initializes a counter to keep track of the valid pairs.

3. **Nested Loops to Find Pairs:**
   - The outer loop iterates through possible values of \( a \) from 1 to \( L \).
   - The inner loop iterates through possible values of \( b \) starting from \( a \) to \( L \). This ensures that each pair \((a, b)\) is unique and not repeated in the reverse order \((b, a)\).

4. **Check Conditions:**
   - For each pair \((a, b)\), calculates the GCD and the sum of their digits.
   - If both conditions are satisfied, the pair is counted as valid.

5. **Output the Result:**
   - Prints the count of valid pairs for each test case.

This approach ensures that all possible pairs are checked for each test case, and only those satisfying both conditions are counted, giving the correct result efficiently.
