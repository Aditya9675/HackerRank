/*

An English text needs to be encrypted using the following encryption scheme.

First, the spaces are removed from the text. Let  be the length of this text.

Then, characters are written into a grid, whose rows and columns have the following constraints:

Example

After removing spaces, the string is  characters long.  is between  and , so it is written in the form of a grid with 7 rows and 8 columns.

ifmanwas  

meanttos       

tayonthe  

groundgo  

dwouldha  

vegivenu  

sroots
Ensure that 
If multiple grids satisfy the above conditions, choose the one with the minimum area, i.e. .
The encoded message is obtained by displaying the characters of each column, with a space between column texts. The encoded message for the grid above is:

imtgdvs fearwer mayoogo anouuio ntnnlvt wttddes aohghn sseoau

Create a function to encode a message.

Function Description

Complete the encryption function in the editor below.

encryption has the following parameter(s):

string s: a string to encrypt
Returns

string: the encrypted string
Input Format

One line of text, the string 

Constraints

 contains characters in the range ascii[a-z] and space, ascii(32).

Sample Input

haveaniceday
 

Sample Output 0

hae and via ecy

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
       
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int size = input.length();
        int rowSize = (int)Math.floor(Math.sqrt(size));
        int colSize = (int)Math.ceil(Math.sqrt(size));
       
        while(colSize>rowSize){
            colSize--;
            if((colSize*rowSize)<size){
                colSize++;
                break;
            }
        }
        while((colSize*rowSize)<size&&(colSize>rowSize)){
            rowSize++;
        }
        
        for(int i =0;i<colSize;i++){
            
            int row = 0;
            while(row<=rowSize-1){
                if((i+row*colSize)<size)
                {
                    System.out.print(input.charAt(i+row*colSize)); 
                     row++;
                }     else{
                    break;
                }        
             
            }
            System.out.print(" ");
        }
    }
}
