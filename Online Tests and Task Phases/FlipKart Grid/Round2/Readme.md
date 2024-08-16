# Technical Assessment - Comprehensive Review

This repository contains a collection of technical questions commonly asked during technical assessments. These questions were compiled by directly asking candidates and are intended for study and preparation.

## Source of Questions
These questions were gathered by asking candidates about the questions they encountered during various assessments.

## Disclaimer
Don't refer to my answers. They are mostly wrong. I did not get placed this year, so don't refer to my answers. Cheers!

---

### Q01: Rearranging Array Elements
**Question:** Given an array of integers, `arr`, of size `n`, write a C++ function to rearrange the elements of the array in such a way that all the negative elements come before the positive elements, and the order of elements is maintained.

**Options:**
- A) `void rearrangeArray(int arr[], int n) { // function implementation }`
- B) `int* rearrangeArray(int arr[], int n) { // function implementation }`
- C) `void rearrangeArray(int* arr, int n) { // function implementation }`
- D) `int rearrangeArray(int arr[], int n) { // function implementation }`

---

### Q02: What is an ICO in Web 3.0 Context?
**Question:** What is an "ICO" in Web 3.0 context?

**Options:**
- A) A process of exchanging one cryptocurrency for another
- B) A crowdfunding method where new cryptocurrency tokens are sold to fund a project or venture
- C) The process of validating transactions and adding them to the blockchain
- D) A technology for secure and private communication between blockchain nodes

---

### Q03: Purpose of Dropout Layer
**Question:** What is the purpose of a dropout layer in a neural network?

**Options:**
- A) To prevent overfitting during training by randomly setting a fraction of input units to zero.
- B) To increase the complexity of the model by adding noise to the network.
- C) To reduce the size of the neural network during inference.
- D) To provide a regularization method that eliminates the need for cross-validation.

---

### Q04: Cryptographic Algorithm in Blockchain
**Question:** Which cryptographic algorithm is generally used to generate the hash identifying each block in the blockchain?

**Options:**
- A) SHA512
- B) SHA256
- C) Both of them
- D) None of them

---

### Q05: Minimum Spanning Tree Using Kruskal's Algorithm
**Question:** Consider a network of cities connected by roads, where the distances between the cities are represented by positive integers. You are tasked with finding a minimum spanning tree (MST) for this network using Kruskal's algorithm. What is the total weight of the MST?

**Options:**
- A) Weight calculated based on graph input
- B) Weight calculated based on graph input
- C) Weight calculated based on graph input
- D) Weight calculated based on graph input

---

### Q06: Zero-Knowledge Proofs
**Question:** In zero-knowledge proofs, what does the "zero-knowledge" property refer to?

**Options:**
- A) The proof is computationally expensive.
- B) The proof reveals all the details of the underlying data.
- C) The verifier learns nothing about the underlying data except the validity of the statement being proven.
- D) The proof requires a trusted third party to verify the statement.

---

### Q07: Protected Inheritance in C++
**Question:** Kim is using the concept of class and object to write his code. He creates a class named "Planets" and declares a pure virtual member function in public access and one integer type data member in protected access. He creates classes named "PlanetA" and "PlanetB", all derived from the "Planets" class with the help of protected inheritance. Identify the correct statement.

**Options:**
- A) The integer type data member can be accessed by any of the member functions in the "PlanetA" class.
- B) The integer type data member can be accessed by any of the member functions in the "PlanetB" class.
- C) Another pure virtual function can be declared in PlanetA class.
- D) All of these.

---

### Q08: Stack Operations
**Question:** The condition `top < 1` when `top = 1` is for?

**Options:**
- A) Pop operation
- B) Push operation
- C) Status
- D) None of these

---

### Q09: Maximizing Expression Value
**Question:** Find the maximum value that can be obtained by evaluating the following expression by different parenthesization: `1 + 2 * 3 + 5 * 3 + 4 * 5`

**Options:**
- A) 840
- B) 237
- C) 540
- D) 215

---

