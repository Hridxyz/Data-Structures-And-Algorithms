# Technical Assessment - Comprehensive Review

This repository contains a detailed analysis of 31 technical questions that were compiled by collaborating with peers who took part in a recent Online Test (OT). These questions cover various topics including database management, programming logic, network protocols, data structures, and more.

### Source of Questions
These questions were gathered by asking friends and colleagues to recall the questions they encountered during the Online Test. This collective effort has resulted in a comprehensive set of questions that can be used for study and preparation.

## Desclaimer
Dont refer to my answers. They are mostly wrong. Cheers!

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

### Q31: C Enum and Array Indexing
What will be the output of the following code?

```c
#include<stdio.h>
enum power {
    Sachin,
    Rahul = 3,
    Sourav,
    Laxman
};

void main() {
    float Batsman[Sachin + Laxman] = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
    enum power p = Sourav;
    printf("%0.1f", Batsman[p >> 1 + 1]);
}
```

**Options:**
- A) 3
- B) 1
- C) Compilation Error
- D) 2

**Answer:** A

### Q32: Dependency Preservation
In which of the following, dependency preservation is not guaranteed?

**Options:**
- A) BCNF
- B) PJNF
- C) 3NF
- D) DKNF

**Answer:** A

### Q33: Candidate Keys Determination
Consider a relation scheme \( R = (A, B, C, D, E, F) \) on which the following functional dependencies hold:
- \( A \rightarrow B \)
- \( BC \rightarrow D \)
- \( E \rightarrow C \)
- \( D \rightarrow E \)

What are the candidate keys of R?

**Options:**
- A) AE, BE
- B) AE, BE, DE
- C) AEF, BEF, DEF
- D) AEF, BEF, BCF

**Answer:** D

### Q34: Memory Address Calculation for 2D Array
A two-dimensional array `TABLE [6][8]` is stored in row-major order with base address 351. What is the address of `TABLE[3][4]`?

**Options:**
- A) 407
- B) 714
- C) 44
- D) 70

**Answer:** B

### Q35: Sparse Matrix Implementation
In which of the following cases, linked list implementation of sparse matrices consumes the same memory space as the conventional way of storing the entire array? (It is given all data types need the same amount of storage)

**Options:**
- A) \(6 \times 5\) matrix with 8 non-zero entries
- B) \(5 \times 6\) matrix with 9 non-zero entries
- C) \(6 \times 5\) matrix with 9 non-zero entries
- D) \(5 \times 6\) matrix with 8 non-zero entries

**Answer:** A

### Q36: Time Complexity of Algorithm
What is the time complexity of the following algorithm?

```c
Algorithm Display (A)
{
    For I := 0 to n-1
    {
        For J := 0 to n-1
        {
            Write A;
        }
    }
}
```

**Options:**
- A) \(2n^2 + 4n + 4\)
- B) \(2n^2 - n\)
- C) \(2n^2 + n\)
- D) \(2n^2 + 4n + 2\)

**Answer:** C

### Q37: OLTP Database Property
Which of the following is not a property of an OLTP database?

**Options:**
- A) Frequent updates
- B) Optimized for queries
- C) Current data
- D) Granular Transactions

**Answer:** B

### Q38: Protocol Data Unit (PDU)
Which of the following is the Protocol Data Unit (PDU) for the application layer in the Internet stack?

**Options:**
- A) Frame
- B) Message
- C) Datagram
- D) Segment

**Answer:** B

### Q39: Array Value Count
The number of values that can be held by an array `arr[1...n, 1...n]` is:

**Options:**
- A) \(O(n(n+1))\)
- B) \(O(n)\)
- C) \(O(n^2)\)
- D) \(O(n(n+2))\)

**Answer:** C

### Q40: Expected Number of Comparisons in Randomized Search
Consider an unsorted array \( A[1...n] \) with n distinct values. The following algorithm can be used to search a given number x:
1. Choose a k uniformly at random from 1...n;
2. if \( A[k] = x \) then stop else Goto 1;

