/*


Complete the beautifulTriplets function in the editor below. It must return an integer that represents the number of beautiful triplets in the sequence.

beautifulTriplets has the following parameters:

d: an integer
arr: an array of integers, sorted ascending
 

Input Format

The first line contains 2 space-separated integers n and d, the length of the sequence and the beautiful difference.
The second line contains n space-separated integers arr[i].

Output Format

Print a single line denoting the number of beautiful triplets in the sequence.

Sample Input

7 3
1 2 4 5 7 8 10
Sample Output

3
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
        int d = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int ans = solve(n, d, a);
        System.out.println(ans);
    }

    private static int solve(int n, int d, int[] a) {
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();

        int r = 0;
        for (int i = 0; i < n; i++) {
            if (m2.containsKey(a[i])) {
                int c = m2.remove(a[i]);
                r += c;
            }
            if (m1.containsKey(a[i])) {
                int c = m1.remove(a[i]);
                m2.put(a[i] + d, c);
            }
            add(m1, a[i]+d);
        }
        return r;
    }

    private static void add(Map<Integer, Integer> map, int key) {
        Integer old = map.get(key);
        if (old == null) {
            old = 0;
        }
        old++;
        map.put(key, old);
    }
}
