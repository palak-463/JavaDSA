
 /*
1) Printing the elements of an array in a reverse order using a Loop and Two Pointers:
Iterate through the array using two pointers (start and end).
Swap elements at the start and end pointers.
Move the start pointer towards the end and the end pointer towards the start until they meet or cross each other.
*/

import java.io.*;
import java.util.*;
class ArrayReverseTwoPointer
{
    static void ReverseArray (int [] arr, int start, int end)
    {
        while (start < end)
        {
            int temp = arr [start];
            arr [start] = arr [end];
            arr [end] = temp;
            start ++;
            end --;
        }
    }
    static void PrintArray (int [] arr, int size)
    {
        for (int i = 0; i < size; i ++)
        {
            System.out.println (arr [i] + " ");
        }
    }
    public static void main (String [] args)
    {
        int [] arr = new int [] {1, 2, 3, 4, 5};
        ReverseArray (arr, 0, arr.length - 1);
        System.out.println ("Reversed Array: ");
        PrintArray (arr, 5);
    }
}

/*
Time Complexity:
O (N)
The loop runs through half of the array, so it’s linear with respect to the array size.
Auxiliary Space:
O (1)
In-place reversal, meaning it doesn’t use additional space.
*/
