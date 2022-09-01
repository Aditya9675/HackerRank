/*

An integer d is a divisor of an integer n if the remainder of n/d=0.

Given an integer, for each digit that makes up the integer determine whether it is a divisor. Count the number of divisors occurring within the integer.

Example

n=124

Check whether 1,2  and 4 are divisors of 124. All 3 numbers divide evenly into124  so return 3.

Check whether 1,1 , and 1 are divisors of 111. All 3 numbers divide evenly into 111 so return 3.

Check whether 1 and 0 are divisors of 10. 1 is, but 0 is not. Return 1.

Function Description

Complete the findDigits function in the editor below.

findDigits has the following parameter(s):

int n: the value to analyze
Returns

int: the number of digits in n that are divisors of n
Input Format

The first line is an integer,t , the number of test cases.

The t subsequent lines each contain an integer,n .

Sample Input

2

12

1012
 

Sample Output

2

3
 
 */
 
 
 import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
     public static void main(String[] args){
        int t;
        Scanner scan = new Scanner(System.in);
        
        t = scan.nextInt();
        
        for(int i = 0; i < t; i++){
            System.out.println(digits(scan.next()));
        }
        
        scan.close();
    }
    private static int digits(String number) {
       
       int sum = 0;
       char[] digits = number.toCharArray();
      
       for(int i = 0; i < number.length(); i++){
            if(Character.getNumericValue(digits[i]) != 0){ 
                if(((Integer.parseInt(number))% (Character.getNumericValue(digits[i]))) == 0){
                    sum++;
                }
            }
            else
                continue;
       }
           
        return sum;
    }
}

