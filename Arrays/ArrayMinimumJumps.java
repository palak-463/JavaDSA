
/*
10) Minimum number of jumps to reach the end of an array:
Initialize the variables MaxReach, step, and jump to keep track of the maximum reachable index, the remaining steps at the current position, and the number of jumps taken, respectively.
Traverse the array and update the maximum reachable index based on the sum of the current index and its corresponding array value.
This helps determine how far the current jump can take us.
If the remaining steps for the current jump are exhausted, a new jump is initiated.
If the current index surpasses the maximum reachable index, indicating no further progress, -1 is returned meaning no solution is found.
*/

import java.io.*;
import java.util.*;
class ArrayMinimumJumps
{
    static int MinJumps (int [] arr)
    {
        if (arr [0] >=arr.length - 1)
        {
            return -1;
        }
        if (arr[0] == 0)
        {
            return -1;
        }
        int MaxReach = arr [0];
        int step = arr [0];
        int jump = 1;
        for (int i = 1; i < arr.length; i ++)
        {
            if (i == arr.length - 1)
            {
                return jump;
            }
            if (arr[i] >= (arr.length - 1) - i)
            {
                return jump + 1;
            }
            MaxReach = Math.max(MaxReach, i + arr[i]);
            step--;
            if (step == 0)
            {
                jump++;
                if (i >= MaxReach)
                {
                    return -1;
                }
                step = MaxReach - i;
            }
        }
        return -1;
    }
    public static void main (String [] args)
    {
        int [] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println (MinJumps (arr));
    }
}

/*
Time complexity:
O (N)
only one traversal of the array is needed.
Auxiliary Space:
O (1)
there is minimal space required.
*/
