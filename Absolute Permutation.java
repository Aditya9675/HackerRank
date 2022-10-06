/*

We define P to be a permutation of the first n natural numbers in the range [1,n]. Let pos[i] denote the value at position i in permutation P using 1-based indexing.

P is considered to be an absolute permutation if |posi[i]-i]=k holds true for every i belongs to [1,n].

Given n and k, print the lexicographically smallest absolute permutation . If no absolute permutation exists, print -1.

For example, let n=4 giving us an array pos=[1,2,3,4]. If we use 1 based indexing, create a permutation where every |pos[i]-1| = k. If k=2, we could rearrange them to [3,4,1,2]:

pos[i]	i	|Difference|
3	1	2
4	2	2
1	3	2
2	4	2
Function Description


Complete the absolutePermutation function in the editor below. It should return an integer that represents the smallest lexicographically smallest permutation, -1 or if there is none.

absolutePermutation has the following parameter(s):

n: the upper bound of natural numbers to consider, inclusive
k: the integer difference between each element and its index

Input Format

The first line contains an integer t, the number of test cases.
Each of the next t lines contains 2 space-separated integers, n and k.

Output Format

On a new line for each test case, print the lexicographically smallest absolute permutation. If no absolute permutation exists, print -1.

Sample Input


3
2 1
3 0
3 2
Sample Output

2 1
1 2 3
-1

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int tt = 0; tt < t; tt++) {
            solve(in.nextInt(), in.nextInt());
            System.out.println();
        }
    }
    public static void solve( int n, int k) {
      if (k == 0) {
        for (int i = 1; i <= n; i++) {
          System.out.print(i + " ");
        }
        return;
      }
      if (n%2 == 1 || k > n/2) {
        System.out.print("-1");
        return;
      }
      solveAns(n,k);
    }
    static void solveAns(int n, int k) {
      boolean seen[] = new boolean[n+1];
      StringBuilder ans = new StringBuilder();
      for (int i = 1; i <= n; i++) {
       
        if ((i-k) > 0 && !seen[(i-k)]) {
          seen[(i-k)] = true;
          ans.append(i-k);
          ans.append(' ');
        } else if ((i+k) <= n && !seen[(i+k)]) {
          seen[(i+k)] = true;
          ans.append(i+k);
          ans.append(' ');
        } else {
          
          System.out.print("-1");
          return;
        }
      }
      System.out.print(ans.toString());
    }
}
