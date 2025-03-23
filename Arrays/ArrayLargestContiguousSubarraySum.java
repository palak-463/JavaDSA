
/*
8) Largest Sum Contiguous Subarray / Kadane’s Algorithm:
Initialize the variables max_so_far = int_min and max_ending_here = 0.
Run a for loop from 0 to N - 1 and for each index i.
Add the arr [i] to max_ending_here.
If  max_so_far is less than max_ending_here then update max_so_far to max_ending_here.
If max_ending_here < 0 then update max_ending_here = 0.
Return max_so_far.
*/

import java.io.*;
import java.util.*;
class ArrayLargestContiguousSubarraySum
{
    static int MaxSum (int [] a)
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        for (int i = 0; i < size; i ++)
        {
            max_ending_here = max_ending_here + a [i];
            if (max_so_far < max_ending_here)
            {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0)
            {
                max_ending_here = 0;
            }
        }
        return max_so_far;
    }
    public static void main (String [] args)
    {
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println ("Maximum contiguous sum: " + MaxSum (a));
    }
}

/*
Time Complexity:
O (N)
Auxiliary Space:
O (1)
*/
