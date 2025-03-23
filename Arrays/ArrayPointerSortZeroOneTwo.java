
/*
4) Sort an array of 0s, 1s and 2s / Dutch National Flag problem:
Keep three indices low = 1, mid = 1, and high = N and there are four ranges, 1 to low (the range containing 0), low to mid (the range containing 1), mid to high (the range containing unknown elements) and high to N (the range containing 2).
Traverse the array from start to end and mid is less than high. (Loop counter is i).
If the element is 0 then swap the element with the element at index low and update low = low + 1 and mid = mid + 1.
If the element is 1 then update mid = mid + 1.
If the element is 2 then swap the element with the element at index high and update high = high – 1 and update i = i – 1.
As the swapped element is not processed.
Print the array.
*/

import java.io.*;
import java.util.*;
class ArrayPointerSortZeroOneTwo
{
    static void Sort (int [] a, int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0;
        int temp = 0;
        while (mid <= hi)
        {
            switch (a [mid])
            {
                case 0:
                    temp = a [lo];
                    a [lo] = a [mid];
                    a [mid] = temp;
                    lo ++;
                    mid ++;
                    break;
                case 1:
                    mid ++;
                    break;
                case 2:
                    temp = a [mid];
                    a [mid] = a [hi];
                    a [hi] = temp;
                    hi --;
                    break;
            }
        }
    }
    static void PrintArray (int [] arr, int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i ++)
        {
            System.out.print (arr [i] + " ");
        }
    }
    public static void main (String [] args)
    {
        int [] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int arr_size = arr.length;
        Sort (arr, arr_size);
        PrintArray (arr, arr_size);
    }
}

/*
Time Complexity:
O (N)
Only one traversal of the array is needed.
Space Complexity:
O (1)
No extra space is required.
*/
