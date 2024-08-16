# Technical Assessment - Comprehensive Review

This repository contains a detailed analysis of 24 technical questions that were compiled by collaborating with peers who took part in a recent Online Test (OT). These questions cover various topics including database management, programming logic, network protocols, data structures, and more.

### Source of Questions
These questions were gathered by asking friends and colleagues to recall the questions they encountered during the Online Test. This collective effort has resulted in a comprehensive set of questions that can be used for study and preparation.

## Disclaimer
Don't refer to my answers. They are mostly wrong. And I didnt get placed this year, so dont refer to my answers. Cheers!

## Questions and Solutions

### Q01: Data Structure for Finding Smallest Elements
**Question:** Which data structure is suitable for finding the smallest 'k' elements from the given array in the provided scenario?

**Options:**
- A) Stack
- B) Queue
- C) Priority Queue
- D) Linked List

**Answer:** C

**Explanation:**
A priority queue is used to efficiently find and manage the smallest elements in a collection. By leveraging a min-heap, it ensures that the smallest elements can be accessed and removed in constant time, making it the ideal data structure for this task.

---

### Q02: CNNs in Image Recognition
**Question:** What is a primary advantage of using Convolutional Neural Networks (CNNs) for image recognition tasks?

**Options:**
- A) CNNs are able to process temporal sequences effectively
- B) CNNs are able to recognize local patterns in images due to their hierarchical structure
- C) CNNs are simpler and require less computational resources compared to other neural networks
- D) CNNs are universally superior to other types of neural networks for all types of tasks

**Answer:** B

**Explanation:**
CNNs excel in image recognition because of their ability to automatically detect and learn hierarchical patterns, such as edges, textures, and shapes, which are crucial for understanding visual data.

---

### Q03: Ethernet and Manchester Encoding
**Question:** What will be the bit rate in Ethernet when Manchester encoding is used?

**Options:**
- A) Twice the baud rate
- B) Four times the baud rate
- C) Same as the baud rate
- D) Half the baud rate

**Answer:** A

**Explanation:**
In Manchester encoding, each bit of data is represented by two level transitions. This effectively doubles the baud rate, meaning the bit rate is twice the baud rate.

---

### Q04: Cryptographic Keys
**Question:** Suppose that everyone in a group of N people wants to communicate secretly with the N-1 others using a symmetric key cryptographic system. The communication between any two persons should not be decodable by the others in the group. The number of keys required in the system as a whole to satisfy the confidentiality requirement is:

**Options:**
- A) \( N(N-1)/2 \)
- B) \( 2N \)
- C) \( N(N-1) \)
- D) \( (N-1)^2 \)

**Answer:** A

**Explanation:**
In a symmetric key cryptographic system, for N people to communicate securely, each pair of individuals requires a unique key. The number of unique pairs in a group of N people is given by \( C(N, 2) = \frac{N(N-1)}{2} \).

---

### Q05: Loop Iterations and Final Values
**Question:** What will be the value of `a` and `b` after the 3rd iteration in the code and what is the total number of iterations of the loop?

```cpp
int a = 47, b = 105;

while (a != b && a % b != 0 && b % a != 0) {
    if (a > b)
        a %= b;
    else
        b %= a;
}
```

**Options:**
- A) 3 2, 4 iterations
- B) 1 2, 4 iterations
- C) 47 59, 5 iterations
- D) The loop ends before the 3rd iteration with 2 iterations

**Answer:** A

**Explanation:**
After the 3rd iteration, the values of `a` and `b` are 3 and 2 respectively. The loop will perform a total of 4 iterations.

---

### Q06: Bubble Sorting
**Question:** Given an array [45 21 51 78 4 999 2 11 33], which index or indices are the most swapped in the array in a bubble sorting algorithm with the biggest element being inserted in its place in each iteration?

**Options:**
- A) 1, 3
- B) 10
- C) 2
- D) All indices are equally swapped

**Answer:** B

**Explanation:**
The element at index 10 (999) is the biggest and will be moved to the end during the sorting, so it gets swapped the most.

---

