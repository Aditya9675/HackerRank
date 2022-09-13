/*

There are a number of people who will be attending ACM-ICPC World Finals. Each of them may be well versed in a number of topics. Given a list of topics known by each attendee, presented as binary strings, determine the maximum number of topics a 2-person team can know. Each subject has a column in the binary string, and a ‘1’ means the subject is known while ‘0’ means it is not. Also determine the number of teams that know the maximum number of topics. Return an integer array with two elements. The first is the maximum number of topics known, and the second is the number of teams that know that number of topics.

Example

n=3

Topics = [‘10101’,’11110’,’00010’]

The attendee data is aligned for clarity below:

10101

11110

00010

 

These are all possible teams that can be formed:

Members Subjects

(1,2)   [1,2,3,4,5]

(1,3)   [1,3,4,5]

(2,3)   [1,2,3,4]

 

In this case, the first team will know all 5 subjects. They are the only team that can be created that knows that many subjects, so [5,1] is returned.

Function Description

Complete the acmTeam function in the editor below.

acmTeam has the following parameter(s):

string topic: a string of binary digits
Returns

int[2]: the maximum topics and the number of teams that know that many topics
Input Format

The first line contains two space-separated integers n and m, where n is the number of attendees and m is the number of topics.

Each of the next n lines contains a binary string of length m.

Constraints

2<=n<=500

Sample Input

4 5

10101

11100

11010

00101
 

Sample Output

5

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
        int N = in.nextInt();
        int M = in.nextInt(); 
        String[] person_info = new String[N];
        
        for (int i = 0; i < N; i++) 
            person_info[i] = in.next();
        long teams = 0;
        long max_covered = 0;
        long matched_topics = 0;
        for (int i = 0; i < N; i++) {
            
            for (int k = i + 1; k < N; k++) {
                matched_topics = 0;
                for (int j = 0; j < M; j++) {
           
                    if (person_info[i].charAt(j) - '0' > 0 || person_info[k].charAt(j) - '0' > 0)
                        matched_topics++;
                }
                if (matched_topics == max_covered)
                    teams++;
                else if (matched_topics > max_covered) {
                    max_covered = matched_topics;
                    teams = 1;   
                }
            }
        }
        
        System.out.println(max_covered);
        System.out.println(teams);
        
        in.close();
    }
}
