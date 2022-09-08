/*

Given a set of distinct integers, print the size of a maximal subset of  where the sum of any  numbers in  is not evenly divisible by .

For example, the array  and . One of the arrays that can be created is . Another is . After testing all permutations, the maximum length solution array has  elements.

Function Description

Complete the nonDivisibleSubset function in the editor below. It should return an integer representing the length of the longest subset of  meeting the criteria.

nonDivisibleSubset has the following parameter(s):

S: an array of integers
k: an integer
Input Format

The first line contains  space-separated integers,  and , the number of values in  and the non factor.

The second line contains  space-separated integers describing , the unique values of the set.

Output Format

Print the size of the largest possible subset ().

Sample Input

4 3

1 7 2 4
 

Sample Output

3
 

Explanation

The sums of all permutations of two elements from  are:

1 + 7 = 8

1 + 2 = 3

1 + 4 = 5

7 + 2 = 9

7 + 4 = 11

2 + 4 = 6

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
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[k];
        for(int i=0; i < n; i++){
            int ai = in.nextInt();
            a[ai % k]++;
        }
        int count = 0;
        for (int i = 1; i < (k + 1) / 2; ++i) {
            count += Math.max(a[i], a[k - i]);
        }
        if (k % 2 == 0) {
            count += a[k / 2] > 0 ? 1 : 0;
        }
        count += a[0] > 0 ? 1 : 0;
        
        System.out.println(count);
    }
}
