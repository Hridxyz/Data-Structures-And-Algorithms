Here is a detailed README file for the given problem:
# Tower Builder Problem

## Problem Statement

You are tasked with constructing a tower using bricks supplied by a supplier over several days. Each day, the supplier provides one brick of a distinct size. The construction of the tower must adhere to specific rules, and your goal is to determine which bricks can be placed on the tower each day.

### Rules for Tower Construction

1. **Larger Bricks at the Bottom:** The brick with a larger size must be placed at the bottom of the tower.
2. **Smaller Bricks at the Top:** The brick with a smaller size must be placed at the top of the tower.
3. **Order of Placement:** You cannot place a new brick on top of the tower until all the larger bricks that have been provided up to that day have been placed.

Given these rules, for each day, you need to identify which bricks can be placed on the tower in descending order of their sizes.

## Input Format

The problem takes the following inputs:

1. **totalDays (int):** An integer `n` representing the total number of days or the total number of bricks.
2. **brickSizes (int[]):** An array of `n` integers where the i-th integer denotes the size of the brick provided on the i-th day.

### Constraints

- \(1 \leq n \leq 100,000\)
- \(1 \leq \text{size of brick} \leq n\)
- All brick sizes are distinct and are within the range `[1, n]`.

## Output Format

The function returns a list of lists. Each list represents the sizes of bricks that can be placed on the tower on a given day. If no bricks can be placed on a specific day, the corresponding list should be empty.

## Example

### Example 1

**Input:**
```plaintext
totalDays = 5
brickSizes = [4, 5, 1, 2, 3]
```

**Output:**
```plaintext
[
  [],
  [5, 4],
  [],
  [],
  [3, 2, 1]
]
```

**Explanation:**

- **Day 1:** The brick of size 4 is given, but it cannot be placed yet because the brick of size 5 hasn't been provided yet.
- **Day 2:** The brick of size 5 is given. Now both bricks of size 5 and 4 can be placed on the tower.
- **Day 3:** The brick of size 1 is given, but it cannot be placed because bricks of size 3 and 2 haven't been provided yet.
- **Day 4:** The brick of size 2 is given, but it cannot be placed because the brick of size 3 hasn't been provided yet.
- **Day 5:** The brick of size 3 is given. Now bricks of size 3, 2, and 1 can be placed on the tower.

### Example 2

**Input:**
```plaintext
totalDays = 1
brickSizes = [1]
```

**Output:**
```plaintext
[
  [1]
]
```

**Explanation:**

- **Day 1:** The only brick of size 1 is given, and it can be placed on the same day.

## Solution Approach

The solution involves using a max-heap (priority queue) and a set to keep track of the bricks that have been provided but not yet placed. The algorithm iterates through the days, determining which bricks can be placed based on the rules, and stores the result for each day.

### Data Structures Used

- **PriorityQueue (Max-Heap):** To efficiently retrieve the largest available brick that can be placed on the tower.
- **HashSet:** To keep track of the bricks that have been received but not yet placed on the tower.

### Algorithm Steps

1. **Initialize Data Structures:**
   - A list of lists to store the results for each day.
   - A priority queue (max-heap) to manage the available bricks.
   - A set to track the bricks that have been received.
   - A variable to track the next largest brick size that needs to be placed.

2. **Iterate Through Days:**
   - For each day, add the brick received that day to the set of received bricks and the priority queue.
   - Check if the largest available brick can be placed. If so, place it and remove it from the queue.
   - Store the list of placed bricks in the result list for that day.

3. **Output the Result:**
   - Convert the list of lists into an appropriate format and return it.

## Code Implementation

```java
import java.util.*;

public class TowerBuilder {
    public static int[][] buildTower(int totalDays, int[] brickSizes) {
        List<List<Integer>> dailyBrickPlacement = new ArrayList<>();
        PriorityQueue<Integer> availableBricks = new PriorityQueue<>(Collections.reverseOrder());
        Set<Integer> receivedBricks = new HashSet<>();
        int nextBrickSize = totalDays;

        for (int day = 0; day < totalDays; day++) {
            dailyBrickPlacement.add(new ArrayList<>());
            receivedBricks.add(brickSizes[day]);
            availableBricks.offer(brickSizes[day]);
            
            while (!availableBricks.isEmpty() && availableBricks.peek() == nextBrickSize) {
                dailyBrickPlacement.get(day).add(availableBricks.poll());
                nextBrickSize--;
            }
            
            Collections.sort(dailyBrickPlacement.get(day), Collections.reverseOrder());
        }

        int[][] result = new int[totalDays][];
        for (int day = 0; day < totalDays; day++) {
            result[day] = dailyBrickPlacement.get(day).stream().mapToInt(Integer::intValue).toArray();
        }

        return result;
    }

    public static void main(String[] args) {
        // Example 1
        int totalDays1 = 5;
        int[] brickSizes1 = {4, 5, 1, 2, 3};
        System.out.println(Arrays.deepToString(buildTower(totalDays1, brickSizes1))); // [[], [5, 4], [], [], [3, 2, 1]]

        // Example 2
        int totalDays2 = 1;
        int[] brickSizes2 = {1};
        System.out.println(Arrays.deepToString(buildTower(totalDays2, brickSizes2))); // [[1]]
    }
}
```

## Conclusion

This problem demonstrates how to effectively use data structures such as priority queues and sets to solve problems involving ordering and placement constraints. The solution approach ensures that the conditions for placing bricks are met, and the code is optimized to handle large inputs efficiently.

---
