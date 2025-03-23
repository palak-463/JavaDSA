
/*
29) Trapping Rainwater Problem using two pointers:
Trapping Rainwater Problem states that given an array of n non-negative integers arr [] representing an elevation map where the width of each bar is 1, compute how much water it can trap after rain.
An element of the array can store water if there are higher bars on the left and the right.
The amount of water to be stored in every position can be found by finding the heights of the higher bars on the left and right sides.
The total amount of water stored is the summation of the water stored in each index.
No water can be filled if there is no boundary on both sides.
If we consider a subarray arr [left … right], we can decide the amount of water either for arr [left] or arr [right] if we know the left max (max element in arr [0 … left - 1]) and right max (max element in arr [right + 1… n-1].
If left max is less than the right max, then we can decide for arr [left].
Else we can decide for arr [right].
If we decide for arr [left], then the amount of water would be left max – arr [left].
Let us consider the case when left max is less than the right max.
For arr [left], we know left max for it and we also know that the right max for it would not be less than left max because we already have a greater value in arr [right ... n - 1].
Any other value from left + 1 to right – 1 would anyways be more than left max.
*/

import java.io.*;
import java.util.*;
class ArrayTrappingRainwaterProblem
{
    static int maxWater (int [] arr)
    {
        int left = 1;
        int right = arr.length - 2;
        int lmax = arr [left - 1];
        int rmax = arr [right + 1];
        int res = 0;
        while (left <= right)
        {
            if (rmax <= lmax)
            {
                res += Math.max (0, rmax - arr [right]);
                rmax = Math.max (rmax, arr [right]);
                right -= 1;
            }
            else
            {
                res += Math.max (0, lmax - arr [left]);
                lmax = Math.max (lmax, arr [left]);
                left += 1;
            }
        }
        return res;
    }
    public static void main (String [] args)
    {
        int [] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1,2 ,1};
        System.out.println (maxWater (arr));
    }
}

/*
Time complexity:
O (N)
Auxiliary Space:
O (1)
*/
