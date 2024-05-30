# Lexicographically Smallest String Problem

## Problem Statement

Emma has a string `str` of length `n`, consisting of only the characters 'a' and 'b', and a total of `k` points to spend. She wants to manipulate the string to obtain the lexicographically smallest possible string using the following two operations:
1. **Swap any two characters** in the string, at a cost of 1 point per swap (the characters do not have to be adjacent).
2. **Replace any character** in the string with any lowercase English letter, at a cost of 2 points per replacement.

The goal is to find the lexicographically smallest string possible while using no more than `k` points.

### Input Format:
1. The first line of the input contains two integers `n` and `k` representing the length of the string `str` and the points Emma has respectively.
2. The second line of input contains the string `str` of length `n`.

### Output Format:
- A single line of output contains the lexicographically smallest string obtained.

### Example:

#### Example 1:
**Input:**
```
3 3
bba
```

**Output:**
```
aab
```

**Explanation:**
- We swap `str[0]` and `str[2]` to get `abb`.
- With the 2 remaining points, we replace `str[1]` with `a` to create `aab`, the lexicographically smallest string possible for this case.

#### Example 2:
**Input:**
```
4 2
aabb
```

**Output:**
```
aaab
```

**Explanation:**
- With 2 points, we replace `str[2]` with `a` to get `aaab`.

## Solution

The solution involves using the given points to perform swaps and replacements to achieve the lexicographically smallest string possible.

### Steps to Solve the Problem:

1. **Analyze the Operations:**
   - Swapping any two characters costs 1 point.
   - Replacing a character with 'a' (to achieve the smallest lexicographical order) costs 2 points.

2. **Strategy to Minimize the String:**
   - Prioritize replacements if possible, as changing 'b' to 'a' has a significant impact on making the string smaller.
   - Use swaps wisely to bring 'a' characters forward, but ensure not to exceed the available points.

### Example Walkthrough:

#### Input:
```
3 3
bba
```

1. **Initial String:**
   - `str = bba`
   - `k = 3`

2. **Operations:**
   - Swap `str[0]` and `str[2]`: 
     - `str = abb`
     - Points used: 1
   - Replace `str[1]` with `a`:
     - `str = aab`
     - Points used: 2

**Output: aab**

## Code Implementation

Here is the C++ code implementation for solving this problem:

```cpp
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    string s;
    cin >> s;

    string s2 = s;  // Create a copy of the string
    int k2 = k;     // Copy the points

    // Replace 'b' with 'a' where possible
    for (int j = 0; j < n && k2 >= 2; ++j) {
        if (s2[j] == 'b') {
            s2[j] = 'a';
            k2 -= 2;
        }
    }

    vector<int> b_pos;
    for (int i = 0; i < n; ++i) {
        if (s[i] == 'b') {
            b_pos.push_back(i);
        }
    }

    int i = 0;
    while (k2 > 0 && i < n) {
        if (s2[i] == 'b') {
            bool swapped = false;
            for (int j = n - 1; j > i; --j) {
                if (s2[j] == 'a' && k2 > 0) {
                    swap(s2[i], s2[j]);
                    k2--;
                    swapped = true;
                    break;
                }
            }
            if (!swapped) break;
        }
        i++;
    }

    // Final comparison
    if (s <= s2) {
        cout << s << endl;
    } else {
        cout << s2 << endl;
    }

    return 0;
}
```

### Explanation of the Code:

1. **Reading Input:**
   - Reads the length of the string \( n \) and the number of points \( k \).
   - Reads the input string `s`.

2. **Replacement Operations:**
   - Iterates through the string and replaces 'b' with 'a' as long as there are enough points (2 points per replacement).

3. **Swapping Operations:**
   - Creates a list `b_pos` to store positions of 'b' characters in the original string `s`.
   - Iterates through the string `s2` to perform swaps. For each 'b' found in `s2`, checks from the end of the string backwards to find an 'a' to swap with. Performs the swap if possible and decrements the points.

4. **Output the Result:**
   - Compares the original string `s` and the modified string `s2`. Prints the lexicographically smaller string.

This approach ensures that the string is manipulated to be the smallest possible lexicographical order within the given points.

---
