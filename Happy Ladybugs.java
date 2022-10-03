/*

Happy Ladybugs is a board game having the following properties:

The board is represented by a string, b, of length n. The ith character of the string,b[i] , denotes ith the cell of the board.


If b[i] is an underscore (i.e., _), it means the ith cell of the board is empty.

If b[i] is an uppercase English alphabetic letter (ascii[A-Z]), it means the ith cell contains a ladybug of color b[i].
String b will not contain any other characters.

A ladybug is happy only when its left or right adjacent cell (i.e.,b[i+1] ) is occupied by another ladybug having the same color.

In a single move, you can move a ladybug from its current position to any empty cell.

Given the values of n and b for games of Happy Ladybugs, determine if it’s possible to make all the ladybugs happy. For each game, print YES on a new line if all the ladybugs can be made happy through some number of moves. Otherwise, print NO.

As an example,b=[YYR_B_BR] . You can move the rightmost B and R to make b=[YYRRBB_] and all the ladybugs are happy.


Function Description

Complete the happyLadybugs function in the editor below. It should return an array of strings, either ‘YES’ or ‘NO’, one for each test string.

happyLadybugs has the following parameters:

b: an array of strings that represents the initial positions and colors of the ladybugs

Input Format

The first line contains an integer g, the number of games.

The next g pairs of lines are in the following format:

The first line contains an integer n, the number of cells on the board.
The second line contains a string b describing the n cells of the board.
Constraints

Output Format

For each game, print YES on a new line if it is possible to make all the ladybugs happy. Otherwise, print NO.


Sample Input 0

4
7
RBY_YBR
6
X_Y__X
2
__
6
B_RRBR
Sample Output 0

YES
NO
YES
YES

*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static boolean isHappyAlready(char c[]){
        int l=0,r=0;
        for(int i=0;i<c.length;i++){
            l=i-1;
            r=i+1;
            if(l>=0){
                if(c[l]==c[i]) continue;
            }
            if(r<c.length){
                if(c[r]==c[i]) continue;
            }
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        String result="NO";
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            char[] b = in.next().toCharArray();
            
            char[] cs=new char[27];
            char c=0;
            for(int i=0;i<b.length;i++){
                c=b[i];
                if(c != '_')cs[c-'A']++;
                else cs[26]++;
            }
            result="YES";
            for(int i=0;i<26;i++){
                if(cs[i]==1) {result="NO";break;}
            }
            if(result=="YES"){
               
                if(cs[26]==0 && !isHappyAlready(b)){
                    result="NO";
                }
            }
            System.out.println(result);
        }
    }
}
