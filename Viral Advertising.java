/*

HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly 5 people on social media.

On the first day, half of those 5 people (i.e.,floor ) like the advertisement and each shares it with  3 of their friends. At the beginning of the second day,  people receive the advertisement.

Each day,  of the recipients like the advertisement and will share it with  friends on the following day. Assuming nobody receives the advertisement twice, determine how many people have liked the ad by the end of a given day, beginning with launch day as day .

Example

.n=5

Day Shared Liked Cumulative

1      5     2       2

2      6     3       5

3      9     4       9

4     12     6      15

5     18     9      24
 

The progression is shown above. The cumulative number of likes on the 5th day is 24.

Function Description

Complete the viralAdvertising function in the editor below.

viralAdvertising has the following parameter(s):

int n: the day number to report
Returns

int: the cumulative likes at that day
Input Format

A single integer,n , the day number.

Constraints

1<=n<=50
Sample Input

3
Sample Output

9
 
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
        int received = 5;
        int sum=0;
        while(n-- >0){
            int remaining = received/2;
            sum+=remaining;
            received = remaining*3;
        }
        System.out.println(sum);

    }
}
