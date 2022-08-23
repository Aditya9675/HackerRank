/*
When a contiguous block of text is selected in a PDF viewer, the selection is highlighted with a blue rectangle. In this PDF viewer, each word is highlighted independently. 

There is a list of 26 character heights aligned by index to their letters. For example, ‘a’ is at index 0 and ‘z’ is at index 25. There will also be a string. Using the letter heights given, determine the area of the rectangle highlight in (mm)^2 assuming all letters are  wide.

Function Description

Complete the designerPdfViewer function in the editor below.

designerPdfViewer has the following parameter(s):

int h[26]: the heights of each letter
string word: a string
Returns

int: the size of the highlighted area
Input Format

The first line contains 26 space-separated integers describing the respective heights of each consecutive lowercase English letter, ascii[a-z].

The second line contains a single word consisting of lowercase English alphabetic letters.

Constraints

1<=h[?]<=7, where  is an English lowercase letter.
word contains no more than  letters.
Sample Input 0

1 3 1 3 1 4 1 3 2 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5

abc
Sample Output 0

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
    int[] c = new int[26];
    for (int i = 0; i < 26; ++i) {
      c[i] = in.nextInt();
    }
    String w = in.next();
    int maxH = 0;
    for (char letter : w.toCharArray()) {
      if (c[letter - 'a'] > maxH) maxH = c[letter - 'a'];
    }
    System.out.println(maxH*w.length());
  }



}
