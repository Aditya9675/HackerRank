/*

David has several containers, each with a number of balls in it. He has just enough containers to sort each type of ball he has into its own container. David wants to sort the balls using his sort method.

David wants to perform some number of swap operations such that:

Each container contains only balls of the same type.
No two balls of the same type are located in different containers.
Example
containers = [[1, 4], [2, 3]]

David has n = 2 containers and 2 different types of balls, both of which are numbered from 0 to n – 1 = 1.

In a single operation, David can swap two balls located in different containers.

In this case, there is no way to have all green balls in one container and all red in the other using only swap operations. Return Impossible.

You must perform q queries where each query is in the form of a matrix, M. For each query, print Possible on a new line if David can satisfy the conditions above for the given matrix. Otherwise, print Impossible.


Function Description

Complete the organizingContainers function in the editor below.

organizingContainers has the following parameter(s):


int containter[n][m]: a two dimensional array of integers that represent the number of balls of each color in each container
Returns

string: either Possible or Impossible
Input Format
The first line contains an integer q, the number of queries.

Each of the next q sets of lines is as follows:


The first line contains an integer n, the number of containers (rows) and ball types (columns).
Each of the next n lines contains n space-separated integers describing row containers[i].
Constraints
1 <= q <= 10
1 <= n <= 100
0 <= containers[i][j] <= 109
Scoring

For 33% of score, 1 <= n <= 10.
For 100% of score, 1 <= n <= 100.
Output Format
For each query, print Possible on a new line if David can satisfy the conditions above for the given matrix. Otherwise, print Impossible.

Sample Input 0

2
2
1 1
1 1
2
0 2
1 1
Sample Output 0

Possible
Impossible
Sample Input 1


2
3
1 3 1
2 1 2
3 3 3
3
0 2 1
1 1 1
2 0 0
Sample Output 1

Impossible
Possible

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    private static boolean greedy(final int[] types, final int[] containers) {
        final int n = types.length;
        for (int i = n - 1; i >= 0; i--) {
            if (types[i] > containers[i]) {
                
            return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] M = new int[n][n];
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextInt();
                }
            }
            final int[] types = new int[n];
            for (int t = 0; t < n; t++) {
                for (int i = 0; i < n; i++) {
                    types[t] += M[i][t];
                }
            }
            
            final int[] containers = new int[n];
            for (int c = 0; c < n; c++) {
                for (int i = 0; i < n; i++) {
                    containers[c] += M[c][i];
                }
            }
            
            Arrays.sort(types);
            Arrays.sort(containers);
            final boolean possible = greedy(types, containers);
            final String answer = possible ? "Possible" : "Impossible";
            System.out.println(answer);
        }
    }
}
