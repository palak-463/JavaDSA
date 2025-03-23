
/*
21) Subarray with sum zero using Hashing:
Declare a variable sum, to store the sum of prefix elements.
Traverse the array and at each index, add the element into the sum and check if this sum exists earlier.
If the sum exists, then return true.
Also, insert every prefix sum into a map, so that later on it can be found whether the current sum is seen before or not.
At the end return false, as no such subarray is found.
*/

import java.io.*;
import java.util.*;
class ArrayZeroSumSubarray
{
    static boolean ZeroSum (int [] arr)
    {
        Set <Integer> hash = new HashSet <Integer> ();
        int sum = 0;
        for (int i = 0; i < arr.length; i ++)
        {
            sum += arr [i];
            if (arr [i] == 0 || hash.contains (sum) || sum == 0)
            {
                return true;
            }
            hash.add (sum);
        }
        return false;
    }
    public static void main (String [] args)
    {
        int [] arr = {4, 2, -3, 1, 6};
        if (ZeroSum (arr))
        {
            System.out.println ("Found a subarray with sum 0.");
        }
        else
        {
            System.out.println ("No subarray with sum 0 exists.");
        }
    }
}

/*
Time Complexity:
O (N),
under the assumption that a good hashing function is used, that allows insertion and retrieval operations in O(1) time.
Auxiliary Space:
O (N),
here extra space is required for hashing.
*/
