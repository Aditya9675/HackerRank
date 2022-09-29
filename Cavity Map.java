/*

You are given a square map as a matrix of integer strings. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side, or edge.

Find all the cavities on the map and replace their depths with the uppercase character X.

Example

grid=[‘989′,’191′,’111’]

The grid is rearranged for clarity:

989
191
111
Return:

989
1X1
111
The center cell was deeper than those on its edges: [8,1,1,1]. The deep cells in the top two corners do not share an edge with the center cell, and none of the border cells is eligible.

Function Description

Complete the cavityMap function in the editor below.

cavityMap has the following parameter(s):

string grid[n]: each string represents a row of the grid
Returns

string{n}: the modified grid
Input Format

The first line contains an integer , the number of rows and columns in the grid.

Each of the following lines (rows) contains positive digits without spaces (columns) that represent the depth at .

Sample Input

STDIN Function
----- --------
4 grid[] size n = 4
1112 grid = ['1112', '1912', '1892', '1234']
1912
1892
1234
Sample Output

1112
1X12
18X2
1234
Explanation

The two cells with the depth of 9 are not on the border and are surrounded on all sides by shallower cells. Their values are replaced by X.

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
        int n = Integer.parseInt(in.nextLine());
        int[][] array = new int[n][n];
        int[][] target = new int[n][n];
        for(int i=0; i<n; i++){
            String line = in.nextLine();
            char[] data = line.toCharArray();
            for(int j=0; j<n; j++){
                array[i][j] = Character.getNumericValue(data[j]);
            }
        }
        cavityMap(array, target);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(target[i][j] == -1)
                    System.out.print("X");
                else
                    System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
    
    public static void cavityMap(int[][] array, int[][] target) {
        int row = array.length;
        int col = array[0].length;
        for(int i=1; i<row-1; i++){
            for(int j=1; j<col-1; j++){
                if(isMaximum(array, i, j)){
                    target[i][j] = -1; 
                }
            }
        }
    }
    
    public static boolean isMaximum(int[][] array, int i, int j) {
        int max = Math.max(Math.max(array[i-1][j], array[i+1][j]), Math.max(array[i][j-1], array[i][j+1]));
        if(max >= array[i][j])
            return false;
        else
            return true;
    }
}

