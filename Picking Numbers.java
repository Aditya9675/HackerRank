/*
Given an array of integers, find the longest subarray where the absolute difference between any two elements is less than or equal to .

Example

There are two subarrays meeting the criterion:  and . The maximum length subarray has  elements.

Function Description

Complete the pickingNumbers function in the editor below.

pickingNumbers has the following parameter(s):

int a[n]: an array of integers
Returns

int: the length of the longest subarray that meets the criterion
Input Format

The first line contains a single integer , the size of the array .
The second line contains  space-separated integers, each an .

Constraints

The answer will be .
Sample Input 0

6
4 6 5 3 3 1
Sample Output 0

3
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner readIn = new Scanner(System.in);
        
        int n = readIn.nextInt();
        int[] frequencie = new int[100];
        for(int ii = 0; ii < n; ii++)
            frequencie[readIn.nextInt()]++;
        
        int out = Integer.MIN_VALUE;
        for(int ii = 0; ii < frequencie.length - 1; ii++)
            out = frequencie[ii] + frequencie[ii + 1] > out ? frequencie[ii] + frequencie[ii + 1] : out;
        
        System.out.println(out);
    }
}
