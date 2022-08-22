/*

A video player plays a game in which the character competes in a hurdle race. Hurdles are of varying heights, and the characters have a maximum height they can jump. There is a magic potion they can take that will increase their maximum jump height by 1 unit for each dose. How many doses of the potion must the character take to be able to jump all of the hurdles. If the character can already clear all of the hurdles, return 0.

Example

Height = [1,2,3,3,2]

K = 1

The character can jump 1 unit high initially and must take 3-1=2 doses of potion to be able to jump all of the hurdles.

Function Description

Complete the hurdleRace function in the editor below.

hurdleRace has the following parameter(s):

int k: the height the character can jump naturally
int height[n]: the heights of each hurdle
Returns

int: the minimum number of doses required, always 0 or more
Input Format

The first line contains two space-separated integers  and , the number of hurdles and the maximum height the character can jump naturally.

The second line contains  space-separated integers  where .

Constraints

1<=n, k<=100
1<=height[i]<=100
Sample Input 0

5 4

1 6 3 5 2
Sample Output 0

2

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
        int[] height = new int[n];
        int max = 0;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if ( height[height_i] > max){
                max = height[height_i] ;
            }
        }
        if(k >= max){
            System.out.println("0");
            
        }
        else{
                System.out.println(max-k);
         }
}
}
