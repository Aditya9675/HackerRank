/*


You are the benevolent ruler of Rankhacker Castle, and today you’re distributing bread. Your subjects are in a line, and some of them already have some loaves. Times are hard and your castle’s food stocks are dwindling, so you must distribute as few loaves as possible according to the following rules:

Every time you give a loaf of bread to some person i, you must also give a loaf of bread to the person immediately in front of or behind them in the line (i.e., persons i+1 or i-1 ).
After all the bread is distributed, each person must have an even number of loaves.
Given the number of loaves already held by each citizen, find and print the minimum number of loaves you must distribute to satisfy the two rules above. If this is not possible, print NO.

For example, the people in line have loaves B=[4,5,6,7]. We can first give a loaf to i=3 and i=4 so B = [4,5,7,8]. Next we give a loaf to i=2 and i=3 and have B=[4,6,8,8] which satisfies our conditions. We had to distribute 4 loaves.

Function Description

Complete the fairRations function in the editor below. It should return an integer that represents the minimum number of loaves required.

fairRations has the following parameter(s):

B: an array of integers that represent the number of loaves each persons starts with .
Input Format

The first line contains an integer , the number of subjects in the bread line.

The second line contains space-separated integers .

Output Format

Print a single integer taht denotes the minimum number of loaves that must be distributed so that every person has an even number of loaves. If it’s not possible to do this, print NO.

Sample Input 0

5
2 3 4 5 6
Sample Output 0

4
Sample Input 1

2
1 2
Sample Output 1

NO
Explanation 1

The initial distribution is (1,2). As there are only 2 people in the line, any time you give one person a loaf you must always give the other person a loaf. Because the first person has an odd number of loaves and the second person has an even number of loaves, no amount of distributed loaves will ever result in both subjects having an even number of loaves.


*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    
    static Scanner in = new Scanner(new BufferedInputStream(System.in));
    static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static void main(String args[]) {
        int n = in.nextInt();
        int lst = 0;
        int ans = 0;
        for(int i = 0; i < n; i ++) {
            int now = in.nextInt();
            now += lst;
            if(now % 2 != 0) {
                ans += 2;
                lst = 1;
            } else lst = 0;
        }
        if(lst == 1) out.println("NO");
        else out.println(ans);
        out.flush();
    }
    
    static class pii implements Comparable<pii> {
        int X, Y;
        public int compareTo(pii a) {
            return this.X - a.X;
        }
    }
}
