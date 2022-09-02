/*

The factorial of the integer n, written n!, is defined as:

Calculate and print the factorial of a given integer.

For example, if n=30, we calculate 30*29*28*….*2*1 and get .

Function Description

Complete the extraLongFactorials function in the editor below. It should print the result and return.

extraLongFactorials has the following parameter(s):

n: an integer

Note: Factorials of n>20 can’t be stored even in a 64-bit long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.

We recommend solving this challenge using BigIntegers.

Input Format

Input consists of a single integer n

Constraints

1<=n<=100

Output Format

Print the factorial of n.

Sample Input

25

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
        BigInteger x = BigInteger.valueOf(n);
        n = n - 1;
        while(n > 0){
            x = x.multiply(BigInteger.valueOf(n));
            n = n-1;
        }
        
        System.out.println(x.toString());
       
    }
}
