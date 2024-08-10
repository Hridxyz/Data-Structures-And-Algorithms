# Football Club Team Formation Problem

## Problem Description

In a football club, there are `n` players, each with a specific rating. Harsh, a member of the club, has been tasked with forming teams such that:

- The difference in ratings between any two players within a team does not exceed 5.
- The number of teams formed does not exceed `m`.

The objective is to determine the maximum number of players that can be grouped into valid teams under these constraints.

### Input

- The first line of input contains two integers:
  - `n`: The number of players (`1 ≤ n ≤ 10^4`).
  - `m`: The maximum number of teams that can be formed (`1 ≤ m ≤ 10^3`).
- The second line contains `n` integers representing the ratings of the players (`1 ≤ Pi ≤ 10^5`), where `Pi` is the rating of the `i-th` player.

### Output

- A single integer representing the maximum number of players that can be grouped into valid teams under the given constraints.

### Example

#### Input:
```
6 2
33 5 8 20 17 3
```

#### Output:
```
5
```

#### Explanation:

- Team 1: Players with ratings [3, 5, 8] can be grouped together as the difference between each pair is ≤ 5.
- Team 2: Players with ratings [17, 20] can be grouped together as the difference between them is ≤ 5.

Only 5 players can be grouped into 2 teams.

## Solution Approach

### Greedy Approach with Sliding Window:

1. **Sort the Ratings**: 
   - Sorting helps in grouping players with close ratings together.

2. **Sliding Window**:
   - A sliding window is used to group players such that the difference in their ratings is ≤ 5.
   - The window is expanded to include as many players as possible under this constraint.

3. **Team Formation**:
   - As players are grouped into teams, track the number of players in each team.
   - Ensure that the total number of teams does not exceed `m`.

4. **Handling Edge Cases**:
   - If the exact number of `m` teams cannot be formed, maximize the number of players in the last valid group.

### Complexity

- **Time Complexity**: `O(n log n)` due to sorting.
- **Space Complexity**: `O(1)` additional space, aside from the input storage.

## Code Implementation

```java
import java.util.*;

public class Main {
    public static int maxPlayers(int n, int m, int[] ratings) {
        Arrays.sort(ratings);
        int maxPlayers = 0;
        int teamCount = 0;
        int i = 0;

        while (i < n) {
            int j = i;
            // Expand the window to include as many players as possible within the rating difference constraint
            while (j < n && ratings[j] - ratings[i] <= 5) {
                j++;
            }
            
            // Players in this segment
            maxPlayers += (j - i);
            teamCount++;
            i = j;
            
            // If the number of teams formed reaches m, check if we can form more teams
            if (teamCount == m) {
                // Count remaining players that cannot be grouped in additional teams
                int remainingPlayers = n - i;
                if (remainingPlayers > 0) {
                    int maxInLastGroup = 0;
                    for (int k = 0; k < remainingPlayers; k++) {
                        int l = k;
                        while (l < remainingPlayers && ratings[i + l] - ratings[i + k] <= 5) {
                            l++;
                        }
                        maxInLastGroup = Math.max(maxInLastGroup, l - k);
                        k = l - 1;
                    }
                    maxPlayers += maxInLastGroup;
                }
                break;
            }
        }
        
        return maxPlayers;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ratings = new int[n];
        
        for (int i = 0; i < n; i++) {
            ratings[i] = sc.nextInt();
        }
        
        System.out.println(maxPlayers(n, m, ratings));
        
        sc.close();
    }
}
```
This solution uses a greedy approach to form teams. It iterates over the ratings array, grouping players