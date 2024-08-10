Certainly! Below is a detailed README file formatted for GitHub, including all questions, options, codes, and necessary diagrams.

---

# Technical Assessment - Comprehensive Review

This repository contains a detailed analysis of 31 technical questions that were compiled by collaborating with peers who took part in a recent Online Test (OT). These questions cover various topics including database management, programming logic, network protocols, data structures, and more.

### Source of Questions
These questions were gathered by asking friends and colleagues to recall the questions they encountered during the Online Test. This collective effort has resulted in a comprehensive set of questions that can be used for study and preparation.

## Questions and Solutions

### Q01: Functional Dependencies and Candidate Keys
Consider a relation scheme R = (A, B, C, D, E, F) on which the following functional dependencies hold:
- A → B
- BC → D
- E → C
- D → A

What are the candidate keys of R?

**Options:**
- A) AEF, BEF, BCF
- B) AEF, BE, DE
- C) AEF, BEF, DEF
- D) AE, BE

**Answer:** C

### Q02: SQL Assertions
Which of the following statements is correct for the assertion, which enforces a constraint that the number of boats plus the number of sailors should be less than 100?

**Options:**
- A) `CREATE ASSERTION smallClub CHECK (SELECT COUNT(B.bid) FROM Boats B) < 100;`
- B) `CREATE ASSERTION smallClub CHECK ((SELECT COUNT(S.sid) FROM Sailors S) + (SELECT COUNT(B.bid) FROM Boats B) < 100);`
- C) `CREATE ASSERTION smallClub CHECK B.bid < 100;`
- D) `CREATE ASSERTION smallClub CHECK ((SELECT COUNT(B.bid) FROM Boats B) + (SELECT COUNT(S.sid) FROM Sailors S) < 100);`

**Answer:** B

### Q03: Ethernet and Manchester Encoding
What will be the bit rate in Ethernet when Manchester encoding is used?

**Options:**
- A) Twice the baud rate
- B) Four times the baud rate
- C) Same as the baud rate
- D) Half the baud rate

**Answer:** A

### Q04: Cryptographic Keys
Suppose that everyone in a group of N people wants to communicate secretly with the N-1 others using a symmetric key cryptographic system. The communication between any two persons should not be decodable by the others in the group. The number of keys required in the system as a whole to satisfy the confidentiality requirement is:

**Options:**
- A) \( N(N-1)/2 \)
- B) \( 2N \)
- C) \( N(N-1) \)
- D) \( (N-1)^2 \)

**Answer:** A

### Q05: Packet Switching Network
Consider a packet switching network in which packets are routed from source to destination along a single path having two intermediate nodes. What would be the optimum packet size if the message size is 24 bytes and each packet contains a header of 3 bytes?

**Options:**
- A) 7
- B) 4
- C) 9
- D) 6

**Answer:** C

### Q06: Variable Names in C
Which of the following cannot be a variable name in C?

**Options:**
- A) friend
- B) true
- C) export
- D) volatile

**Answer:** D

### Q07: C++ Code Output
What will be the output of the following code?

```cpp
#include <iostream>
using namespace std;
int main()
{
    int a = 2, b = 7, c, d;
    c = a + b;
    d = (a, b);
    cout << c << " " << d;
    return 0;
}
```

**Options:**
- A) 72
- B) 27
- C) 29
- D) 79

**Answer:** A

### Q08: Process Control Block (PCB)
Which kind of information is not present in the Process Control Block?

**Options:**
- A) Accounting information
- B) Memory-Management information
- C) Disk Scheduling information
- D) CPU Scheduling information

**Answer:** A

### Q09: Subset Sum
Consider n = 7, w = {5, 7, 10, 12, 15, 18, 20} and m = 35. Which of the following is NOT a subset of "w" that sums to "m"?

**Options:**
- A) 18, 7, 10
- B) 10, 12, 15
- C) 12, 15, 18
- D) 20, 15

**Answer:** C

