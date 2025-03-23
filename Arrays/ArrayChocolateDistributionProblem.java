
/*
30) Chocolate Distribution Problem:
Given an array of n integers where each value represents the number of chocolates in a packet.
Each packet can have a variable number of chocolates.
There are m students, the task is to distribute chocolate packets such that each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
The idea is based on the observation that to minimize the difference, we must choose consecutive elements from a sorted packet.
First sort the array arr [0 ... n - 1], then find the subarray of size m with the minimum difference between the last and first elements.
Initially sort the given array.
And declare a variable to store the minimum difference, and initialize it to int_max.
Let the variable be min_diff.
Find the subarray of size m such that the difference between the last (maximum in case of sorted) and first (minimum in case of sorted) elements of the subarray is minimum.
Run a loop from 0 to (n - m), where n is the size of the given array and m is the size of the subarray.
Calculate the maximum difference with the subarray and store it in diff = arr [highest index] – arr [lowest index].
Whenever we get a diff less than the min_diff, we will update the min_diff with diff.
*/

import java.io.*;
import java.util.*;
class ArrayChocolateDistributionProblem
{
    public static int chocolateDistribution (int [] arr, int m)
    {
        if (arr.length == 0 || m==0)
        {
            return 0;
        }
        Arrays.sort (arr);
        if (arr.length - 1 < m)
        {
            return -1;
        }
        int min_diff = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i ++)
        {
            int nextWindow = i + m - 1;
            if (nextWindow >= arr.length)
            {
                break;
            }
            int diff = arr [nextWindow] - arr [i];
            min_diff = Math.min (min_diff, diff);
        }
        return min_diff;
    }
    public static void main (String [] args)
    {
        int [] arr = {12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50};
        int m = 7;
        int result = chocolateDistribution (arr, m);
        if (result != -1)
        {
            System.out.println ("Minimum difference is: " + result);
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }
}

/*
Time Complexity:
O (N * log (N))
Auxiliary Space:
O (1)
*/
