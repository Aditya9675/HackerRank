/*
A space explorer’s ship crashed on Mars! They send a series of SOS messages to Earth for help.

Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string,s , determine how many letters of the SOS message have been changed by radiation.

Example

s=’SOSTOT’


The original message was SOSSOS. Two of the message’s characters were changed in transit.

Function Description

Complete the marsExploration function in the editor below.

marsExploration has the following parameter(s):

string s: the string as received on Earth
Returns

int: the number of letters changed during transmission
Input Format

There is one line of input: a single string,s .

Constraints

1<=length of s <=99
Length of s modulo 3 = 0
s will contain only uppercase English letters, ascii[A-Z].
Sample Input 0

SOSSPSSQSSOR
 

Sample Output 0

3
 

Explanation 0

s = SOSSPSSQSSOR,|s|=12 and signal length . They sent 4 SOS messages (i.e.:12/3=4 ).

Expected signal: SOSSOSSOSSOS

Recieved signal: SOSSPSSQSSOR

Difference:          X  X   X
 

Sample Input 1

SOSSOT
 

Sample Output 1

1
 

Explanation 1

s = SOSSOT, and signal length |S| = 6. They sent 2 SOS messages (i.e.:6/3=2 ).

Expected Signal: SOSSOS     

Received Signal: SOSSOT

Difference:           X
 

Sample Input 2

SOSSOSSOS
 

Sample Output 2

0
 
 
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
        String S = in.next();
        int count =0;
        for(int i=0;i<S.length();i =i+3){
            if(S.charAt(i)!='S'){
                count++;
            } 
            if(S.charAt(i+1)!='O'){
                count++;
                
            }
            
            if(S.charAt(i+2)!='S'){
                count ++;
            }
            
        }
        
        System.out.println(count);
        
    }
}
