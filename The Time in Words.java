/*

Given the time in numerals we may convert it into words, as shown below:

5:00 -> five o’ clock
5:01 -> one minute past five
5:10 -> ten minute past five
5:15 -> quarter past five
5:30 -> half past five
5:40 -> twenty minutes to six
5:45 -> quarter to six
5:47 -> thirteen minutes to six
5:28 -> twenty eight minutes past five

At minutes = 0, use o’ clock. For 1 <= minutes <= 30, use past, and for 30 < minutes use to. Note the space between the apostrophe and clock in o’ clock. Write a program which prints the time in words for the input given in the format described.

Function Description

Complete the timeInWords function in the editor below.

timeInWords has the following parameter(s):

int h: the hour of the day
int m: the minutes after the hour
Returns


string: a time string as described
Input Format
The first line contains h, the hours portion The second line contains m, the minutes portion

Constraints
1 <= h <= 12
0 <= m < 60
Sample Input 0

5
47
Sample Output 0


thirteen minutes to six
Sample Input 1

3
00
Sample Output 1

three o' clock
Sample Input 2


7
15
Sample Output 2

quarter past seven

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
        Integer hour = Integer.parseInt(sc.nextLine());
        Integer min = Integer.parseInt(sc.nextLine());
        String[] numNames = { "", " one", " two", " three", " four", " five",
                " six", " seven", " eight", " nine", " ten", " eleven",
                " twelve", " thirteen", " fourteen", " fifteen", " sixteen",
                " seventeen", " eighteen", " nineteen" };
        String[] tensNames = { "", " ten", " twenty", " thirty", " fourty",
                " fifty", " sixty", " seventy", " eighty", " ninety" };
        String sepString1 = " minutes past ";
        String sepString2 = " minutes to ";
        String minString = "";
        if (min == 0)
            System.out.println(numNames[hour].trim() + " o' clock");
        else if (min == 15)
            System.out.println("quarter past " + numNames[hour].trim());
        else if (min < 30) {
            if (min == 1)
                sepString1 = " minute past ";
            if (min < 20)
                minString = numNames[min % 20];
            else {
                minString = numNames[min % 10];
                min /= 10;
                minString = tensNames[min % 10] + minString;
            }
            System.out.println(minString.trim() + sepString1
                    + numNames[hour].trim());
        } else if (min == 30)
            System.out.println("half past " + numNames[hour].trim());
        else if (min == 45)
            System.out.println("quarter to "
                    + numNames[hour + 1 < 12 ? hour + 1 : 1].trim());
        else if (min > 30) {
            min = 60 - min;
            if (min == 1)
                sepString2 = " minute to ";
            if (min < 20)
                minString = numNames[min % 20];
            else {
                minString = numNames[min % 10];
                min /= 10;
                minString = tensNames[min % 10] + minString;
            }
            System.out.println(minString.trim() + sepString2
                    + numNames[hour + 1 <= 12 ? hour + 1 : 1].trim());
        }
    }
}