### Q07: Longest Substring Without Repeating Characters
**Question:** Which code snippets should be filled in line 9 and line 11 respectively to find the longest substring without repeating characters?

```cpp
public static int[] findLongestSubstring(String s) {
    int[] charIndexes = new int[128];
    Arrays.fill(charIndexes, -1);
    int maxLength = 0;
    int start = 0;
    int longestStart = 0;
    for (int i = 0; i < s.length(); i++) {
        int charIndex = (int) s.charAt(i);
        if (______) { // Missing syntax
            maxLength = Math.max(maxLength, i - start);
            start = ______; // Missing syntax
        }
        charIndexes[charIndex] = i;
    }
    maxLength = Math.max(maxLength, s.length() - start);
    int longestSubstringStart = longestStart;
    int longestSubstringEnd = longestStart + maxLength;
    return Arrays.copyOfRange(s, longestSubstringStart, longestSubstringEnd);
}
```

**Options:**
- A) `charIndexes[charIndex] != -1` and `start = charIndexes[charIndex] + 1`
- B) `charIndexes[charIndex] != -1` and `start = charIndexes[charIndex]`
- C) `charIndexes[charIndex] == -1` and `start = charIndexes[charIndex] + 1`
- D) `charIndexes[charIndex] == -1` and `start = charIndexes[charIndex]`

**Answer:** A

**Explanation:**
The correct logic to find the longest substring without repeating characters involves checking if the character has been seen before (`charIndexes[charIndex] != -1`). If so, update the start to the index right after the last occurrence of the character (`start = charIndexes[charIndex] + 1`).

---

### Q08: Predict Output of Code Snippet
**Question:** Predict the output of the given C code snippet:

```c
int main() {
    int a = 5;
    int arr[5] = {1, 1, 1, 1, 1};
    for (int i = 0; i < a; i += 2) {
        arr[i] = 2;
    }
    for (int i = 0; i < 5; i++) {
        printf("%d", arr[i]);
    }
    return 0;
}
```

**Options:**
- A) 21112
- B) 22122
- C) 21212
- D) 12211

**Answer:** C

**Explanation:**
The loop modifies the array such that every other element is set to 2, starting from index 0. The final array is {2, 1, 2, 1, 2}.

---

### Q09: Value of Z for Given Output
**Question:** For what value of z will the output be "55555"?

```c
#include <stdio.h>
int main() {
    int z = ?;
    for (int i = 0; i < z; i++) {
        printf("%d", z);
    }
    return 0;
}
```

**Options:**
- A) 5
- B) 6
- C) 4
- D) 8

**Answer:** A

**Explanation:**
To print "55555", the value of z must be 5, so that the loop runs 5 times, printing 5 each time.

---

### Q10: Time Approximation in Parallel Algorithm
**Question:** When you implement the parallel version of the algorithm, which of the following is the closest approximation to the time it will take?

**Scenario:**
Your system contains 16 processing cores and the algorithm you design has a concurrency level of 4 (it breaks down the task into four sub-tasks which can run simultaneously). The original serial version of the algorithm takes T time to run.

**Options:**
- A) T/16
- B) T/4
- C) 14T/16
- D) 16T/4

**Answer:** B

**Explanation:**
With a concurrency level of 4, the task can be split into 4 sub-tasks that can run simultaneously on 4 cores, effectively reducing the time to T/4.

---

### Q11: Naive String Matching
**Question:** You are developing a basic text editor, and one of the essential features is to search for a specific pattern within the given text. You decide to implement the Naive String Matching algorithm for simplicity. Which of the following C++ functions implements the Naive String Matching algorithm?

**Options:**
- A)
```cpp
bool naiveStringMatch(const std::string& text, const std::string& pattern) {
    for (int i = 0; i <= text.length() - pattern.length(); ++i) {
        int j;
        for (j = 0; j < pattern.length(); ++j) {
            if (text[i + j] != pattern[j])
                break;
        }
        if (j == pattern.length())
            return true;
    }
    return false;
}
```
- B)
```cpp
bool naiveStringMatch(const char* text, const char* pattern) {
    int textLen = strlen(text);
    int patternLen = strlen(pattern);
    for (int i = 0; i <= textLen - patternLen; ++i) {
        int j;
        for (j = 0; j < patternLen; ++j) {
            if (text[i + j] != pattern[j])
                break;
        }
        if (j == patternLen)
            return true;
    }
    return false;
}
```