Assume that x is present in the array A. What will be the expected number of comparisons required by the algorithm before it terminates?

**Options:**
- A) \( n - 1 \)
- B) \( n/2 \)
- C) \( n \)
- D) \( 2n \)

**Answer:** B

### Q41: Binary Search Tree Traversal
A Binary Search Tree is traversed in the following order recursively - right, root, left. What would be the output sequence?

**Options:**
- A) Ascending order
- B) Bitonic sequence
- C) None of the mentioned options
- D) Descending order

**Answer:** D

### Q42: RISC Architecture Characteristics
Among the following choices, which one is not a characteristic of RISC architecture?

**Options:**
- A) Large instruction set
- B) Register-to-register operation
- C) Simple addressing modes
- D) One instruction per cycle

**Answer:** A

### Q43: Cache Memory Hit Ratio
Suppose memory access takes 20ns with cache and 110ns without cache. The hit ratio will be: (Given: cache uses a 10ns memory)

**Options:**
- A) 0.93
- B) 0.87
- C) 0.9
- D) 0.7

**Answer:** C

### Q44: C Pointer Assignment
Consider the following declarations:

```c
void *voidptr;
char *charptr;
```

Which of the following assignments is syntactically correct?

**Options:**
- A) `charptr = voidptr;`
- B) `*voidptr = *charptr;`
- C) `voidptr = charptr;`
- D) `*charptr = voidptr;`

**Answer:** B

### Q45: Variable Names in C
Which of the following cannot be a variable name in C?

**Options:**
- A) true
- B) friend
- C) export
- D) volatile

**Answer:** C

### Q46: B-Trees vs. Binary Search Trees
Which of the following is the main reason for preferring B-trees over Binary search trees for indexing database relations?

**Options:**
- A) B-trees require less memory than binary search trees
- B) Database relations are sorted on the primary key
- C) Data transfer from disks is in blocks
- D) Database relations have a large number of records

**Answer:** C

### Q47: CPU Utilization Calculation
A process P1 has a period of 50 and a CPU burst of 25, and P2 has a period of 80, CPU burst of 35. What is the total CPU utilization?

**Options:**
- A) 0.94
- B) 0.49
- C) 0.82
- D) 0.6

**Answer:** C

### Q48: Slotted LAN Probability
A slotted LAN has n stations. If each station attempts to transmit with a probability p in each time slot, what is the probability that ONLY one station transmits in a given time slot?

**Options:**
- A) p(1-p)^(n-1)
- B) (1-p)^(n-1)
- C) 1 - (1-p)^(n-1)
- D) np(1-p)^(n-1)

**Answer:** A

### Q49: Wait-for Graph Feature
Which of the following is the feature of the Wait-for graph?

**Options:**
- A) Detecting conflict serializability
- B) Detecting view serializability
- C) Deadlock prevention
- D) Deadlock detection

**Answer:** D

### Q50: Unstructured Data Storage
Which of the following data types can store unstructured data?

**Options:**
- A) NUMERIC
- B) VARCHAR
- C) CHAR
- D) LOB

**Answer:** D

### Q51: Cryptographic System Key Calculation
Suppose that everyone in a group of N people wants to communicate secretly with the N-1 others using a symmetric key cryptographic system. The communication between any two persons should not be decodable by the others in the group. The number of keys required in the system as a whole to satisfy the confidentiality requirement is:

**Options:**
- A) (N-1)^2
- B) N(N-1)/2
- C) 2N
- D) N(N-1)

**Answer:** B

### Q52: Packet Size Optimization
Consider a packet switching network in which packets are routed from source to destination along a single path having two intermediate nodes. What would be the optimum packet size if the message size is 24 bytes and each packet contains a header of 3 bytes?

**Options:**
- A) 9
- B) 7
- C) 6
- D) 4

**Answer:** C

### Q53: Algorithm Analysis
Analysis of algorithms or performance analysis refers to:

**Options:**
- A) Determining computing time and efficiency of an algorithm
- B) Determining efficiency and storage an algorithm requires
- C) Determining efficiency and number of steps in the algorithm
- D) Determining computing time and storage an algorithm requires

**Answer:** B

### Q54: Circular Linked List Characteristics
Which of the following is true about a circular linked list?

**Options:**
- A) All components are linked together in some sequential manner
- B) Components are arranged hierarchically
- C) There is no beginning and no end
- D) Forward and backward traversal within the list is permitted

**Answer:** C

### Q55: C Code Output
What will be the output of the following code?

```c
#include <iostream>
using namespace std;
int main() 
{
    int a = 2, b = 7, c, d;
    c = a, b;
    d = (a, b);
    cout << c << ' ' << d;
    return 0;
}
```

**Options:**
- A) 29
- B) 27
- C) 79
- D) 72

**Answer:** A

### Q56: Two-Dimensional Array Address Calculation
A two-dimensional array `TABLE [6][8]` is stored in row major order with base address 351. What is the address of `TABLE[3][4]`?

**Options:**
- A) 44
- B) 407
- C) 714
- D) 70

**Answer:** B

### Q57: Number of Interchanges for Max-Heap
Find out the number of interchanges needed to convert the given array into a max-heap: `89, 19, 50, 17, 12, 15, 2, 5, 7, 11, 6, 9, 100`.

**Options:**
- A) 4
- B) 5
- C) 2
- D) 3

**Answer:** D

### Q58: Segmentation Fault Cause
What will be the output of the following C code (without any command line arguments)?

```c
#include <stdio.h>
int main(int argc, char *argv[])
{
    printf("%s\n", argv[argc]);
    return 0;
}
```

**Options:**
- A) Depends on the compiler
- B) None of the mentioned options
- C) Segmentation fault
- D) Executable file name

**Answer:** C

### Q59: C++ Modulo Operation
What will be the output of the following code?

```c
#include <iostream>
using namespace std;
void main()
{
    float x=5,y=2;
    int result;
    result = x % y;
    cout<<result;
}
```

**Options:**
- A) 2.5
- B) Error message
- C) 1.0
- D) 1

**Answer:** B

### Q60: Double Array Output in C
What will be the output of the following code?

```c
#include <stdio.h>
void main(){
    int expr;
    double value[]={2.0,4.0,6.0,8.0,10.0};
    expr=1|2|3|4;
    printf("%f",value[expr]);
}
```

**Options:**
- A) 4.000000
- B) 2.000000
- C) Runtime Error
- D) Compilation Error

**Answer:** A

### Q61: Dijkstra's Algorithm
Consider the directed graph shown in the figure below. There are multiple shortest paths between vertices S and T. Which one will be reported by Dijkstra's shortest path algorithm? Assume that, in any iteration, the shortest path to a vertex v is updated only when a strictly shorter path to v is discovered.

**Options:**
- A) SDT
- B) SACDT
- C) SBDT
- D) SACET

**Answer:** A

### Q62: Process Control Block Information
Which kind of information is not present in the 'Process Control Block'?

**Options:**
- A) Accounting information
- B) CPU Scheduling information
- C) Memory-Management information
- D) Disk Scheduling information

**Answer:** D

### Q63: Infix Expression Conversion
Consider the following postfix expression. Which of the following is its infix expression?

`x 12 + z 17 y + 42 * / +`

**Options:**
- A) `x + 12 + z / (17 + y) * 42`
- B) `x + 12 + z / ((17 + y) * 42)`
- C) `x + 12 + z / 17 + y * 42`
- D) `x + (12 + z) / (17 + y * 42)`

**Answer:** A

### Q64: Venn Diagram for Complexity Classes
Which of the following represents the correct Venn diagram of the complexity classes P, NP, and NP-Complete (NPC) when a polynomial time algorithm is discovered that correctly computes the largest clique in a given graph?

