/*

The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter.

A Utopian Tree sapling with a height of 1 meter is planted at the onset of spring. How tall will the tree be after n growth cycles?

For example, if the number of growth cycles is n=5, the calculations are as follows:

Period  Height

0          1

1          2

2          3

3          6

4          7

5          14
 

Function Description

Complete the utopianTree function in the editor below.

utopianTree has the following parameter(s):

int n: the number of growth cycles to simulate
Returns

int: the height of the tree after the given number of cycles
Input Format

The first line contains an integer,t , the number of test cases.

t subsequent lines each contain an integer,n , the number of cycles for that test case.

Constraints

1<=t<=10

0<=n<=60

Sample Input

3

0

1

4
Sample Output

1

2

7

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
        final int 
            MONSOON = 100, 
            SUMMER = 200;
        Scanner input = new Scanner(System.in);
        int caseCount = Integer.parseInt(input.nextLine());
        for (int i = 0; i < caseCount; i++) {
            int treeHeight = 1;
            int cycleType = MONSOON;
            int cycleCount = Integer.parseInt(input.nextLine());
            for (int j = 0; j < cycleCount; j++) {
                switch (cycleType) {
                case MONSOON:
                    treeHeight = treeHeight * 2;
                    cycleType = SUMMER;
                    break;
                case SUMMER:
                    treeHeight += 1;
                    cycleType = MONSOON;
                    break;
                }
            }
            System.out.println(treeHeight);
        }
    }
}

