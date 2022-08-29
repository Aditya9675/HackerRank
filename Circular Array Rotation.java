/*
John Watson knows of an operation called a right circular rotation on an array of integers. One rotation operation moves the last array element to the first position and shifts all remaining elements right one. To test Sherlock’s abilities, Watson provides Sherlock with an array of integers. Sherlock is to perform the rotation operation a number of times then determine the value of the element at a given position.

For each array, perform a number of right circular rotations and return the values of the elements at the given indices.

Example

a = [3,4,5]

k = 2

queries = [1,2]

Here k is the number of rotations on a, and queries holds the list of indices to report. First we perform the two rotations: [3,4,5] -> [5,3,4] -> [4,5,3] 

Now return the values from the zero-based indices 1 and 2 as indicated in the queries array.

a[1] = 5

a[5] = 3

Function Description

Complete the circularArrayRotation function in the editor below.

circularArrayRotation has the following parameter(s):

int a[n]: the array to rotate
int k: the rotation count
int queries[1]: the indices to report
Returns

int[q]: the values in the rotated  as requested in 
Input Format

The first line contains 3 space-separated integers, n, k, and q, the number of elements in the integer array, the rotation count and the number of queries.

The second line contains n space-separated integers, where each integer i describes array element  a[i] (where 0<=i<n ).

Each of the q subsequent lines contains a single integer,queries[i] , an index of an element in a to return.

Sample Input 0

3 2 3

1 2 3

0

1

2
Sample Output 0

2

3

1
 

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws IOException {
       
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(in.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());
        StringTokenizer array = new StringTokenizer(in.readLine());
        ArrayList<Integer> a = new ArrayList<Integer>(N);
        for (int i = 0; i < N; i++) {
            a.add(Integer.parseInt(array.nextToken()));
        }
        List<Integer> subListOne = a.subList(0, (N - (K % N)));
        a.addAll(subListOne);
        
       
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < Q; i++) {
            int x = Integer.parseInt(in.readLine());
            output.append(a.get(x + (N - (K % N)))).append("\n");
        }
        System.out.print(output.toString());
    }
}

*/