### Q10: Declaring Arrays in JavaScript
**Question:** The correct way to declare an array in JavaScript is:

**Options:**
- A) `let shapes = (circle),(rectangle),(square)`
- B) `var shapes = [ (circle),(rectangle),(square)]`
- C) `var shapes = ["circle", "rectangle", "square"]`
- D) `let shapes = “circle”, “rectangle”, “square”`

---

### Q11: Output of C++ Code Snippet
**Question:** Consider the following code snippet in C++. What will be the output of the code?

```cpp
#include<iostream>
using namespace std;
class Base {
public:
    virtual void show() { cout << "In Base \n"; }
};
class Derived: public Base {
public:
    void show() { cout << "In Derived \n"; }
};
int main(void) {
    Base *bp = new Derived;
    bp->show();
    delete bp;
    bp = new Base;
    bp->show();
    delete bp;
    return 0;
}
```

**Options:**
- A) The program will compile but will give a runtime error.
- B) The program will not compile.
- C) The program will output:  
  ```
  In Base
  In Base
  ```
- D) The program will output:  
  ```
  In Derived
  In Base
  ```

---

### Q12: Sorting with Minimum Swaps
**Question:** The numbers 1 through 8 are in an unsorted array. Following sorting, any odd number should be adjacent (to the immediate left or right) to its value + 1. For example, if `arr[i] = 5`, `arr[i-1]` or `arr[i+1]` should include 6. Determine the smallest number of swaps required to sort `arr` as described.

**Array:** `[8, 1, 7, 2, 4, 6, 5, 3]`

**Options:**
- A) 3
- B) 2
- C) 8
- D) 6

---

### Q13: Retrieving Data from a Hash Table
**Question:** You are designing a spell-checker program that suggests possible correct words based on user input. To efficiently retrieve suggestions, you decide to use a hash table. Which of the following code snippets correctly demonstrates the retrieval of suggested words from the hash table?

**Options:**
- A) `suggestions = {}; suggested_words = suggestions.get("input_word")`
- B) `suggestions = {}; suggested_words = suggestions.retrieve("input_word")`
- C) `suggestions = {}; suggested_words = suggestions.find("input_word")`
- D) `suggestions = {}; suggested_words = suggestions.fetch("input_word")`

---

### Q14: Efficient Algorithm for Water Collection
**Question:** There are 'n' number of tanks arranged in a queue, filled with water. You need to collect the maximum amount of water from those tanks such that no two consecutive tanks are used. Also, once you move forward you cannot turn back. Which is the most efficient algorithm to solve this problem?

**Options:**
- A) Dynamic programming
- B) Backtracking
- C) Divide and Conquer
- D) Stack

---

### Q15: N-ary Tree Node Count
**Question:** A complete n-ary tree contains 14 internal nodes and 29 leaf nodes. What is the value of `n`?

**Options:**
- A) 2
- B) 3
- C) 4
- D) 5

---

### Q16: Output of C++ Loop Code
**Question:** What will be the output of the code below?

```cpp
#include <iostream>
using namespace std;
int main() {
    int x = 5;
    for(int i = 1; i < x; i += 3) {
        cout << i--;
    }
    return 0;
}
```

**Options:**
- A) 13
- B) 24
- C) 1234
- D) 135

---

### Q17: Kruskal's Algorithm and Graphs
**Question:** The Kruskal algorithm is a greedy algorithm for finding the minimum spanning tree of a weighted graph. Which of the following is a true statement about the Kruskal algorithm?

**Options:**
- A) The Kruskal algorithm always finds the minimum spanning tree of a weighted graph.
- B) The Kruskal algorithm can only find the minimum spanning tree of a connected graph.
- C) The Kruskal algorithm can find the minimum spanning tree of a disconnected graph, but it may not be unique.
- D) The Kruskal algorithm can find the minimum spanning tree of a directed graph.

---

### Q18: Indegree and Outdegree in Adjacency Matrix
**Question:** You have gifted the following adjacency matrix to your friend:

```
V0 V1 V2 V3 V4 V5
V0 0 1 1 0 1 0
V1 0 0 0 1 0 1
V2 0 0 0 0 0 0
V3 0 1 0 0 0 1
V4 0 1 0 0 0 0
V5 0 0 0 0 0 0
```

**Note:** Outdegree: Total number of leaving vertices is known as outdegree. Indegree: Total number of entering vertices is known as indegree.

**Question:** How many vertices have indegree as 2 and outdegree as 3?

**Options:**
- A) 2 vertices have indegree as 2 and 2 vertices have outdegree as 3.
- B) 1 vertex has indegree as 2 and 3 vertices have outdegree as 3.
- C) 3 vertices have indegree as 2 and 2 vertices have outdegree as 3.
- D) 3 vertices have indegree as 2 and 1 vertex has outdegree as 3.

---

### Q19: Linking Blocks in Blockchain
**Question:** How are blocks linked together in a blockchain?

**Options:**
- A) By their nonce values
- B) By their hash values
- C) By their timestamps
- D) By their transaction data

---

### Q20: Binary Tree Node Calculation
**Question:** Consider a binary tree with 15 nodes. What is the maximum number of nodes that can be present at level 3 of the tree?

**Options:**
- A) 8
- B) 7
- C) 15
- D) 3

---

### Q21: Subset Sum Problem
**Question:** Given a set of integers, is it possible to partition the set into two subsets such that the sum of elements in both subsets is the same?

**Options:**
- A) Yes, always possible
- B) No, not possible
- C) Possible if the total sum is even
- D) Possible if the total sum is odd

---

### Q22: Time Complexity of Binary Search
**Question:** What is the time complexity of Binary Search algorithm?

**Options:**
- A) O(n)
- B) O(log n)
- C) O(n log n)
- D) O(1)

---

### Q23: Hashing Collision Resolution
**Question:** Which of the following methods is used for collision resolution in hashing?

**Options:**
- A) Chaining
- B) Open addressing
- C) Linear probing
- D) All of the above

---

### Q24: Greedy Algorithm for Coin Change
**Question:** Which of the following is true about the greedy algorithm approach to solving the coin change problem?

**Options:**
- A) Greedy algorithm always finds the optimal solution
- B) Greedy algorithm sometimes fails to find the optimal solution
- C) Greedy algorithm is not applicable to the coin change problem
- D) Greedy algorithm is only applicable when coins are in increasing order

---

### Q25: Stack Data Structure
**Question:** In which of the following scenarios is a stack data structure commonly used?

**Options:**
- A) Undo mechanism in text editors
- B) Recursive function calls
- C) Balancing symbols
- D) All of the above

---

### Q26: Queue Data Structure
**Question:** Which of the following is true for a queue data structure?

**Options:**
- A) First In First Out (FIFO)
- B) Last In First Out (LIFO)
- C) First In Last Out (FILO)
- D) Last In First Out (LIFO)

---

### Q27: Output of the Given Code
**Question:** What will be the output of the following C++ code?

```cpp
#include <iostream>
using namespace std;
int main() {
    int x = 10;
    int y = 20;
    cout << "Sum: " << x + y << endl;
    return 0;
}
```

**Options:**
- A) 1020
- B) 30
- C) Sum: 30
- D) Sum: 1020

---

### Q28: Dynamic Programming Approach
**Question:** Which of the following problems can be solved using dynamic programming?

**Options:**
- A) Fibonacci sequence
- B) Shortest path in a graph
- C) Knapsack problem
- D) All of the above

---

### Q29: Graph Traversal Techniques
**Question:** Which of the following graph traversal techniques can be used to traverse all the nodes in a graph?

**Options:**
- A) Breadth-First Search (BFS)
- B) Depth-First Search (DFS)
- C) Both BFS and DFS
- D) Neither BFS nor DFS

---

### Q30: Cryptographic Hash Functions
**Question:** Which of the following is true about cryptographic hash functions?

**Options:**
- A) They are used for encrypting data
- B) They produce a fixed-size output
- C) They are reversible
- D) They require a secret key for operation

---