### Q10: B-trees and Binary Search Trees
Which of the following is the main reason for preferring B-trees over Binary search trees for indexing database relations?

**Options:**
- A) Database relations are sorted on the primary key
- B) Data transfer from disks is in blocks
- C) Database relations have a large number of records
- D) B-trees require less memory than binary search trees

**Answer:** D

### Q11: Cost of Edit Operations
If the cost for both insertion and deletion are 1 and the cost of change is 2, then find the minimum cost of edit that transforms Y into X where X = `a, a, b, b, a, b, a, b, a` and Y = `b, a, b, a, b, a, b, a, b`.

**Options:**
- A) 18
- B) 4
- C) 8
- D) 3

**Answer:** A

### Q12: Complexity Classes
Which of the following represents the correct Venn diagram of the complexity classes P, NP, and NP-Complete (NPC) when a polynomial time algorithm is discovered that correctly computes the largest clique in a given graph?

**Options:**
- A) ![Venn Diagram A](image-a)
- B) ![Venn Diagram B](image-b)
- C) ![Venn Diagram C](image-c)
- D) ![Venn Diagram D](image-d)

**Answer:** B

### Q13: Excess-3 Encoding
What is the Excess-3 equivalent of (1234)\(_H\)?

**Options:**
- A) (1237)\(_{Ex-3}\)
- B) (7993)\(_{Ex-3}\)
- C) (4567)\(_{Ex-3}\)
- D) (4663)\(_{Ex-3}\)

**Answer:** B

### Q14: Cache Memory Hit Ratio
Suppose memory access takes 20ns with cache and 110ns without cache. The hit ratio will be: (Given: cache uses a 10ns memory)

**Options:**
- A) 0.93
- B) 0.87
- C) 0.9
- D) 0.7

**Answer:** C

### Q15: Database Management Systems
Which of the following operations is not performed by the database management system?

**Options:**
- A) Restrict concurrency
- B) Control redundancy
- C) Provide non-procedural query language
- D) Maintain data integrity

**Answer:** A

### Q16: C++ Macro and Output
What will be the output of the following program?

```cpp
#define CUBE(x) (x*x*x)
#define M 5
#define N M+1
#define PRINT printf("Google");
int main()
{
    int volume = CUBE(3+2);
    printf("%d %d ", volume, N);
    PRINT
    return 0;
}
```

**Options:**
- A) 125 6 Google
- B) 17 6 Google
- C) Compilation Error
- D) None of the mentioned options

**Answer:** A

### Q17: C++ File Handling and Output
What will be the output of the following code?

```cpp
#include <iostream>
#include <fstream>
using namespace std;
int main ()
{
    ofstream outfile ("sample.txt");
    for (int n = 0; n < 5; n++)
    {
        outfile << n;
        outfile.flush();
    }
    cout << endl << "Done";
    outfile.close();
    return 0;
}
```

**Options:**
- A) 01234
- B) Done
- C) 01234 Done
- D) Compilation error

**Answer:** B

### Q18: C String Handling
What will be the output of the below code?

```c
#include<stdio.h>
void main(){
    char arr[11]="The African Queen";
    printf("%s",arr);
}
```

**Options:**
- A) The African Q
- B) The African Queen
- C) Error
- D) The African

**Answer:** A

### Q19: Sorting Time Complexity
The minimum time needed to sort 100 numbers when the machine needs a minimum of 100 sec to sort 1000 numbers by quicksort is:

**Options:**
- A) 7.2 sec
- B) 0.67 sec
- C) 5.2 sec
- D) 12.1 sec

**Answer:** A

### Q20: Postfix to Infix Conversion
Consider the following postfix expression. Which of the following is its infix expression?

Postfix  Expression: `X 12 + 17 Y + 42 Z * / +`

**Options:**
- A) X + 12 + Z / ((17 + Y) * 42)
- B) O + 12 + Z / ((17 + Y) * 42)
- C) X + 12 + Z / 17 + Y * 42
- D) X + (12 + Z) / ((17 + Y) * 42)

