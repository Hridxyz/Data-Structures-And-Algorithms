# Increment Each Digit of a Number by 1

## Problem Statement

Write a program that accepts an integer `N` as input and increments each digit of the number by 1. The program should handle the wrap-around case where if a digit is `9`, it should increment to `0`. The final result should be the number formed by these incremented digits.

### Example

- **Input:** `N = 123`
- **Output:** `234`

- **Input:** `N = 789`
- **Output:** `890`

### Constraints
- `1 <= N <= 1,000,000`
- The input `N` will be a positive integer.

---

## Approach

### Step-by-Step Solution

1. **Extract Each Digit:**
   - Extract the least significant digit (rightmost) using the modulus operation (`digit = N % 10`).
   - Remove this digit from the number `N` by performing integer division by 10 (`N = N / 10`).

2. **Increment the Digit:**
   - Increment the extracted digit by 1 (`digit = (digit + 1)`).
   - Handle the case where `digit` becomes `10` by using the modulus operation (`digit = (digit + 1) % 10`).

3. **Form the New Number:**
   - Accumulate the new digits into the result by maintaining a `multiplier` that increases tenfold for each digit (`multiplier *= 10`).
   - Add the incremented digit to the result (`X = X + digit * multiplier`).

4. **Return the Result:**
   - The loop continues until the number `N` becomes 0.
   - Return the final result `X`.

### Implementation

```cpp
#include <iostream>
using namespace std;

int printResult(int N) {
    int X = 0;
    int multiplier = 1;

    while (N > 0) {
        int digit = N % 10;  // Extract the digit
        N = N / 10;          // Remove the extracted digit
        digit = (digit + 1) % 10; // Increment digit and handle wrap-around
        X = X + digit * multiplier; // Form the new number
        multiplier *= 10;    // Update multiplier
    }

    return X;
}

int main() {
    int N;
    cin >> N;
    cout << printResult(N);
    return 0;
}
```

---

## Testing the Program

### Test Cases

1. **Simple Case:**
   - **Input:** `N = 123`
   - **Output:** `234`
   - **Explanation:** Each digit is incremented by 1.

2. **Wrap-around Case:**
   - **Input:** `N = 789`
   - **Output:** `890`
   - **Explanation:** Digit `9` wraps around to `0`.

3. **Maximum Bound:**
   - **Input:** `N = 999999`
   - **Output:** `000000`
   - **Explanation:** All digits `9` wrap around to `0`.

4. **Single Digit Case:**
   - **Input:** `N = 7`
   - **Output:** `8`
   - **Explanation:** A single digit is incremented by 1.

### Edge Cases

- **Minimum Input:**
  - **Input:** `N = 1`
  - **Output:** `2`
  - **Explanation:** Test the lower bound.

- **Upper Bound Test:**
  - **Input:** `N = 1000000`
  - **Output:** `1111111`
  - **Explanation:** The edge case for maximum `N`.

---