**Options:**
- A) P ⊆ NP ⊆ NPC
- B) P = NP = NPC
- C) P ⊆ NPC ⊆ NP
- D) P ⊆ NP and NPC are disjoint

**Answer:** B

### Q65: Characteristic of RISC Architecture
Among the following choices, which one is not a characteristic of RISC architecture?

**Options:**
- A) Large instruction set
- B) Register-to-register operation
- C) Simple addressing modes
- D) One instruction per cycle

**Answer:** A

### Q66: Hit Ratio Calculation
Suppose memory access takes 20ns with cache and 110ns without cache. The hit ratio will be: (Given: cache uses a 10ns memory)

**Options:**
- A) 0.7
- B) 0.93
- C) 0.87
- D) 0.9

**Answer:** D

### Q67: Dependency Preservation in Normal Forms
In which of the following, dependency preservation is not guaranteed?

**Options:**
- A) BCNF
- B) PJNF
- C) 3NF
- D) DKNF

**Answer:** A

### Q68: Candidate Keys Determination
Consider a relation scheme \( R = (A, B, C, D, E, F) \) on which the ### Q46: B-Trees vs. Binary Search Trees
Which of the following is the main reason for preferring B-trees over Binary search trees for indexing database relations?

**Options:**
- A) B-trees require less memory than binary search trees
- B) Database relations are sorted on the primary key
- C) Data transfer from disks is in blocks
- D) Database relations have a large number of records

**Answer:** C

### Q47: CPU Utilization Calculation
A process P1 has a period of 50 and a CPU burst of 25, and P2 has a period of 80, CPU burst of 35. What is the total CPU utilization?

**Options:**
- A) 0.94
- B) 0.49
- C) 0.82
- D) 0.6

**Answer:** C

### Q48: Slotted LAN Probability
A slotted LAN has n stations. If each station attempts to transmit with a probability p in each time slot, what is the probability that ONLY one station transmits in a given time slot?

**Options:**
- A) p(1-p)^(n-1)
- B) (1-p)^(n-1)
- C) 1 - (1-p)^(n-1)
- D) np(1-p)^(n-1)

**Answer:** A

### Q49: Wait-for Graph Feature
Which of the following is the feature of the Wait-for graph?

**Options:**
- A) Detecting conflict serializability
- B) Detecting view serializability
- C) Deadlock prevention
- D) Deadlock detection

**Answer:** D

### Q50: Unstructured Data Storage
Which of the following data types can store unstructured data?

**Options:**
- A) NUMERIC
- B) VARCHAR
- C) CHAR
- D) LOB

**Answer:** D

### Q51: Cryptographic System Key Calculation
Suppose that everyone in a group of N people wants to communicate secretly with the N-1 others using a symmetric key cryptographic system. The communication between any two persons should not be decodable by the others in the group. The number of keys required in the system as a whole to satisfy the confidentiality requirement is:

**Options:**
- A) (N-1)^2
- B) N(N-1)/2
- C) 2N
- D) N(N-1)

**Answer:** B

### Q52: Packet Size Optimization
Consider a packet switching network in which packets are routed from source to destination along a single path having two intermediate nodes. What would be the optimum packet size if the message size is 24 bytes and each packet contains a header of 3 bytes?

**Options:**
- A) 9
- B) 7
- C) 6
- D) 4

**Answer:** C

### Q53: Algorithm Analysis
Analysis of algorithms or performance analysis refers to:

**Options:**
- A) Determining computing time and efficiency of an algorithm
- B) Determining efficiency and storage an algorithm requires
- C) Determining efficiency and number of steps in the algorithm
- D) Determining computing time and storage an algorithm requires

**Answer:** B

### Q54: Circular Linked List Characteristics
Which of the following is true about a circular linked list?

**Options:**
- A) All components are linked together in some sequential manner
- B) Components are arranged hierarchically
- C) There is no beginning and no end
- D) Forward and backward traversal within the list is permitted

**Answer:** C