**Answer:** A

**Explanation:**
The Naive String Matching algorithm compares the pattern with every substring of the text. The function in option A correctly implements this logic in C++.

---

### Q12: Priority Queue Sorting
**Question:** Consider the following code snippet:

```cpp
#include <iostream>
#include <vector>
#include <queue>

std::vector<int> process_data(std::vector<int>& data) {
    std::priority_queue<int, std::vector<int>, std::greater<int>> min_heap;
    for (int item : data) {
        min_heap.push(item);
    }
    std::vector<int> result;
    while (!min_heap.empty()) {
        result.push_back(min_heap.top());
        min_heap.pop();
    }
    return result;
}
```

**Scenario:**
Given an input vector `data = {8, 5, 3, 2, 1}`, after processing this data using the above function, what will be the output?

**Options:**
- A) [1, 2, 3, 5, 8]
- B) [8, 5, 3, 2, 1]
- C) [5, 3, 8, 2, 1]
- D) [1, 3, 2, 5, 8]

**Answer:** A

---

### Q13: String Search in Linear Search Algorithm
**Question:** Suppose you are given a string `s = "acdefdca"`. You are searching for the character `d`. You can only perform a linear search. From which element should you start your searching so that you can get the character `d` as early as possible?

**Scenario:**
You are tasked with finding the first occurrence of the character `d` in the string.

**Options:**
- A) Searching from the first element
- B) Searching from the last element
- C) None of these
- D) You can choose either the first element or the last element of the string.

**Answer:** A

---

### Q14: Checking Thread Status in Java
**Question:** What will be the output of the given code snippet?

```java
class football {
    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        if (t.isAlive() == true) {
            System.out.println("seema ");
        } else {
            System.out.println("reema ");
        }
        System.out.println("akku");
    }
}
```

**Scenario:**
You have a Java program where you check the status of the current thread within the `main` method and print messages based on whether the thread is alive.

**Options:**
- A) "seema reema akku"
- B) "seema akku"
- C) "reema akku"
- D) "akku"

**Answer:** B

---

### Q15: Recursive Depth in N-Queens Problem
**Question:** Mia is a Software Developer at TechX Corp. She is implementing a Backtracking algorithm for the N-Queens problem where she must place N queens on an NxN chessboard so that no two queens threaten each other. She wants to find a solution for a 7x7 chessboard. Considering the nature of Backtracking algorithms, how many levels deep will the recursive call stack go, assuming the worst-case scenario?

**Scenario:**
You need to determine the maximum depth of the recursive call stack for solving the N-Queens problem on a 7x7 chessboard.

**Options:**
- A) The depth will be 7 levels.
- B) The depth will be 49 levels.
- C) The depth will be 14 levels.
- D) The depth will be 21 levels.

**Answer:** A

---

### Q16: Merge Sort - First Round of Merging
**Question:** You are a software engineer tasked with implementing a merge sort algorithm to sort a list of integers. After the first splitting phase, you have these lists: `[27, 10]`, `[12, 2]`, `[43, 15]`, `[7, 32]`. You then start the merge phase. After one round of merging, what are the lists you have?

**Scenario:**
You are in the process of implementing merge sort and need to determine the state of the lists after the first round of merging.

**Options:**
- A) `[[10, 27, 2, 12], [15, 43, 7, 32]]`
- B) `[[2, 10, 12, 27], [7, 15, 32, 43]]`
- C) `[[10, 27, 12], [15, 43, 32, 7]]`
- D) `[[10, 12, 27, 43], [2, 7, 15, 32]]`

**Answer:** Bcha


## Conclusion
This repository serves as a valuable study guide for anyone preparing for technical assessments or interviews. The questions cover a broad range of topics and are designed to test various aspects of computer science knowledge.

Feel free to contribute to this repository by adding more questions or improving existing solutions. If you find any discrepancies, please raise an issue.

--- 
