/*
Lily likes to play games with integers. She has created a new game where she determines the difference between a number and its reverse. For instance, given the number 12, its reverse is 21. Their difference is 9. The number 120 reversed is 21, and their difference is 99.

She decides to apply her game to decision making. She will look at a numbered range of days and will only go to a movie on a beautiful day.

Given a range of numbered days, [i.....j] and a number k, determine the number of days in the range that are beautiful. Beautiful numbers are defined as numbers where | i - reverse(i) | is evenly divisible by k. If a day's value is a beautiful number, it is a beautiful day. Return the number of beautiful days in the range.


Function Description

Complete the beautifulDays function in the editor below.

beautifulDays has the following parameter(s):

int i: the starting day number
int j: the ending day number
int k: the divisor

Returns

int: the number of beautiful days in the range


Input Format

A single line of three space-separated integers describing the respective values of i, j, and k.


Constraints
1 <= i <= j <= 2*10^6
1 <= k <= 2*10^9

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
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        int count = 0;
        
        for (int a=i;j>a; a++){
            StringBuilder temp = new StringBuilder();
            temp.append(a);
            temp=temp.reverse();
            String temp1 = temp.toString();
            int aRev = Integer.parseInt(temp1);
            if(Math.abs((a-aRev)%k)==0){
                count++;
            }
        }
        
        System.out.println(count);
    }
}