### Q55: C Code Output
What will be the output of the following code?

```c
#include <iostream>
using namespace std;
int main() 
{
    int a = 2, b = 7, c, d;
    c = a, b;
    d = (a, b);
    cout << c << ' ' << d;
    return 0;
}
```

**Options:**
- A) 29
- B) 27
- C) 79
- D) 72

**Answer:** A

### Q56: Two-Dimensional Array Address Calculation
A two-dimensional array `TABLE [6][8]` is stored in row major order with base address 351. What is the address of `TABLE[3][4]`?

**Options:**
- A) 44
- B) 407
- C) 714
- D) 70

**Answer:** B

### Q57: Number of Interchanges for Max-Heap
Find out the number of interchanges needed to convert the given array into a max-heap: `89, 19, 50, 17, 12, 15, 2, 5, 7, 11, 6, 9, 100`.

**Options:**
- A) 4
- B) 5
- C) 2
- D) 3

**Answer:** D

### Q58: Segmentation Fault Cause
What will be the output of the following C code (without any command line arguments)?

```c
#include <stdio.h>
int main(int argc, char *argv[])
{
    printf("%s\n", argv[argc]);
    return 0;
}
```

**Options:**
- A) Depends on the compiler
- B) None of the mentioned options
- C) Segmentation fault
- D) Executable file name

**Answer:** C

### Q59: C++ Modulo Operation
What will be the output of the following code?

```c
#include <iostream>
using namespace std;
void main()
{
    float x=5,y=2;
    int result;
    result = x % y;
    cout<<result;
}
```

**Options:**
- A) 2.5
- B) Error message
- C) 1.0
- D) 1

**Answer:** B

### Q60: Double Array Output in C
What will be the output of the following code?

```c
#include <stdio.h>
void main(){
    int expr;
    double value[]={2.0,4.0,6.0,8.0,10.0};
    expr=1|2|3|4;
    printf("%f",value[expr]);
}
```

**Options:**
- A) 4.000000
- B) 2.000000
- C) Runtime Error
- D) Compilation Error

**Answer:** A

### Q61: Dijkstra's Algorithm
Consider the directed graph shown in the figure below. There are multiple shortest paths between vertices S and T. Which one will be reported by Dijkstra's shortest path algorithm? Assume that, in any iteration, the shortest path to a vertex v is updated only when a strictly shorter path to v is discovered.

**Options:**
- A) SDT
- B) SACDT
- C) SBDT
- D) SACET

**Answer:** A

### Q62: Process Control Block Information
Which kind of information is not present in the 'Process Control Block'?

**Options:**
- A) Accounting information
- B) CPU Scheduling information
- C) Memory-Management information
- D) Disk Scheduling information

**Answer:** D

### Q63: Infix Expression Conversion
Consider the following postfix expression. Which of the following is its infix expression?

`x 12 + z 17 y + 42 * / +`

**Options:**
- A) `x + 12 + z / (17 + y) * 42`
- B) `x + 12 + z / ((17 + y) * 42)`
- C) `x + 12 + z / 17 + y * 42`
- D) `x + (12 + z) / (17 + y * 42)`

**Answer:** A

### Q64: Venn Diagram for Complexity Classes
Which of the following represents the correct Venn diagram of the complexity classes P, NP, and NP-Complete (NPC) when a polynomial time algorithm is discovered that correctly computes the largest clique in a given graph?

**Options:**
- A) P ⊆ NP ⊆ NPC
- B) P = NP = NPC
- C) P ⊆ NPC ⊆ NP
- D) P ⊆ NP and NPC are disjoint

**Answer:** B

### Q65: Characteristic of RISC Architecture
Among the following choices, which one is not a characteristic of RISC architecture?

**Options:**
- A) Large instruction set
- B) Register-to-register operation
- C) Simple addressing modes
- D) One instruction per cycle

**Answer:** A

### Q66: Hit Ratio Calculation
Suppose memory access takes 20ns with cache and 110ns without cache. The hit ratio will be: (Given: cache uses a 10ns memory)

