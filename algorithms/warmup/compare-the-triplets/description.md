Alice and Bob each created one problem for HackerRank. A reviewer rates the two challenges, awarding points on a scale from **1** to **100** for three categories: *problem clarity*, *originality*, and *difficulty*.

We define the rating for Alice's challenge to be the triplet **A** = (*a<sub>0</sub>*, *a<sub>1</sub>*, *a<sub>2</sub>*), and the rating for Bob's challenge to be the triplet **B** = (*b<sub>0</sub>*, *b<sub>1</sub>*, *b<sub>2</sub>*).

Your task is to find their *comparison points* by comparing *a<sub>0</sub>* with *b<sub>0</sub>*, *a<sub>1</sub>* with *b<sub>1</sub>*, and *a<sub>2</sub>* with *b<sub>2</sub>*.

If *a<sub>i</sub>* > *b<sub>i</sub>*, then Alice is awarded **1** point.
If *a<sub>i</sub>* < *b<sub>i</sub>*, then Bob is awarded **1** point.
If *a<sub>i</sub>* = *b<sub>i</sub>*, then neither person receives a point.
Comparison points is the total points a person earned.

Given **A** and **B**, can you compare the two challenges and print their respective comparison points?

#### Input Format

The first line contains **3** space-separated integers, *a<sub>0</sub>*, *a<sub>1</sub>*, and *a<sub>2</sub>*, describing the respective values in triplet . 
The second line contains **3** space-separated integers, *b<sub>0</sub>*, *b<sub>1</sub>*, and *b<sub>2</sub>*, describing the respective values in triplet .

#### Constraints

* 1 ≤ *a<sub>i</sub>* ≤ 100
* 1 ≤ *b<sub>i</sub>* ≤ 100

#### Output Format

Print two space-separated integers denoting the respective comparison points earned by Alice and Bob.

#### Sample Input

    5 6 7
    3 6 10

#### Sample Output

    1 1
 
#### Explanation

In this example:

* `A = (*a<sub>0</sub>*, *a<sub>1</sub>*, *a<sub>2</sub>*) = (5, 6, 7)'
* `B = (*b<sub>0</sub>*, *b<sub>1</sub>*, *b<sub>2</sub>*) = (3, 6, 10)'

Now, let's compare each individual score:

* *a<sub>0</sub>* > *b<sub>0</sub>*, so Alice receives  point.
* *a<sub>1</sub>* = *b<sub>1</sub>*, so nobody receives a point.
* *a<sub>2</sub>* < *b<sub>2</sub>*, so Bob receives  point.

Alice's comparison score is **1**, and Bob's comparison score is **1**. Thus, we print `1 1` (Alice's comparison score followed by Bob's comparison score) on a single line.