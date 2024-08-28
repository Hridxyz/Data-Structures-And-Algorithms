# Special Number Checker

## Problem Statement

Alice loves exploring numbers and discovering interesting patterns. One day, she learns about a cool idea related to numbers and decides to create a simple program to check it out. She wants to see if certain numbers have a special property: **when you square them, the result ends with the original number**.

Alice needs your help to design a program that can explore a bunch of different numbers. For each number, the program should check if it has this special property. If it does, the program should say "Yes"; otherwise, it should say "No". Alice hopes that by using this program, she can better understand these number patterns and maybe even find some new ones!

### Constraints
- \(1 \leq t \leq 1500\)
- \(1 \leq N \leq 10^6\)

### Input Format
- The first input line consists of an integer `t`, the number of distinct numbers.
- The next `t` lines of input consist of `N`, a number.

### Output Format
- Each test case output should determine if the given number has a special property or not. If it is so, print "Yes" and otherwise print "No".

### Sample Input 1:
```
1
5
```

### Sample Output 1:
```
Yes
```

### Explanation 1:
- Number of numbers to be checked: 1
- Number to be checked is 5. As the square of 5 ends with the same number itself, i.e., 25, it will print "Yes" as an output.

### Sample Input 2:
```
2
25
7
```

### Sample Output 2:
```
Yes
No
```

### Explanation 2:
- Number of numbers to be checked: 2
- First number to be checked is 25, and the square of 25 ends with the same number itself, i.e., 625. So, it will print "Yes" as an output.
- Second number to be checked is 7, and the square of 7 does not end with the same number itself, i.e., 49. So, it will print "No" as an output.

## C++ Solution

Here’s a C++ program that solves this problem:

```cpp
#include <iostream>
#include <cmath>

bool hasSpecialProperty(int n) {
    int square = n * n;
    int digits = 1;
    int temp = n;

    // Find the number of digits in the number
    while (temp > 0) {
        digits *= 10;
        temp /= 10;
    }

    // Check if the last digits of the square match the original number
    return (square % digits) == n;
}

int main() {
    int t;
    std::cin >> t;

    while (t--) {
        int n;
        std::cin >> n;

        if (hasSpecialProperty(n)) {
            std::cout << "Yes" << std::endl;
        } else {
            std::cout << "No" << std::endl;
        }
    }

    return 0;
}
```

