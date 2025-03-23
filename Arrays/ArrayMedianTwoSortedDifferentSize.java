/*
36) Median of two sorted arrays of different size using Binary Search:
The approach is similar to the Binary Search approach of Median of two sorted arrays of same size with the only difference that here we apply binary search on the smaller array instead of a [].
Consider the first array is smaller.
If first array is greater, then swap the arrays to make sure that the first array is smaller.
We mainly maintain two sets in this algorithm by doing binary search in the smaller array.
Let mid1 be the partition of the smaller array.
The first set contains elements from 0 to (mid1 – 1) from smaller array and mid2 = ((n + m + 1) / 2 – mid1) elements from the greater array to make sure that the first set has exactly (n + m + 1) / 2 elements.
The second set contains remaining half elements.
Our target is to find a point in both arrays such that all elements in the first set are smaller than all elements in the elements in the other set (set that contains elements from right side).
For this we validate the partitions using the same way as we did in Median of two sorted arrays of same size.
*/

import java.io.*;
import java.util.*;
class ArrayMedianTwoSortedDifferentSize
{
    static double Median (int [] a, int [] b)
    {
        int n = a.length, m = b.length;
        if (n > m)
        {
            return Median (b, a);
        }
        int lo = 0, hi = n;
        while (lo <= hi)
        {
            int mid1 = (lo + hi) / 2;
            int mid2 = (n + m + 1) / 2 - mid1;
            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : a[mid1 - 1];
            int r1 = (mid1 == n) ? Integer.MAX_VALUE : a[mid1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : b[mid2 - 1];
            int r2 = (mid2 == m) ? Integer.MAX_VALUE : b[mid2];
            if (l1 <= r2 && l2 <= r1)
            {
                if ((n + m) % 2 == 0)
                {
                    return (Math.max (l1, l2) + Math.min (r1, r2)) / 2.0;
                }
                else
                {
                    return Math.max (l1, l2);
                }
            }
            if (l1 > r2)
            {
                hi = mid1 - 1;
            }
            else
            {
                lo = mid1 + 1;
            }
        }
        return 0;
    }
    public static void main (String [] args)
    {
        int [] a = {1, 12, 15, 26, 28};
        int [] b = {2, 13, 17, 30, 45, 60};
        System.out.println (Median (a, b));
    }
}

/*
Time Complexity:
O (log (min (M, N))),
since binary search is applied on the smaller array.
Auxiliary Space:
O (1)
*/