**Answer:** C

### Q21: Array Value Count
The number of values that can be held by an array `arr[1...n, 1...n]` is:

**Options:**
- A) O(n(n+1))
- B) O(n)
- C) O(n^2)
- D) O(n(n+2))

**Answer:** A

### Q22: Sparse Matrix Memory Usage
In which of the following cases, linked list implementation of sparse matrices consumes the same memory space as the conventional way of storing the entire array? (It is given all data types need the same amount of storage)

**Options:**
- A) 5 x 6 matrix with 8 non-zero entries
- B) 5 x 6 matrix with 9 non-zero entries
- C) 6 x 5 matrix with 9 non-zero entries
- D) 6 x 5 matrix with 8 non-zero entries

**Answer:** B

### Q23: Frequency Counting
A program P reads 500 integers in the range [0,100] representing the scores of 500 students. It then prints the frequency of each score above 50. What would be the best way for P to store the frequencies?

**Options:**
- A) An array of 500 numbers
- B) An array of 100 numbers
- C) A dynamically allocated array of 550 numbers
- D) An array of 50 numbers

**Answer:** B

### Q24: Memory Address Calculation
Which of the following formulas will correctly calculate the memory address of the third element of an array? (w is the number of words per memory cell for the array)

**Options:**
- A) LOC(Array[3]) = Base(Array) + w*(3-lower bound)
- B) Information is not adequate to solve the given problem
- C) LOC(Array[3]) = Base(Array) + (3-lower bound)
- D) LOC(Array[3]) = Base(Array) + w*(3-upper bound)

**Answer:** A

### Q25: File Access Rights
The domain for a file contains the access right as `_______`, when file F wants to perform both read and write operations on it.

**Options:**
- A) <file F {read, write}>
- B) <read, write>
- C) <read, write, file F>
- D) <file F, {read, write}>

**Answer:** B

### Q26: C++ Static Variables
What will be the output of the following code?

```cpp
#include <iostream>
#include <stdio.h>
using namespace std;
int fun()
{
    static int num = 16;
    return num--;
}
int main()
{
    for(fun(); fun(); fun())
    cout << fun();
    return 0;
}
```

**Options:**
- A) 1512852
- B) 1411852
- C) 1310741
- D) Infinite loop

**Answer:** A

### Q27: Network Transmission Delay
The transmission speed is 10^7 bps and the propagation speed is 200 meters/µsec in a token ring network. In this case, 1-bit delay in this network is equivalent to:

**Options:**
- A) 50 meters of cable
- B) 20 meters of cable
- C) 500 meters of cable
- D) 200 meters of cable

**Answer:** B

### Q28: Slotted LAN Probability
A slotted LAN has n stations. If each station attempts to transmit with a probability p in each time slot. What is the probability that ONLY one station transmits in a given time slot?

**Options:**
- A) \( 1 - (1-p)^{n-1} \)
- B) \( p(1-p)^{n-1} \)
- C) \( np(1-p)^{n-1} \)
- D) \( (1-p)^{n-1} \)

**Answer:** A

### Q29: Wait-for Graphs
Which of the following is the feature of Wait-for graph?

**Options:**
- A) Detecting view serializability
- B) Deadlock detection
- C) Deadlock prevention
- D) Detecting conflict serializability

**Answer:** B

### Q30: DBMS Hierarchical Model
Hierarchical model in DBMS organizes data in which of the following structures?

**Options:**
- A) Normalize structure
- B) Tree Structure
- C) Plex Structure
- D) Table Structure

**Answer:** B

## Conclusion
This repository serves as a valuable study guide for anyone preparing for technical assessments or interviews. The questions cover a broad range of topics and are designed to test various aspects of computer science knowledge.

---

Feel free to contribute to this repository by adding more questions or improving existing solutions. If you find any discrepancies, please raise an issue.

---

This README file is designed for clarity and ease of use. Let me know if you need any further adjustments or additions!