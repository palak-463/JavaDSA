
/*
5) Move all the negative numbers in the beginning of the array and positive numbers towards the end using two pointers:
The idea is to solve this problem with constant space and linear time is by using a two-pointer or two-variable approach where we simply take two variables like left and right which hold the 0 and N - 1 indexes.
Check if the left and right pointer elements are negative then simply increment the left pointer.
Otherwise, if the left element is positive and the right element is negative then simply swap the elements, and simultaneously increment and decrement the left and right pointers.
Else if the left element is positive and the right element is also positive then simply decrement the right pointer.
Repeat the above steps until the left pointer is less than the right pointer.
*/

import java.io.*;
import java.util.*;
class ArrayNegativeBeginningPositiveEnding
{
    static void Shift (int [] arr, int left, int right)
    {
        while (left <= right)
        {
            if (arr [left] < 0 && arr [right] < 0)
            {
                left ++;
            }
            else if (arr [left] > 0 && arr [right] < 0)
            {
                int temp = arr [left];
                arr [left] = arr [right];
                arr [right] = temp;
                left ++;
                right --;
            }
            else if (arr [left] > 0 && arr [right] > 0)
            {
                right --;
            }
            else
            {
                left ++;
                right --;
            }
        }
    }
    static void Display (int [] arr, int right)
    {
        for (int i = 0; i <= right; i ++)
        {
            System.out.print (arr [i] + " ");
        }
    }
    public static void main (String [] args)
    {
        int [] arr = { -12, 11, -13, -5, 6, -7, 5, -3, 11 };
        int arr_size = arr.length;
        Shift (arr, 0, arr_size - 1);
        Display (arr, arr_size - 1);
    }
}

/*
Time Complexity:
O (N)
Auxiliary Space:
O (1)
*/
