/*

Given a string, remove characters until the string is made up of any two alternating characters. When you choose a character to remove, all instances of that character must be removed. Determine the longest string possible that contains just two alternating letters.

**Example88.


 
$s = \text{abaacdabd}$

Delete a, to leave bcdbd. Now, remove the character c to leave the valid string bdbd with a length of 4. Removing either b or d at any point would not result in a valid string.

Given a string $s$, convert it to the longest possible string $t$ made up only of alternating characters. Print the length of string $t$ on a new line. If no string $t$ can be formed, print $0$ instead.

 

Function Description

Complete the alternate function in the editor below.

alternate has the following parameter(s):

string s: a string
Returns.

int: the length of the longest valid string, or $0$ if there are none
Input Format

The first line contains a single integer that denotes the length of s.

The second line contains string s.

Constraints

1<=lengthofs<=1000
S[i] belongs to ascii[a-z]
Sample Input

10

beabeefeab
 

Sample Output

5
 

Explanation

The characters present in s are a, b, e, and f. This means that t must consist of two of those characters and we must delete two others. Our choices for characters to leave are [a,b], [a,e], [a, f], [b, e], [b, f] and [e, f].

If we delete e and f, the resulting string is babab. This is a valid t as there are only two distinct characters (a and b), and they are alternating within the string.

If we delete a and f, the resulting string is bebeeeb. This is not a valid string t because there are consecutive e’s present. Removing them would leave consecutive b’s, so this fails to produce a valid string t.
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
        String str = in.next();
        HashSet<Character> set = new HashSet<Character>();
        char[] ar = str.toCharArray();
        for (char c : ar) set.add(c);
        int ans = 0;
        Character[] keys = set.toArray(new Character[set.size()]);
        for (int i = 0 ; i < set.size() ; i++) {
            for (int j = i+1 ; j < set.size() ; j++) {
                String b = str;
                for (char c : set) {
                    if (c != keys[i] && c != keys[j]) b = b.replace(c + "", "");
                }
                
                char[] ts = b.toCharArray();
                boolean valid = ts.length > 0;
                for (int k = 0 ; valid && k < ts.length - 1 ; k++) {
                    if (ts[k] == ts[k+1]) valid = false; 
                }
                if (valid) ans = Math.max(ans, ts.length);
            }
        }
        System.out.println(ans);
    }
}

