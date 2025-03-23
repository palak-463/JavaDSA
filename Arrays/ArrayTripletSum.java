
/*
28) Find a triplet in an array which sums to the given value using two pointers:
Sort the given array.
Loop over the array and fix the first element of the possible triplet, arr [i].
Then fix two pointers, one at i + 1 and the other at n – 1, and look at the sum.
If the sum is smaller than the target value, increment the first pointer.
Else if the sum is bigger, decrease the end pointer to reduce the sum.
Else if the sum of elements at two-pointer is equal to target value, then print the triplet and break.
*/

import java.io.*;
import java.util.*;
class ArrayTripletSum
{
    static boolean findTriplet (int [] arr, int sum)
    {
        int n = arr.length;
        Arrays.sort (arr);
        for ( int i = 0; i < n - 2; i ++)
        {
            int l = i + 1;
            int r = n - 1;
            while ( l < r)
            {
                int currentSum = arr [i] + arr [l] + arr [r];
                if (currentSum == sum)
                {
                    System.out.println ("The triplet which accounts to the given value, i.e. " + sum + " is: " + arr [i] + ", " + arr [l] + ", " + arr [r] + ".");
                    return true;
                }
                else if ( currentSum < sum)
                {
                    l ++;
                }
                else
                {
                    r --;
                }
            }
        }
        return false;
    }
    public static void main (String [] args)
    {
        int [] arr = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        findTriplet (arr, sum);
    }
}

/*
Time complexity:
O (N ^ 2),
there are only two nested loops traversing the array, so time complexity is O (N ^ 2).
Two pointers algorithm takes O (N) time and the first element can be fixed using another nested traversal.
Auxiliary Space:
O (1),
as no extra space is required.
*/
