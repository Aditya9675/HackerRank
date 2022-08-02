# Birthday Cake Candles Hackerrank Solution in Python
# You are in charge of the cake for a child’s birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

# Example

# candles = [4, 4, 1, 3]
# The maximum height candles are 4 units high. There are 2 of them, so return 2.

# Function Description
# birthdayCakeCandles has the following parameter(s):

# int candles[n]: the candle heights
# Returns

# int: the number of candles that are tallest
# Input Format
# The first line contains a single integer, n, the size of candles[].
# The second line contains n space-separated integers, where each integer i describes the height of candles[i].

# Constraints
# 1 <= n <= 105
# 1 <= candles[i] <= 107
# Sample Input 0


# 4
# 3 2 1 3
# Sample Output 0


# 2
# Explanation 0

# Candle heights are [3, 2, 1, 3]. The tallest candles are 3 units, and there are 2 of them.
#!/bin/python3

import math
import os
import random
import re
import sys


def birthdayCakeCandles(ar):
    c = 0
    temp = ar[0]
    for i in range(1,len(ar)):
        if ar[i] > temp:
            temp = ar[i]
    for i in range(0,len(ar)):
        if ar[i] == temp:
            c = c + 1
    return c
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    ar_count = int(input())

    ar = list(map(int, input().rstrip().split()))

    result = birthdayCakeCandles(ar)

    fptr.write(str(result) + '\n')

    fptr.close()
