
/*
16) Inversion Count in an array using Merge Sort:
The idea is similar to merge sort, divide the array into two equal or almost equal halves in each step until the base case is reached.
Create a function merge that counts the number of inversions when two halves of the array are merged.
Create two indices i and j, i is the index for the first half, and j is an index of the second half.
If a [i] is greater than a [j], then there are (mid – i) inversions because left and right subarrays are sorted, so all the remaining elements in left-subarray (a [i + 1], a [i + 2] … a [mid]) will be greater than a [j].
Create a recursive function to divide the array into halves and find the answer by summing the number of inversions in the first half, the number of inversions in the second half and the number of inversions by merging the two.
The base case of recursion is when there is only one element in the given half.
Print the answer.
*/

import java.io.*;
import java.util.*;
class ArrayInversionCount
{
    static int MergeAndCount (int [] arr, int l, int m, int r)
    {
        int [] left = Arrays.copyOfRange (arr, l, m + 1);
        int [] right = Arrays.copyOfRange (arr, m + 1, r +1);
        int i = 0, j =0, k = l, swaps =0;
        while (i < left.length && j < right.length)
        {
            if (left [i] <= right [j])
            {
                arr [k ++] = left [i ++];
            }
            else
            {
                arr [k ++] = right [j ++];
                swaps += (m + 1) - (l + i);
            }
        }
        while (i < left.length)
        {
            arr [k ++] = left [i ++];
        }
        while (j < right.length)
        {
            arr [k ++] = right [j ++];
        }
        return swaps;
    }
    static int MergeSort (int [] arr, int l, int r)
    {
        int count = 0;
        if (l < r)
        {
            int m = (l + r) / 2;
            count += MergeSort (arr, l, m);
            count += MergeSort (arr, m + 1, r);
            count += MergeAndCount (arr, l, m, r);
        }
        return count;
    }
    public static void main (String [] args)
    {
        int [] arr = {1, 20, 6, 4, 5};
        System.out.println ("Inversion Count: " + MergeSort (arr, 0, arr.length - 1));
    }
}

/*
Time Complexity:
O (N * log N),
the algorithm used is divide and conquer i.e. merge sort.
Auxiliary Space:
O (N)
*/
