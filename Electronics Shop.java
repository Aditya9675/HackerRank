/*
A person wants to determine the most expensive computer keyboard and USB drive that can be purchased with a give budget. Given price lists for keyboards and USB drives and a budget, find the cost to buy them. If it is not possible to buy both items, return .

Example

The person can buy a , or a . Choose the latter as the more expensive option and return .

Function Description

Complete the getMoneySpent function in the editor below.

getMoneySpent has the following parameter(s):

int keyboards[n]: the keyboard prices
int drives[m]: the drive prices
int b: the budget
Returns

int: the maximum that can be spent, or  if it is not possible to buy both items
Input Format

The first line contains three space-separated integers , , and , the budget, the number of keyboard models and the number of USB drive models.
The second line contains  space-separated integers , the prices of each keyboard model.
The third line contains  space-separated integers , the prices of the USB drives.

Constraints

The price of each item is in the inclusive range .
Sample Input 0

10 2 3
3 1
5 2 8
Sample Output 0

 9
 
 */
 
 import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sum = keyboards[i] + pendrives[j];
                if (sum > s)  continue;
                ans = Math.max(ans, sum);
            }  
        }
        System.out.println(ans);
    }
}
