/*

In Insertion Sort Part 1, you inserted one element into an array at its correct sorted position. Using the same approach repeatedly, can you sort an entire array?

Guideline: You already can place an element into a sorted array. How can you use that code to build up a sorted array, one element at a time? Note that in the first step, when you consider an array with just the first element, it is already sorted since there’s nothing to compare it to.

In this challenge, print the array after each iteration of the insertion sort, i.e., whenever the next element has been inserted at its correct position. Since the array composed of just the first element is already sorted, begin printing after placing the second element.


Example.

n = 7

arr = [3,4,7,5,6,2,1]

Working from left to right, we get the following output:

3 4 7 5 6 2 1

3 4 7 5 6 2 1

3 4 5 7 6 2 1

3 4 5 6 7 2 1

2 3 4 5 6 7 1

1 2 3 4 5 6 7
 

Function Description

Complete the insertionSort2 function in the editor below.

insertionSort2 has the following parameter(s):

int n: the length of arr
int arr[n]: an array of integers
Prints



At each iteration, print the array as space-separated integers on its own line.

Input Format

The first line contains an integer,n , the size of arr.

The next line contains n space-separated integers arr[i].

Constraints

1<=n<=1000

1000<=arr[i]<=10000, 0<=i

Output Format

Print the entire array on a new line at every iteration.


Sample Input

STDIN           Function

-----           --------

6               n = 6

1 4 3 5 6 2     arr = [1, 4, 3, 5, 6, 2]
 

Sample Output

1 4 3 5 6 2 

1 3 4 5 6 2 

1 3 4 5 6 2 

1 3 4 5 6 2 

1 2 3 4 5 6  


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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        int k = scanner.nextInt();
        
        StringBuilder builder = new StringBuilder(input.length());
        for (int i = 0; i < n; i++) {
            char temp = input.charAt(i);
            boolean upperCase = Character.isUpperCase(temp);
            if (Character.isLetter(temp)) {
                temp += k%26;
                if (!Character.isLetter(temp) || (upperCase && !Character.isUpperCase(temp))) {
                    temp -= 26;
                }
            }
            builder.append(temp);
        }
        
        System.out.println(builder.toString());
    }
}
  
