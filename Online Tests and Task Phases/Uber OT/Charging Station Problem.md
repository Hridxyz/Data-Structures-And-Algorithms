### README

---

## Problem Statement

Uber has a fleet of electric vehicles (EVs), each with varying battery capacities and different states of charge upon arriving at a charging station. The station can configure the charging speed of the port in kilowatts per hour (kWh).

Given an array `batteries`, where each element represents the kilowatt-hour (kWh) needed to fully charge each corresponding EV, and the total number of available hours `hours`, determine the minimum charging speed (in kWh per hour) required at the charging station so that all EVs can be fully charged within the allotted hours. This optimization helps in reducing operational costs and improving energy efficiency.

**Note:** Once an EV begins charging at a port, it will occupy the charging port for the entire hour, even if it reaches full capacity before the hour is up.

---

## Input

- **batteries**: An array of integers where `batteries[i]` represents the kWh needed to fully charge the `i-th` EV.
- **hours**: An integer denoting the total number of hours all EVs must be fully charged by.

### Constraints

- `1 <= len(batteries) <= 10^5`
- `1 <= batteries[i] <= 10^9`
- `1 <= hours <= 10^9`

---

## Output

Return the minimum integer `chargingSpeed` (kWh per hour) such that all EVs can be fully charged within `hours`.

---

## Example

### Input
```plaintext
batteries = [120, 180, 240, 60]
hours = 6
```

### Output
```plaintext
chargingSpeed = 120
```

### Explanation

- **EV with 240 kWh:** Requires 2 hours at a speed of 120 kWh/hour.
- **EV with 180 kWh:** Requires 2 hours at a speed of 120 kWh/hour.
- **EV with 120 kWh:** Requires 1 hour at a speed of 120 kWh/hour.
- **EV with 60 kWh:** Requires 1 hour at a speed of 120 kWh/hour.

The total is 6 hours, which fits perfectly within the 6-hour limit.

---

## Solution Approach

1. **Binary Search:** 
   - Use binary search to find the minimum charging speed.
   - Set the initial range from 1 to the maximum value in the `batteries` array.
   - For each mid-point of the range, check if the speed allows charging all EVs within the given `hours`.

2. **Feasibility Check:** 
   - Calculate the total hours required for a given charging speed.
   - If the total hours exceed the available `hours`, the charging speed is not feasible.

---

## Java Implementation

```java
public class ChargingStation {

    public int minChargingSpeed(int[] batteries, int hours) {
        int low = 1;
        int high = getMax(batteries);
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (canChargeAll(batteries, hours, mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
        
        return low;
    }

    private int getMax(int[] batteries) {
        int max = batteries[0];
        for (int battery : batteries) {
            if (battery > max) {
                max = battery;
            }
        }
        return max;
    }

    private boolean canChargeAll(int[] batteries, int hours, int speed) {
        int totalHours = 0;
        for (int battery : batteries) {
            totalHours += Math.ceil((double) battery / speed);
            if (totalHours > hours) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ChargingStation station = new ChargingStation();
        int[] batteries = {120, 180, 240, 60};
        int hours = 6;
        System.out.println("Minimum Charging Speed: " + station.minChargingSpeed(batteries, hours));
    }
}
```

---
