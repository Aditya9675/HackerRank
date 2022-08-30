/*

Given a sequence of  integers,  where each element is distinct and satisfies . For each  where , find any integer  such that  and print the value of  on a new line.

For example, assume the sequence . Each value of  between  and , the length of the sequence, is analyzed as follows:

The values for  are .

Function Description

Complete the permutationEquation function in the editor below. It should return an array of integers that represent the values of .

permutationEquation has the following parameter(s):

p: an array of integers
Input Format

The first line contains an integer , the number of elements in the sequence.

The second line contains  space-separated integers  where ..

Output Format

For each  from  to , print an integer denoting any valid  satisfying the equation  on a new line.

Sample Input 0

3

2 3 1
 

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
    public static void main(String args[] ) throws Exception {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=in.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                if(i==a[j]){
                  for(int k=0;k<n;k++)  {
                      if((j+1)==a[k])
                          System.out.println(k+1);
                  }
                }
            }
        }
    }
}
