
/*
9) Minimize the maximum difference between the heights in an array:
Sort the array.
Try to make each height of the tower maximum by decreasing the height of all the towers to the right by k and increasing all the height of the towers to the left by k.
Check whether the current index tower has the maximum height or not by comparing it with a [n] - k.
If the tower’s height is greater than the a [n] - k then it’s the tallest tower available.
Similarly, find the shortest tower and minimize the difference between these two towers.
*/

import java.io.*;
import java.util.*;
class ArrayMinimizeMaximumDifference
{
    public static int Difference (int [] arr, int n, int k)
    {
        Arrays.sort (arr);
        int ans = arr [n -1] - arr [0];
        int tempmin = arr [0];
        int tempmax = arr [n - 1];
        for (int i = 1; i < n; i ++)
        {
            if (arr [i] - k < 0)
            {
                continue;
            }
            tempmin = Math.min (arr [0] + k, arr [i] - k);
            tempmax = Math.max (arr [i - 1] + k, arr [n - 1] - k);
            ans = Math.min(ans, tempmax - tempmin);
        }
        return ans;
    }
    public static void main (String [] args)
    {
        int [] arr = {7, 4, 8, 8, 8, 9};
        int k = 6;
        int ans = Difference (arr, arr.length, k);
        System.out.println (ans);
    }
}

/*
Time Complexity:
O (N * log (N)),
time is taken for sorting.
Auxiliary Space:
O (1)
*/
