/*

You will be given a square chess board with one queen and a number of obstacles placed on it. Determine how many squares the queen can attack.

A queen is standing on an  chessboard. The chess board’s rows are numbered from  to , going from bottom to top. Its columns are numbered from  to , going from left to right. Each square is referenced by a tuple, , describing the row, , and column, , where the square is located.

The queen is standing at position . In a single move, she can attack any square in any of the eight directions (left, right, up, down, and the four diagonals). In the diagram below, the green circles denote all the cells the queen can attack from :

There are obstacles on the chessboard, each preventing the queen from attacking any square beyond it on that path. For example, an obstacle at location  in the diagram above prevents the queen from attacking cells , , and :

Given the queen’s position and the locations of all the obstacles, find and print the number of squares the queen can attack from her position at . In the board above, there are  such squares.

Function Description

Complete the queensAttack function in the editor below. It should return an integer that describes the number of squares the queen can attack.

queensAttack has the following parameters:

– n: an integer, the number of rows and columns in the board

– k: an integer, the number of obstacles on the board

– r_q: integer, the row number of the queen’s position

– c_q: integer, the column number of the queen’s position

– obstacles: a two dimensional array of integers where each element is an array of  integers, the row and column of an obstacle

Input Format

The first line contains two space-separated integers  and , the length of the board’s sides and the number of obstacles.

The next line contains two space-separated integers  and , the queen’s row and column position.

Each of the next  lines contains two space-separated integers  and , the row and column position of .

Output Format

Print the number of squares that the queen can attack from position .

Sample Input 0

4 0

4 4
 

Sample Output 0

9
 

Explanation 0

The queen is standing at position  on a  chessboard with no obstacles:

Sample Input 1

5 3

4 3

5 5

4 2

2 3
 

Sample Output 1

10
 

Explanation 1

The queen is standing at position  on a  chessboard with  obstacles:

The number of squares she can attack from that position is .

Sample Input 2

1 0

1 1
 

Sample Output 2

0
 

Explanation 2

Since there is only one square, and the queen is on it, the queen can move 0 squares.


*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public final class Solution {
  public static final void main(String[] args) {
    int n, rq, cq;
    Set<Long> o;
    try (Scanner in = new Scanner(System.in)) {
      n = in.nextInt();
      int k = in.nextInt();
      rq = in.nextInt();
      cq = in.nextInt();
      o = new HashSet<>(k);
      while (k --> 0) {
        int ro = in.nextInt(), co = in.nextInt();
        o.add((long)ro << 32 | co);
      }
    }
    int t = 0;
    for (int d[] : new int[][] {{-1, -1}, {-1,  0}, {-1, +1},
                                { 0, -1},           { 0, +1},
                                {+1, -1}, {+1,  0}, {+1, +1}}) {
      for (int r = rq + d[0], c = cq + d[1];
           1 <= r && r <= n && 1 <= c && c <= n && !o.contains((long)r << 32 | c);
           r += d[0], c += d[1]) {
        t++;
      }
    }
    System.out.println(t);
  }
}


