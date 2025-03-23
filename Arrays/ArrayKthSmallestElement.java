
/*
3) Kth smallest element in Unsorted Array using Sorting:
Sort the input array in the increasing order.
Return the element at the K - 1 index (0 – Based indexing) in the sorted array.
*/

import java.io.*;
import java.util.*;
class ArrayKthSmallestElement
{
    public static int KthSmallest (int [] arr, int k)
    {
        Arrays.sort (arr);
        return arr [k - 1];
    }
    public static void main (String [] args)
    {
        int [] arr = {2, 5, 8, 7, 6};
        int k = 2;
        System.out.println ("2nd Smallest Element in the array: " + KthSmallest (arr, k));
    }
}

/*
Time Complexity:
O (N log N)
Auxiliary Space:
O (1)
*/
