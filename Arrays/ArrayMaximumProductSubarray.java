
/*
23) Maximum product subarray:
The idea is to traverse array from left to right keeping two variables minVal and maxVal which represents the minimum and maximum product value till the ith index of the array.
Now, if the ith element of the array is negative that means now the values of minVal and maxVal will be swapped as value of maxVal will become minimum by multiplying it with a negative number.
Now, compare the minVal and maxVal.
The value of minVal and maxVal depends on the current index element or the product of the current index element and the previous minVal and maxVal respectively.
*/

import java.io.*;
import java.util.*;
class ArrayMaximumProductSubarray
{
    static int MaxProduct (int [] arr, int n)
    {
        int MinVal = arr [0];
        int MaxVal = arr [0];
        int MaxProduct = arr [0];
        for (int i = 1; i < n; i ++)
        {
            if (arr [i] < 0)
            {
                int temp = MaxVal;
                MaxVal = MinVal;
                MinVal = temp;
            }
            MaxVal = Math.max (arr [i], MaxVal * arr [i]);
            MinVal = Math.min (arr [i], MinVal * arr [i]);
            MaxProduct = Math.max (MaxProduct, MaxVal);
        }
        return MaxProduct;
    }
    public static void main (String [] args)
    {
        int [] arr = {-1, -3, -10, 0, 60};
        int n = arr.length;
        System.out.println ("Maximum subarray product: " + MaxProduct(arr, n));
    }
}

/*
Time Complexity:
O (N)
Auxiliary Space:
O (1)
*/
