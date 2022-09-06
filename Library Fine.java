/*

Your local library needs your help! Given the expected and actual return dates for a library book, create a program that calculates the fine (if any). The fee structure is as follows:

If the book is returned on or before the expected return date, no fine will be charged (i.e.: fine=0).
If the book is returned after the expected return day but still within the same calendar month and year as the expected return date, . fine =15* Number of days late
If the book is returned after the expected return month but still within the same calendar year as the expected return date, the .. fine =500* Number of months late
If the book is returned after the calendar year in which it was expected, there is a fixed fine of 10000 hackos.
Charges are based only on the least precise measure of lateness. For example, whether a book is due January 1, 2017 or December 31, 2017, if it is returned January 1, 2018, that is a year late and the fine would be 10000. hackos.

I have published an ebook. A compilation of 100 Java(Interview)Programming problems which have been solved . I have given clear explanation and the code in the book. Believe me when I say, this will kick start you to achieve the job at your dream company.

Click on this link to get you to the landing page. It is completely free when you use kindle amazon. Take a look at it! Reviews are most Appreciated.

Input Format

The first line contains 3 space-separated integers denoting the respective day, month , year and on which the book was returned.
The second line 3 contains space-separated integers denoting the respective day, month , year and on which the book was due to be returned.

Output Format

Print a single integer denoting the library fine for the book received as input.

Sample Input

9 6 2015
6 6 2015
Sample Output

45


*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WarmLibraryFine {

    public static void main(String x[]) {
        WarmLibraryFine o = new WarmLibraryFine();
        o.run();
    }

    void run() {
        try (final Scanner in = new Scanner(System.in, "ascii")) {

            final int fine;

            final int aday = in.nextInt();
            final int amon = in.nextInt();
            final int ayr = in.nextInt();

            final int eday = in.nextInt();
            final int emon = in.nextInt();
            final int eyr = in.nextInt();

            if (ayr < eyr) {
                fine = 0;
            } else if (ayr > eyr) {
                fine = 10_000;
            } else if (amon < emon) {
                fine = 0;
            } else if (amon > emon) {
                fine = 500 * (amon - emon);
            } else if (aday > eday) {
                fine = 15 * (aday - eday);
            } else {
                fine = 0;
            }
            System.out.println(fine);
        }
    }
}