**Options:**
- A) 0.7
- B) 0.93
- C) 0.87
- D) 0.9

**Answer:** D

### Q67: Dependency Preservation in Normal Forms
In which of the following, dependency preservation is not guaranteed?

**Options:**
- A) BCNF
- B) PJNF
- C) 3NF
- D) DKNF

**Answer:** A

### Q68: Candidate Keys Determination
Consider a relation scheme \( R = (A, B, C, D, E, F) \) on which the

 following functional dependencies hold:
- \( A \rightarrow B \)
- \( BC \rightarrow D \)
- \( E \rightarrow C \)
- \( D \rightarrow E \)

What are the candidate keys of R?

**Options:**
- A) AE, BE
- B) AE, BE, DE
- C) AEF, BEF, DEF
- D) AEF, BEF, BCF

**Answer:** D

### Q69: Time Complexity of Algorithm
What is the time complexity of the following algorithm?

```c
Algorithm Display (A)
{
    For I := 0 to n-1
    {
        For J := 0 to n-1
        {
            Write A;
        }
    }
}
```

**Options:**
- A) \(2n^2 + 4n + 4\)
- B) \(2n^2 - n\)
- C) \(2n^2 + n\)
- D) \(2n^2 + 4n + 2\)

**Answer:** C

### Q70: IPv4 Datagram Fragmentation
In an IPv4 datagram, the M bit is 0, the value of HLEN is 10, the value of total length is 400, and the fragment offset value is 300. The position of the datagram, the sequence numbers of the first and the last bytes of the payload, respectively are:

**Options:**
- A) Middle fragment, 300 and 689
- B) Last fragment, 2400 and 2759
- C) First fragment, 2400 and 2759
- D) Last fragment, 300 and 689

**Answer:** A

### Q71: Time to Switch Between Modes
Let the time to switch between user and kernel modes of execution be t1 while the total time to switch between two processes be t2. Which of the following is TRUE?

**Options:**
- A) No relation between t1 and t2
- B) t1 = t2
- C) t1 > t2
- D) t1 < t2

**Answer:** C

### Q72: Address Calculation of Array Element
Which of the following formulas will correctly calculate the memory address of the third element of an array? (w is the number of words per memory cell for the array)

**Options:**
- A) LOC(Array[3])=Base(Array)+w(3-lower bound)
- B) LOC(Array[3])=Base(Array[4])+(3-Upper bound)
- C) LOC(Array[3])=Base(Array[3])+(3-lower bound)
- D) Information is not adequate to solve the given problem

**Answer:** A

### Q73: Sparse Matrix Implementation
In which of the following cases, linked list implementation of sparse matrices consumes the same memory space as the conventional way of storing the entire array? (It is given all data types need the same amount of storage)

**Options:**
- A) \(6 \times 5\) matrix with 8 non-zero entries
- B) \(5 \times 6\) matrix with 9 non-zero entries
- C) \(6 \times 5\) matrix with 9 non-zero entries
- D) \(5 \times 6\) matrix with 8 non-zero entries

**Answer:** A

### Q74: Expected Number of Comparisons in Randomized Search
Consider an unsorted array \( A[1...n] \) with n distinct values. The following algorithm can be used to search a given number x:
1. Choose a k uniformly at random from 1...n;
2. if \( A[k] = x \) then stop else Goto 1;

Assume that x is present in the array A. What will be the expected number of comparisons required by the algorithm before it terminates?

**Options:**
- A) \( n - 1 \)
- B) \( n/2 \)
- C) \( n \)
- D) \( 2n \)

**Answer:** B

## Conclusion
This repository serves as a valuable study guide for anyone preparing for technical assessments or interviews. The questions cover a broad range of topics and are designed to test various aspects of computer science knowledge.

---

Feel free to contribute to this repository by adding more questions or improving existing solutions. If you find any discrepancies, please raise an issue.

---
