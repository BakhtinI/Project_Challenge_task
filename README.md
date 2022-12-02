# Project_Challenge

## Description

Familiarize yourself with parallel partial reduction 
[trees](https://www.sciencedirect.com/topics/computer-science/partial-reduction).

In this exercise, your task is to scan left on a given input array 
and output a new array consisting of the maximum values 
to the left of a given index in the original array.

Example:
```
In: [0, 0, 1, 5, 2, 3, 6]

Out: [0, 0, 1, 5, 5, 5, 6]
```

### Task 1
Using the partial parallel reduction tree paradigm, implement the methods described in [ScanInterface](./src/main/scala/com/intellias/challenge/ScanInterface.scala), 
making use of the parallelism abstractions provided. You should not utilize
data or function parallel constructs that have not been provided.

Utilize good judgment when choosing side-effecting vs pure implementations to
blend good functional style with performance.

Note that a [trivial sequential
implementation](./src/main/scala/com/intellias/challenge/SequentialScan.scala) has been provided for reference.

### Task 2
Using scalameter, compare performance between a fully sequential implementation
and your parallel implementation, and provide some recommendations for optimal
threshold values for your system.

### Task 3
Using your observations from Task 2, extrapolate to general systems.
