# Reconstructing Damaged Data - Chernobyl Nuclear Disaster Scenario

## Problem Overview

The Chernobyl disaster occurred on April 26, 1986, at the No. 4 reactor in the Chernobyl Nuclear Power Plant. In terms of both cost and casualties, it remains one of the most devastating nuclear disasters in history.

After the tragedy, scientists retrieved a large number of important documents from the site, which contained nuclear power emission data in `N` rows and `M` columns. This information represented the power emitted by a nuclear reactor on an hourly basis during 5-hour periods. However, due to the catastrophe, some of the numbers became illegible, and are represented as `-1` in the dataset.

Scientists need to reconstruct the missing data by using the rest of the data from that column. You need to help them by developing a program that detects the minimum number in a column and replaces the missing data (indicated by `-1`) with the minimum value from that column.

## Constraints

- \( 1 \leq N, M \leq 10^6 \)
- `-1` represents the damaged space. It should be considered as missing data.
- The program should be optimized to handle large datasets efficiently.

## Input Format

- The first line of input contains two integers, `N` and `M`, where `N` is the number of nuclear reactors, and `M` is the number of hours.
- The next `N` lines of input contain `M` integers, each separated by a single white space.

## Output Format

- The output should consist of `N` rows, with `M` integers in each row, separated by spaces. Each `-1` in the dataset should be replaced by the minimum value of its respective column.

## Example

### Sample Input
```
4 4
2 4 6 -1
1 4 -1 6
7 5 8 6
3 -1 6 7
```

### Sample Output
```
2 4 6 6
1 4 6 6
7 5 8 6
3 4 6 7
```

## Explanation

In this example:
- The minimum value in the 1st column is `1`.
- The minimum value in the 2nd column is `4`.
- The minimum value in the 3rd column is `6`.
- The minimum value in the 4th column is `6`.

Each `-1` in the input matrix is replaced by the minimum value of its column.

## Approach

### 1. Reading the Input
- Start by reading the dimensions `N` and `M`.
- Then, read the `N x M` matrix, storing it in a 2D array.

### 2. Finding the Minimum Values
- For each column in the matrix:
  - Traverse through the column to find the minimum value, ignoring the `-1` entries.
  - Store the minimum value found.

### 3. Replacing the Missing Data
- Once the minimum value for a column is known, traverse the column again.
- Replace every `-1` in that column with the corresponding minimum value.

### 4. Output the Result
- Finally, print the modified matrix where all `-1` values have been replaced by the minimum value from their respective columns.

## Code Implementation

Below is an example of how this problem can be implemented in C++:

```cpp
#include <iostream>
#include <climits>  // For INT_MAX
using namespace std;

void result(int** values, int rows, int cols) {
    // Iterate over each column
    for (int j = 0; j < cols; j++) {
        int min_val = INT_MAX;

        // Traverse the column, find min value and replace -1 with min found so far
        bool found_min = false;
        for (int i = 0; i < rows; i++) {
            if (values[i][j] != -1) {
                min_val = min(min_val, values[i][j]);
                found_min = true;
            }
        }

        // If min_val is still INT_MAX, it means all values in the column are -1
        if (!found_min) {
            min_val = -1;  // Replace all -1 with -1 itself (no changes)
        }

        for (int i = 0; i < rows; i++) {
            if (values[i][j] == -1) {
                values[i][j] = min_val;
            }
        }
    }

    // Output the modified matrix
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            if (j > 0) cout << " ";
            cout << values[i][j];
        }
        cout << endl;
    }
}

int main() {
    int n, m;
    cin >> n >> m;
    
    // Allocate memory for the 2D array
    int** a = new(nothrow) int*[n];  // Use nothrow to avoid exception on failure
    if (a == nullptr) {
        cerr << "Memory allocation failed!" << endl;
        return 1;
    }
    
    for (int i = 0; i < n; i++) {
        a[i] = new(nothrow) int[m];
        if (a[i] == nullptr) {
            cerr << "Memory allocation failed!" << endl;
            return 1;
        }
    }

    // Reading the matrix
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            cin >> a[i][j];
        }
    }

    result(a, m, n);

    // Free the allocated memory
    for (int i = 0; i < n; i++) {
        delete[] a[i];
    }
    delete[] a;

    return 0;
}
```

