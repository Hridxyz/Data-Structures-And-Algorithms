# Unique Hamiltonian Cycle Counter

## Problem Statement

A **Hamiltonian Cycle** is a closed path in a graph that visits each vertex exactly once, except for the source vertex, which is visited twice (since it is also the destination vertex). The task is to determine the number of unique Hamiltonian cycles present in a graph.

Given an \(n \times n\) binary matrix representing the adjacency matrix of a graph, where `graph[i][j] = 1` indicates an edge between the \(i^{th}\) and \(j^{th}\) vertices, your task is to find and print the count of the number of unique Hamiltonian cycles in the graph.

### Notes:
- If \(n = 0\), print `-1`.

## Input Format

The input consists of two parts:
1. The first line contains a single integer \(n\) representing the number of vertices in the graph.
2. The second line contains \(n \times n\) elements representing the adjacency matrix of the graph in serialized format (a single line).

### Example:
- **Input:**
  ```
  6
  0 1 0 0 1 1 1 0 0 1 0 0 1 0 1 0 1 0 1 1 0 1 0 1 0 1 0 0 1 0 1 0 1 0 1 0
  ```
- **Explanation:**
  The above input corresponds to the following adjacency matrix:
  ```
  0 1 0 0 1 1
  1 0 0 1 0 0
  0 0 1 0 1 0
  0 1 0 0 0 1
  1 0 1 0 0 1
  1 0 0 1 1 0
  ```

## Output Format

The output is a single integer representing the count of unique Hamiltonian cycles in the graph.

### Example:
- **Output:**
  ```
  3
  ```

## Constraints

- \(0 \leq n < 500\)

## Example Walkthrough

### Example 1:
- **Input:**
  ```
  6
  0 1 0 0 1 1 1 0 0 1 0 0 1 0 1 0 1 0 1 1 0 1 0 1 0 1 0 0 1 0 1 0 1 0 1 0
  ```
- **Output:**
  ```
  3
  ```

**Explanation:**

For the given input matrix:
```
0 1 0 0 1 1
1 0 0 1 0 0
0 0 1 0 1 0
0 1 0 0 0 1
1 0 1 0 0 1
1 0 0 1 1 0
```
The graph represented by this matrix has 3 unique Hamiltonian cycles:
- 0 → 1 → 3 → 4 → 5 → 0
- 0 → 1 → 3 → 5 → 4 → 0
- 0 → 4 → 3 → 1 → 2 → 5 → 0

### Example 2:
- **Input:**
  ```
  3
  0 1 1 1 0 1 1 1 0
  ```
- **Output:**
  ```
  1
  ```

**Explanation:**
The graph for this input has only 1 unique Hamiltonian cycle:
- 0 → 1 → 2 → 0

## Implementation Details

The solution to this problem can be implemented using backtracking. The algorithm should explore all possible paths starting from each vertex and check whether a Hamiltonian cycle can be formed. To avoid counting the same cycle multiple times, cycles are counted in one direction only, and the total count is divided by 2.

### Pseudocode:
1. Initialize a counter to zero.
2. For each vertex, perform a depth-first search (DFS) to explore all possible paths.
3. If a valid Hamiltonian cycle is found, increment the counter.
4. After exploring all possible paths, print half of the counter value as the final result.

### Edge Cases:
- If \(n = 0\), print `-1` as the output.
- Ensure that cycles are not counted more than once by avoiding redundant paths.

## Solution Code

Below is the Java implementation of the solution:

```java
import java.util.*;

public class HamiltonianCycleCounter {
    private int n;
    private int[][] graph;
    private boolean[] visited;
    private int count;

    public HamiltonianCycleCounter(int[][] graph) {
        this.n = graph.length;
        this.graph = graph;
        this.visited = new boolean[n];
        this.count = 0;
    }

    private void countHamiltonianCycles(int pos, int start, int depth) {
        // If all vertices are visited and there is an edge back to the start vertex
        if (depth == n && graph[pos][start] == 1) {
            count++;
            return;
        }

        visited[pos] = true;

        // Explore all possible vertices from the current position
        for (int next = 0; next < n; next++) {
            if (!visited[next] && graph[pos][next] == 1) {
                countHamiltonianCycles(next, start, depth + 1);
            }
        }

        // Backtrack
        visited[pos] = false;
    }

    public int getHamiltonianCycleCount() {
        for (int i = 0; i < n; i++) {
            countHamiltonianCycles(i, i, 1);
            visited[i] = true;  // Prevent reusing this start vertex
        }

        // Since each cycle is counted twice (once in each direction), divide by 2
        return count / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        if (n == 0) {
            System.out.println("-1");
            return;
        }
        
        int[][] graph = new int[n][n];
        
        for (int i = 0; i < n * n; i++) {
            graph[i / n][i % n] = scanner.nextInt();
        }
        
        HamiltonianCycleCounter counter = new HamiltonianCycleCounter(graph);
        int result = counter.getHamiltonianCycleCount();
        System.out.println(result);
    }
}
```

### Usage

1. **Input:** 
   - Provide the input in the specified format either through standard input or by modifying the input section of the provided code.

2. **Output:**
   - The output will be an integer, the count of unique Hamiltonian cycles in the graph.

## Conclusion

This problem tests the ability to apply graph traversal techniques, specifically backtracking, to solve a problem involving cycles in a graph. The constraints ensure that a solution should be optimized for both time and space, especially given the possible large size of the graph.

---