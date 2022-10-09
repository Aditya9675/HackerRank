/*

Larry has been given a permutation of a sequence of natural numbers incrementing from 1 as an array. He must determine whether the array can be sorted using the following operation any number of times:

Choose any 3 consecutive indices and rotate their elements in such a way that ABC -> BCA -> CAB -> ABC.
For example, if A = {1, 6, 5, 2, 4, 3}:

A		rotate 
[1,6,5,2,4,3]	[6,5,2]
[1,5,2,6,4,3]	[5,2,6]
[1,2,6,5,4,3]	[5,4,3]
[1,2,6,3,5,4]	[6,3,5]
[1,2,3,5,6,4]	[5,6,4]
[1,2,3,4,5,6]

YES
On a new line for each test case, print YES if  can be fully sorted. Otherwise, print NO.


Function Description

Complete the larrysArray function in the editor below. It must return a string, either YES or NO.

larrysArray has the following parameter(s):

A: an array of integers
Input Format
The first line contains an integer t, the number of test cases.


The next t pairs of lines are as follows:

The first line contains an integer n, the length of A.
The next line contains n space-separated integers A[i].
Constraints
1 <= t <= 10
3 <= n <= 1000
1 <= A[i] <= n
Asorted = integers that increment by 1 from 1 to n
Output Format
For each test case, print YES if A can be fully sorted. Otherwise, print NO.


Sample Input


3
3
3 1 2
4
1 3 4 2
5
1 2 3 5 4
Sample Output

YES
YES
NO
Explanation

In the explanation below, the subscript of A denotes the number of operations performed.


Test Case 0:
A0 = {3, 1, 2} -> rotate(3, 1, 2) -> A1 = {1, 2, 3}
A is now sorted, so we print YES on a new line.

Test Case 1:
A0 = {1, 3, 4, 2} -> rotate(3, 4, 2) -> A1 = {1, 4, 2, 3}.
A1 = {1, 4, 2, 3} -> rotate(4, 2, 3) -> A2 = {1, 2, 3, 4}.
A is now sorted, so we print YES on a new line.

Test Case 2:
No sequence of rotations will result in a sorted A. Thus, we print NO on a new line.


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
        Scanner scan = new Scanner(System.in);
        int c = Integer.parseInt(scan.nextLine());
        for(int i=0;i<c;i++){
            int n = Integer.parseInt(scan.nextLine());
            String[] sp = scan.nextLine().split("\\s+");
            LinkedList<Integer> ll = new LinkedList<Integer>();
            for(int j=0;j<n;j++)ll.add(Integer.parseInt(sp[j]));
            for(int j=0;j<n-2;j++){
                if(ll.get(j)!=j+1){
                    int index = findIndex(ll,j+1);
                    if((index-j)%2==0){
                        int val = ll.remove(index);
                        ll.add(j,val);
                    }
                    else{
                        int val =ll.remove(index);
                        ll.add(j,val);
                        int tmp = ll.remove(j+2);
                        ll.add(j+1,tmp);
                        
                    }
                }
            }
            String res = "YES";
            if(ll.get(n-1) != n)res = "NO";
            System.out.println(res);
        }
    }
    public static int findIndex(LinkedList<Integer> ll, int val){
        for(int i=val;i<ll.size();i++)if(ll.get(i)==val)return i;
            return -1;
    }
}
