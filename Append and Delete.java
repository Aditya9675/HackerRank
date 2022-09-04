/*

You have two strings of lowercase English letters. You can perform two types of operations on the first string:

Append a lowercase English letter to the end of the string.
Delete the last character of the string. Performing this operation on an empty string results in an empty string.
Given an integer,k , and two strings,s  and t, determine whether or not you can convert s to t by performing exactly k of the above operations on s. If it’s possible, print Yes. Otherwise, print No.

Example. 
s = [a,b,c]

t = [d,e,f]

k = 6

To convert s to t, we first delete all of the characters in 3 moves. Next we add each of the characters of t in order. On the 6th move, you will have the matching string. Return Yes.

If there were more moves available, they could have been eliminated by performing multiple deletions on an empty string. If there were fewer than 6 moves, we would not have succeeded in creating the new string.

Function Description

Complete the appendAndDelete function in the editor below. It should return a string, either Yes or No.

appendAndDelete has the following parameter(s):

string s: the initial string
string t: the desired string
int k: the exact number of operations that must be performed
Returns

string: either Yes or No
Input Format

The first line contains a string s, the initial string.

The second line contains a string t, the desired final string.

The third line contains an integer k, the number of operations.

Constraints

1<=s<=100
1<=t<=100
1<=k<=100
s and t consist of lowercase English letters, ascii[a-z] .
Sample Input 0

hackerhappy

hackerrank

9
 

Sample Output 0

Yes

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
        final Scanner in = new Scanner(System.in);
        final String s = in.next();
        final String t = in.next();
        int k = in.nextInt();
        final int sL = s.length();
        final int tL = t.length();
        
        int lastCommon = -1;
        while(lastCommon + 1 < sL && lastCommon + 1 < tL && s.charAt(lastCommon+1) == t.charAt(lastCommon+1)) {
            lastCommon++;
        }
        
        if(lastCommon == -1) { // If strings are different
            if(k >= tL + sL) { // If k more then target lenght and remainder is even
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            int sDiff = sL - lastCommon - 1;
            int tDiff = tL - lastCommon - 1;
            if(k >= tL + sL) {
                System.out.println("Yes");
            } else if(k >= sDiff + tDiff && (k - sDiff -tDiff)%2 == 0) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}

