#### Objective 
Today, we're learning and practicing an algorithmic concept called *Recursion*. Check out the [Tutorial](https://www.hackerrank.com/challenges/30-recursion/tutorial) tab for learning materials and an instructional video!

**Recursive Method for Calculating Factorial**

*factorial*(*N*) = 
* *1* if *N* ≤ 1
* *N* x *factorial*(*N - 1*) *otherwise*
 
**Task** Write a factorial function that takes a positive integer,  as a parameter and prints the result of  ( factorial).

**Note:** If you fail to use recursion or fail to name your recursive function *factorial* or *Factorial*, you will get a score of **0**.

#### Input Format

A single integer, *N* (the argument to pass to *factorial*).

#### Constraints

* 2 ≤ *N* ≤ 12
* Your submission must contain a recursive function named *factorial*.

#### Output Format

Print a single integer denoting *N*!.

#### Sample Input

    3

#### Sample Output

    6

#### Explanation

Consider the following steps:
1. *factorial*(3) = *3* x *factorial*(2)
2. *factorial*(2) = *2* x *factorial*(1)
3. *factorial*(1) = *1*

From steps *2* and *3*, we can say *factorial*(2) = *2* x *1* = *2*; then when we apply the value from *factorial*(2) to step *1*, we get *factorial*(3) = *3* x *2* x *1* = **6**. Thus, we print **6** as our answer.